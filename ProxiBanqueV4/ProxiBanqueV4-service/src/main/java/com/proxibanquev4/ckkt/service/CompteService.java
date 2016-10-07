package com.proxibanquev4.ckkt.service;

import javax.inject.Inject;

import com.proxibanquev4.ckkt.domaine.CompteBancaire;

public class CompteService {
	
//	@Inject
//	ICompteDAO compteDAO;
//	
	public void creerCompte(CompteBancaire compteACreer) {
		
	}
	
	public void supprimerCompte(CompteBancaire compteACreer) {
		
	}
	
	public boolean virement(CompteBancaire compteADebiter, CompteBancaire compteACrediter, double montant) {
		debiter(compteADebiter, montant);
		crediter(compteACrediter, montant);
		return true;
	}
	
	public boolean crediter (CompteBancaire compteACrediter, double montant) {
//		CompteBancaire compte = lireCompte(noCompteACrediter);
//		updateSolde(noCompteACrediter, compte.getSolde() - montant);
		return false;
	}

	public boolean debiter (CompteBancaire compteADebiter, double montant) {
		return false;
	}
}
