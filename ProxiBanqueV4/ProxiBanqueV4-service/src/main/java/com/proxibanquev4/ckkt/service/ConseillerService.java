package com.proxibanquev4.ckkt.service;

import java.util.List;

import javax.inject.Inject;

import com.proxibanquev4.ckkt.dao.IConseillerDao;
import com.proxibanquev4.ckkt.domaine.Conseiller;

public class ConseillerService {
	
	@Inject
	IConseillerDao dao;
	
	public void creerConseiller(Conseiller conseiller) {
		dao.save(conseiller);
	}
	
	public Conseiller lireConseiller(long conseillerId) {
		return dao.findOne(conseillerId);
	}
	
	public Conseiller lireConseillerParLogin(String login) {
		List<Conseiller> listeConseiller = dao.findByLogin(login);
		if (listeConseiller.isEmpty()) {
			return null;
		} else {
			return listeConseiller.get(0);
		}
	}
	
	public List<Conseiller> lireTousConseillers() {
		return dao.findAll();
	}
	
	public void modifierConseiller(Conseiller conseillerModifie) {
		dao.save(conseillerModifie);				
	}
	
	public void supprimerConseiller(Conseiller conseillerASupprimer) {
		dao.delete(conseillerASupprimer);		
	}

}
