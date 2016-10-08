package com.proxibanquev4.ckkt.service;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.proxibanquev4.ckkt.dao.IConseillerDao;
import com.proxibanquev4.ckkt.domaine.Conseiller;

@ManagedBean(name = "conseillerService")
@ApplicationScoped
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
		return dao.findByLogin(login);
		
//		List<Conseiller> listeConseiller = dao.findByLogin(login);
//		if (listeConseiller.isEmpty()) {
//			return null;
//		} else {
//			return listeConseiller.get(0);
//		}
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
