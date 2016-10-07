package com.proxibanquev4.ckkt.service;

import javax.inject.Inject;

import com.proxibanquev4.ckkt.dao.ITransactionDao;
import com.proxibanquev4.ckkt.domaine.Transaction;

public class TransactionService {
	
	@Inject
	ITransactionDao dao;
	
	public void creerTransaction(Transaction transaction) {
		dao.save(transaction);		
	}

}
