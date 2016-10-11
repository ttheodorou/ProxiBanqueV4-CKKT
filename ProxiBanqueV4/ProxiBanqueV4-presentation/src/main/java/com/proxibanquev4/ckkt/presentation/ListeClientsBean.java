package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.service.ClientService;
import com.proxibanquev4.ckkt.service.ConseillerService;

@ManagedBean(name = "listeClientsBean")
@ViewScoped
@Component
public class ListeClientsBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Client> listeClients;

	// @Inject
	// private ClientService clientService;

	@Inject
	MenuConseillerBean menuConseillerBean;
	
	@Inject
	ConseillerService conseillerService;
	@Inject
	ClientService clientService;

	@PostConstruct
	public void init() {

	}

	public void refresh() {
		long idPersonne = menuConseillerBean.conseiller.getIdPersonne();
		Conseiller conseiller = conseillerService.lireConseiller(idPersonne);
//		listeClients = clientService.lireTousClientsByConseiller(conseiller);
//		listeClients = clientService.lireTousClients(idPersonne);
		listeClients = conseiller.getClients();
	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	// public ClientService getClientService() {
	// return clientService;
	// }
	//
	// public void setClientService(ClientService clientService) {
	// this.clientService = clientService;
	// }

}
