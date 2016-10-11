package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import org.primefaces.model.chart.Axis;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.springframework.stereotype.Component;
import com.proxibanquev4.ckkt.domaine.Transaction;
import com.proxibanquev4.ckkt.service.TransactionService;

@ManagedBean(name = "historiqueTransactionBean")
@ViewScoped
@Component
public class HistoriqueTransactionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Transaction> listeTransactionsAgence;
	
	private BarChartModel barModel;
	
	@Inject
	private TransactionService transactionService;

	@PostConstruct
	public void init() {
		createBarModel();
		listeTransactionsAgence = (ArrayList<Transaction>) transactionService.lireToutesTransactions();
	}

	public BarChartModel getBarModel() {
        return barModel;
    }
    private BarChartModel initBarModel() {
    	double total = 4520;
    	total = transactionService.montantTotal();
    	
    	BarChartModel model = new BarChartModel();
        ChartSeries transactions = new ChartSeries();
        
        transactions.setLabel("Total Transaction");
        transactions.set("année 2015", 0);
        transactions.set("année 2016", total);
        transactions.set("année 2017", 0);
        model.addSeries(transactions);
        return model;
    }
     
    private void createBarModel() {
        barModel = initBarModel();
         
        barModel.setTitle("Montant total des transactions de l'agence");
        barModel.setLegendPosition("ne");
         
        Axis xAxis = barModel.getAxis(AxisType.X);
        xAxis.setLabel("Temps");
         
        Axis yAxis = barModel.getAxis(AxisType.Y);
        yAxis.setLabel("Montant en Euros");
        yAxis.setMin(0);
        yAxis.setMax(10000);
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
