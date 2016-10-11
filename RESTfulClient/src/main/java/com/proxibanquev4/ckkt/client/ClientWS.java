package com.proxibanquev4.ckkt.client;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClientWS {

	public static void main(String[] args) {
		try {

			com.sun.jersey.api.client.Client client = Client.create();

			WebResource webResource = client
					.resource("http://localhost:8080/RESTfulWS/rest/json/metallica/qqc");

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
				System.out.println("id clien à débit : " + idsClientsADebit.get(i));
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}