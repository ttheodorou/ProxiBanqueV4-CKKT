package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.service.ClientService;

@ManagedBean(name = "listeClientsAgenceBean")
@ViewScoped
@Component
public class ListeClientsAgenceBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Client> listeClientsAgence;

	@Inject
	private ClientService clientService;

	@Inject
	MenuConseillerBean menuConseillerBean;

	@PostConstruct
	public void init() {

	}

	public void refresh() {
		listeClientsAgence = (ArrayList<Client>) clientService
				.lireTousClients(menuConseillerBean.conseiller.getIdPersonne());
	}

	public List<Client> getListeClients() {
		return listeClientsAgence;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClientsAgence = listeClients;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

}
