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
import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.service.ClientService;
import com.proxibanquev4.ckkt.service.ConseillerService;

@ManagedBean(name = "ListConseillersAgence")
@ViewScoped
@Component
public class ListeConseillersAgenceBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Conseiller> listeConseillersAgence;

	@Inject
	private ConseillerService conseillerService;

	@PostConstruct
	public void init() {
		listeConseillersAgence = (ArrayList<Conseiller>) conseillerService.lireTousConseillers();
	}

	public void refresh() {
		listeConseillersAgence = (ArrayList<Conseiller>) conseillerService.lireTousConseillers();
	}

	
	public ConseillerService getConseillerService() {
		return conseillerService;
	}

	public void setConseillerService(ConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}

	public List<Conseiller> getListeConseillersAgence() {
		return listeConseillersAgence;
	}

	public void setListeConseillersAgence(List<Conseiller> listeConseillersAgence) {
		this.listeConseillersAgence = listeConseillersAgence;
	}

}
