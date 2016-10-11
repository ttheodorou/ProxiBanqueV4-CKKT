package com.proxibanquev4.ckkt.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.domaine.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Classe de service qui identifie tous les clients a decouvert de la banque à travers un webservice.
 * @author CKKT
 *
 */

@Service
public class ClientsADecouvertService {
	
	@Inject
	IClientDao dao;
	
	public List<Client> lireTousDecouverts() {
		
		List<Client> clientsADecouvert = new ArrayList<Client>();
		
		try {

			com.sun.jersey.api.client.Client client = com.sun.jersey.api.client.Client.create();

			WebResource webResource = client
					.resource("http://localhost:8080/RESTfulWS/rest/clientsadecouvert/getall");

			ClientResponse response = webResource.accept("")
					.get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			String output = response.getEntity(String.class);
			
			ObjectMapper mapper = new ObjectMapper();
			
			List<Long> idsClientsADebit = (List<Long>) mapper.readValue(output, Object.class);
			
			for (int i = 0; i != idsClientsADebit.size(); i++) {
				clientsADecouvert.add(dao.findOne(idsClientsADebit.get(i)));
			}

			

		} catch (Exception e) {

			e.printStackTrace();

		}
		
		return clientsADecouvert;

	}

}
