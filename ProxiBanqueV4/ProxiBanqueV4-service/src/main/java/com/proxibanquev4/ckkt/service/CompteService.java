package com.proxibanquev4.ckkt.service;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.proxibanquev4.ckkt.dao.ICompteBancaireDao;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;

//@ManagedBean(name = "compteService")
//@ApplicationScoped
@Service
public class CompteService {
	
	@Inject
	ICompteBancaireDao dao;
	
	public void creerCompte(CompteBancaire compteACreer) {
		dao.save(compteACreer);
	}
	
	public CompteBancaire lireCompteParId(long idCompte) {
		return dao.findOne(idCompte);
	}
	
	public void modifierCompte(CompteBancaire compteModifie) {
		dao.save(compteModifie);		
	}
	
	public void supprimerCompte(CompteBancaire compteASupprimer) {
		dao.delete(compteASupprimer);
	}
	
	public void virement(CompteBancaire compteADebiter, CompteBancaire compteACrediter, double montant) {
		debiter(compteADebiter, montant);
		crediter(compteACrediter, montant);
	}
	
	public void crediter (CompteBancaire compteACrediter, double montant) {
		compteACrediter.setSolde(compteACrediter.getSolde() + montant);
		dao.save(compteACrediter);
	}

	public void debiter (CompteBancaire compteADebiter, double montant) {
		compteADebiter.setSolde(compteADebiter.getSolde() + montant);
		dao.save(compteADebiter);
	}
}
