package com.proxibanquev4.ckkt.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.proxibanquev4.ckkt.dao.IConseillerDao;
import com.proxibanquev4.ckkt.domaine.Client;

public class ClientService {
	
	@Inject
	IConseillerDao dao;
	
	public void creerClient(Client client) {
		
	}
	
	public Client lireClient(long clientId) {
		return null;
	}
	
	public List<Client> lireTousClients(long idConseiller) {
		return new ArrayList<Client>();
	}
	
	public void modifierClient(long clientId, Client clientModifie) {
		
	}
	
	public void supprimerClient(long clientId) {
		
	}

}
