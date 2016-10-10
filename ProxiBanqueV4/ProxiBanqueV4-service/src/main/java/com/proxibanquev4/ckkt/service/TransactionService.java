package com.proxibanquev4.ckkt.service;

import java.util.Date;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.JoinPoint.StaticPart;
import org.springframework.stereotype.Service;

import com.proxibanquev4.ckkt.dao.ITransactionDao;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.domaine.Transaction;

//@ManagedBean(name = "transactionService")
//@ApplicationScoped
@Service
public class TransactionService {
	
	@Inject
	ITransactionDao dao;
	
	Transaction transaction = null;

	public void InitialiserTransaction(CompteBancaire compteDebiteur, CompteBancaire compteCrediteur, Double montant) {
		this.transaction.setCompteCrediteur(compteCrediteur);
		this.transaction.setCompteDebiteur(compteDebiteur);
		this.transaction.setMontant(montant);
		this.transaction.setDateTransaction(new Date());
	}
	
	public void creerTransaction() {
		dao.save(this.transaction);		
	}


	/* Cette méthode est appelée à chaque fois (et avant) qu'une méthode du
	 package com.objis.service est interceptée
	 */
	public void logMethodEntry(JoinPoint joinPoint) {
		Object[] args = joinPoint.getArgs();
		CompteBancaire compteDebiteur = (CompteBancaire) args[0];
		CompteBancaire compteCrediteur = (CompteBancaire) args[1];
		double montant = (Double) args[2];
		
		InitialiserTransaction(compteDebiteur, compteCrediteur, montant);
		System.out.println(this.transaction);
	}
	
	/* Cette méthode est appelée à chaque fois (et après) qu'une méthode du
	   package com.objis..service est interceptée. 'result' correspondant au retour de la méthode interceptée
	 */
	public void logMethodExit(StaticPart staticPart, Object result) {
		creerTransaction();
	}
}
