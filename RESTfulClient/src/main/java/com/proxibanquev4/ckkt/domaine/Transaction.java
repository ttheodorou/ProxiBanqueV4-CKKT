package com.proxibanquev4.ckkt.domaine;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Classe Transaction.java Represente les Transactions bancaires effectuées au sein de ProxiBanque
 * @author CKKT
 */
@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idTransaction;
	
	@ManyToOne
	private CompteBancaire compteCrediteur;
	
	@ManyToOne
	private CompteBancaire compteDebiteur;
	
	private Date dateTransaction;
	private double montant;
	
	
	// Constructeur de la classe Transaction
	
	/**
	 * Constructeur de la classe Transaction.java
	 * @param idTransaction
	 * @param compteCrediteur
	 * @param compteDebiteur
	 * @param dateTransaction
	 * @param montant
	 */
	public Transaction(long idTransaction, CompteBancaire compteCrediteur, CompteBancaire compteDebiteur,
			Date dateTransaction, double montant) {
		super();
		this.idTransaction = idTransaction;
		this.compteCrediteur = compteCrediteur;
		this.compteDebiteur = compteDebiteur;
		this.dateTransaction = dateTransaction;
		this.montant = montant;
	}


	
	/**
	 * Constructeur de la classe Transaction.java
	 * @param compteCrediteur
	 * @param compteDebiteur
	 * @param dateTransaction
	 * @param montant
	 */
	public Transaction(CompteBancaire compteCrediteur, CompteBancaire compteDebiteur, Date dateTransaction,
			double montant) {
		super();
		this.compteCrediteur = compteCrediteur;
		this.compteDebiteur = compteDebiteur;
		this.dateTransaction = dateTransaction;
		this.montant = montant;
	}

	/**
	 * Constructeur de la classe Transaction.java
	 */
	public Transaction() {
		super();
	}

	
	// Getter et Setter de la classe Transaction
	
	/**
	 * Méthode permettant d'obtenir le paramètre : idTransaction
	 * @return idTransaction
	 */
	public long getIdTransaction() {
		return idTransaction;
	}



	
	/**
	 * Méthode permettant de modifier le paramètre : idTransaction
	 * @param idTransaction le paramètre idTransaction à modifier
	 */
	public void setIdTransaction(long idTransaction) {
		this.idTransaction = idTransaction;
	}



	
	/**
	 * Méthode permettant d'obtenir le paramètre : compteCrediteur
	 * @return compteCrediteur
	 */
	public CompteBancaire getCompteCrediteur() {
		return compteCrediteur;
	}



	
	
	/**
	 * Méthode permettant de modifier le paramètre : compteCrediteur
	 * @param compteCrediteur le paramètre compteCrediteur à modifier
	 */
	public void setCompteCrediteur(CompteBancaire compteCrediteur) {
		this.compteCrediteur = compteCrediteur;
	}



	
	/**
	 * Méthode permettant d'obtenir le paramètre : compteDebiteur
	 * @return compteDebiteur
	 */
	public CompteBancaire getCompteDebiteur() {
		return compteDebiteur;
	}



	
	/**
	 * Méthode permettant de modifier le paramètre : compteDebiteur
	 * @param compteDebiteur le paramètre compteDebiteur à modifier
	 */
	public void setCompteDebiteur(CompteBancaire compteDebiteur) {
		this.compteDebiteur = compteDebiteur;
	}



	
	/**
	 * Méthode permettant d'obtenir le paramètre : dateTransaction
	 * @return dateTransaction
	 */
	public Date getDateTransaction() {
		return dateTransaction;
	}



	
	/**
	 * Méthode permettant de modifier le paramètre : dateTransaction
	 * @param dateTransaction le paramètre dateTransaction à modifier
	 */
	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}



	
	/**
	 * Méthode permettant d'obtenir le paramètre : montant
	 * @return montant
	 */
	public double getMontant() {
		return montant;
	}



	
	/**
	 * Méthode permettant de modifier le paramètre : montant
	 * @param montant le paramètre montant à modifier
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

}
