package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.proxibanquev4.ckkt.domaine.Adresse;
import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.service.ClientService;

@ManagedBean(name = "creerClientBean")
@ViewScoped
@Component
public class CreerClientBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Inject
	MenuConseillerBean menuConseillerBean;

	@Inject
	ClientService clientService;

	Client clientToCreate;
		
	@PostConstruct
	public void init() {

	}
	
	
	public CreerClientBean() {
		clientToCreate = new Client();
        clientToCreate.setPrenom("Choisir un prenom");
        clientToCreate.setNom("Choisir un nom");
        Adresse adresse = new Adresse();
        adresse.setNomRue("Choisir un nom de rue");
        adresse.setNumRue("Choisir un numéro de rue");
        adresse.setCodePostal(69003);
        adresse.setVille("Choisir une ville");
        clientToCreate.setAdresse(adresse);
        clientToCreate.setMail("Choisir un mail");
        clientToCreate.setTelephone("Choisir un num de telephone");
	}
	
	public void refresh() {
		clientToCreate = new Client();
        clientToCreate.setPrenom("Choisir un prenom");
        clientToCreate.setNom("Choisir un nom");
        Adresse adresse = new Adresse();
        adresse.setNomRue("Choisir un nom de rue");
        adresse.setNumRue("Choisir un numéro de rue");
        adresse.setCodePostal(69003);
        adresse.setVille("Choisir une ville");
        clientToCreate.setAdresse(adresse);
        clientToCreate.setMail("Choisir un mail");
        clientToCreate.setTelephone("Choisir un num de telephone");
	}


	public String validationCreation() {
		
		clientToCreate.setConseiller(menuConseillerBean.conseiller);
		clientService.creerClient(clientToCreate);
        return menuConseillerBean.navigateBean.redirectToListeClients();

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


	public Client getClientToCreate() {
		return clientToCreate;
	}


	public void setClientToCreate(Client clientToCreate) {
		this.clientToCreate = clientToCreate;
	}


	
	
	
	
	
}
