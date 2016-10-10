package com.proxibanquev4.ckkt.service;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.proxibanquev4.ckkt.dao.ITransactionDao;
import com.proxibanquev4.ckkt.domaine.Transaction;

//@ManagedBean(name = "transactionService")
//@ApplicationScoped
@Service
public class TransactionService {
	
	@Inject
	ITransactionDao dao;
	
	public void creerTransaction(Transaction transaction) {
		dao.save(transaction);		
	}

}
