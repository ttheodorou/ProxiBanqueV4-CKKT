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
	
	public void creerTransaction(CompteBancaire compteDebiteur, CompteBancaire compteCrediteur, double montant) {
		Transaction transaction = new Transaction();
		transaction.setCompteCrediteur(compteCrediteur);
		transaction.setCompteDebiteur(compteDebiteur);
		transaction.setMontant(montant);
		transaction.setDateTransaction(new Date());
		dao.save(transaction);		
	}

}
