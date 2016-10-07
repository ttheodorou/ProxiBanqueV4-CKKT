package com.proxibanquev4.ckkt.service;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.proxibanquev4.ckkt.dao.IConseillerDao;
import com.proxibanquev4.ckkt.domaine.Conseiller;

public class ConseillerService {
	
	@Inject
	IConseillerDao dao;
	
	public void creerConseiller(Conseiller conseiller) {
		
	}
	
	public Conseiller lireConseiller(long conseillerId) {
		return null;
	}
	
	public Conseiller lireConseillerParLogin(String login) {
		return null;
	}
	
	public List<Conseiller> lireTousConseillers() {
		return new ArrayList<Conseiller>();
	}
	
	public void modifierConseiller(long conseillerId, Conseiller conseillerModifie) {
		
	}
	
	public void supprimerConseiller(long conseillerId) {
		
	}

}
