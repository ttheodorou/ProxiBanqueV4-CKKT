package com.proxibanquev4.ckkt.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.domaine.Client;

public class ClientService {
	
	@Inject
	IClientDao dao;
	
	public void creerClient(Client client) {
		dao.save(client);		
	}
	
	public Client lireClient(long clientId) {
		return dao.findOne(clientId);
	}
	
	public List<Client> lireTousClients(long idConseiller) {
		return new ArrayList<Client>();
	}
	
	public void modifierClient(long clientId, Client clientModifie) {
		
	}
	
	public void supprimerClient(long clientId) {
		
	}

}
