package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.springframework.stereotype.Component;
import com.proxibanquev4.ckkt.domaine.Transaction;
import com.proxibanquev4.ckkt.service.TransactionService;

@ManagedBean(name = "historiqueTransactionBean")
@ViewScoped
@Component
public class HistoriqueTransactionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Transaction> listeTransactionsAgence;

	@Inject
	private TransactionService transactionService;

	@PostConstruct
	public void init() {
	}

	public void refresh() {
		listeTransactionsAgence = (ArrayList<Transaction>) transactionService.lireToutesTransactions();
	}

	public List<Transaction> getListeTransactions() {
		return listeTransactionsAgence;
	}

	public void setListeTransactions(List<Transaction> listeTransactions) {
		this.listeTransactionsAgence = listeTransactions;
	}

	public TransactionService getTransactionService() {
		return transactionService;
	}

	public void setTransactionService(TransactionService transactionService) {
		this.transactionService = transactionService;
	}

	public List<Transaction> getListeTransactionsAgence() {
		return listeTransactionsAgence;
	}

	public void setListeTransactionsAgence(List<Transaction> listeTransactionsAgence) {
		this.listeTransactionsAgence = listeTransactionsAgence;
	}
	

}
