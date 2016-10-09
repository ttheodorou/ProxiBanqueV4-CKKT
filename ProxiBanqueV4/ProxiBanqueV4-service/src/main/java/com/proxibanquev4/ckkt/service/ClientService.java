package com.proxibanquev4.ckkt.service;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.domaine.Client;

@ManagedBean(name = "clientService")
@ApplicationScoped
@Component
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
		return dao.findAll();
	}
	
	public void modifierClient(Client clientModifie) {
		dao.save(clientModifie);
	}
	
	public void supprimerClient(Client clientASupprimer) {
		dao.delete(clientASupprimer);
	}
}
