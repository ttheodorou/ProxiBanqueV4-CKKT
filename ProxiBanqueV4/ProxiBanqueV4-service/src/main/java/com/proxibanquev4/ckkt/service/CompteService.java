package com.proxibanquev4.ckkt.service;

public class CompteService {
	
//	CompteDAO compteDAO = new CompteDAO();
	
	public boolean virement(long noCompteADebiter, long noCompteACrediter, double montant) {
		debiter(noCompteADebiter, montant);
		crediter(noCompteACrediter, montant);
		return true;
	}
	
	public boolean crediter (long noCompteACrediter, double montant) {
//		CompteBancaire compte = lireCompte(noCompteACrediter);
//		updateSolde(noCompteACrediter, compte.getSolde() - montant);
		return false;
	}

	public boolean debiter (long noCompteADebiter, double montant) {
		return false;
	}
}
