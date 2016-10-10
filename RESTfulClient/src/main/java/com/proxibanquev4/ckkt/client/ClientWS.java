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
					.resource("http://localhost:8080/RESTfulWS/rest/json2/metallica/get");

			ClientResponse response = webResource.accept("")
					.get(ClientResponse.class);

			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ response.getStatus());
			}

			String output = response.getEntity(String.class);
			
			ObjectMapper mapper = new ObjectMapper();
			
			com.proxibanquev4.ckkt.domaine.Client entite = mapper.readValue(output, com.proxibanquev4.ckkt.domaine.Client.class);

			System.out.println("Output from Server .... \n");
			System.out.println(entite.getNom());

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}