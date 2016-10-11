package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.service.ClientService;
import com.proxibanquev4.ckkt.service.CompteService;

@ManagedBean(name = "editionClientBean")
@ViewScoped
@Component
public class EditionClientBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	MenuConseillerBean menuConseillerBean;

	@Inject
	ClientService clientService;

	@Inject
	CompteService cptService;

	private List<Client> listeClients = new ArrayList<Client>();
	private List<CompteBancaire> listeDesComptes = new ArrayList<CompteBancaire>();
	private String client1;
	private Map<String, String> clientAChoisir;

	Client client = new Client();
	

	
	

	private Map<Client, Client> clientChoisi;

	private Map<String, Map<Client, Client>> data = new HashMap<String, Map<Client, Client>>();

	@PostConstruct
	public void init() {

	}

	public EditionClientBean() {

	}

	public void refresh() {

		listeClients = menuConseillerBean.conseiller.getClients();
		clientAChoisir = new HashMap<String, String>();
		clientChoisi = new HashMap<Client, Client>();
		client.setNom("en attente");

		int tailleListeDesClients = listeClients.size();

		for (int i = 0; i < tailleListeDesClients; i++) {
			String prenom = listeClients.get(i).getPrenom();
			String nom = listeClients.get(i).getNom();
			long id = listeClients.get(i).getIdPersonne();
			String prenomEtNom = prenom + " " + nom + ", id =" + String.valueOf(id);
			clientAChoisir.put(prenomEtNom, prenomEtNom);
			Map<Client, Client> map = new HashMap<Client, Client>();
			map.put(listeClients.get(i), listeClients.get(i));

			data.put(prenomEtNom, map);

		}

	}

	public void chargementDuClient() {
		String resultat;
		Long idPersonne;
		if (client1 != null && !client1.equals("")) {
			resultat = client1.substring(client1.lastIndexOf("=") + 1, client1.length());
			idPersonne = Long.parseLong(resultat);
			client = clientService.lireClient(idPersonne);
			
		}

		else
			client = new Client();
		client.setNom("en attente");
	}

	public MenuConseillerBean getMenuConseillerBean() {
		return menuConseillerBean;
	}

	public void setMenuConseillerBean(MenuConseillerBean menuConseillerBean) {
		this.menuConseillerBean = menuConseillerBean;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	public CompteService getCptService() {
		return cptService;
	}

	public void setCptService(CompteService cptService) {
		this.cptService = cptService;
	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	public List<CompteBancaire> getListeDesComptes() {
		return listeDesComptes;
	}

	public void setListeDesComptes(List<CompteBancaire> listeDesComptes) {
		this.listeDesComptes = listeDesComptes;
	}

	public String getClient1() {
		return client1;
	}

	public void setClient1(String client1) {
		this.client1 = client1;
	}

	public Map<String, String> getClientAChoisir() {
		return clientAChoisir;
	}

	public void setClientAChoisir(Map<String, String> clientAChoisir) {
		this.clientAChoisir = clientAChoisir;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Map<Client, Client> getClientChoisi() {
		return clientChoisi;
	}

	public void setClientChoisi(Map<Client, Client> clientChoisi) {
		this.clientChoisi = clientChoisi;
	}

	public Map<String, Map<Client, Client>> getData() {
		return data;
	}

	public void setData(Map<String, Map<Client, Client>> data) {
		this.data = data;
	}


	

}
