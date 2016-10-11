package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.service.ConseillerService;

public class ListeComptesBean  implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Client> listeClients;
	private List<CompteBancaire> listeComptesClientI;
	private List<CompteBancaire> listeComptes;
	CompteBancaire compte;
	
	@Inject
	private ConseillerService conseillerService;
	

	@Inject
	MenuConseillerBean menuConseillerBean;

	@PostConstruct
	public void init() {

	}

	public void refresh() {
		CompteBancaire compte;
		long IdPersonne = menuConseillerBean.conseiller.getIdPersonne();
		Conseiller conseiller = conseillerService.lireConseiller(IdPersonne);
		listeClients = conseiller.getClients();
		for (int i = 0; i < listeClients.size(); i++) {
			listeComptesClientI = listeClients.get(i).getComptes();
			for (int j = 0; j < listeComptesClientI.size(); j++) {
				compte = listeComptesClientI.get(j);
				listeComptes.add(compte);
			}
			
		}
	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	public List<CompteBancaire> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(List<CompteBancaire> listeComptes) {
		this.listeComptes = listeComptes;
	}

	public CompteBancaire getCompte() {
		return compte;
	}

	public void setCompte(CompteBancaire compte) {
		this.compte = compte;
	}

	public ConseillerService getConseillerService() {
		return conseillerService;
	}

	public void setConseillerService(ConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}
	
	
	
}
