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
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.service.ConseillerService;

@ManagedBean(name = "listeComptesBean")
@ViewScoped
@Component
public class ListeComptesBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Client> listeClients;
	private List<CompteBancaire> listeComptesClientI;

	private List<CompteBancaire> listeComptes = new ArrayList<CompteBancaire>();

	CompteBancaire compte;

	@Inject
	ConseillerService conseillerService;

	@Inject
	MenuConseillerBean menuConseillerBean;

	@PostConstruct
	public void init() {

	}

	public void refresh() {
		int k = 0;
		long IdPersonne = menuConseillerBean.conseiller.getIdPersonne();
		Conseiller conseiller = conseillerService.lireConseiller(IdPersonne);
		listeClients = conseiller.getClients();
		// for (int i = 0; i < listeClients.size(); i++) {
		// listeComptesClientI = listeClients.get(i).getComptes();
		// for (int j = 0; j < listeComptesClientI.size(); j++) {
		// compte = listeComptesClientI.get(j);
		// listeComptes.add(compte);
		//
		// }
		//
		// }
		// System.out.println(listeComptes.size());
		while (k < listeClients.size()) {
			int l = 0;

			listeComptesClientI = listeClients.get(k).getComptes();
			while (l < listeComptesClientI.size()) {
				listeComptesClientI = listeClients.get(k).getComptes();
				compte = listeComptesClientI.get(l);
				listeComptes.add(compte);
				l++;
			}
			k++;
		}
		System.out.println(listeComptes.size());
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
