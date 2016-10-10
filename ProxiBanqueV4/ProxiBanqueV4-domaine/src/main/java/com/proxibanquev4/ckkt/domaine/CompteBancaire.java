package com.proxibanquev4.ckkt.domaine;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Classe CompteBancaire.java Represente les Comptes Bancaires des Clients de ProxiBanque
 * @author CKKT
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_COMPTE")
@DiscriminatorValue("MERE")
public abstract class CompteBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idCompte;
	private long numCompte;
	private Date dateOuverture;
	private double solde;

	@ManyToOne
	private Client proprietaire;

	
	// Constructeur de la classe CompteBancaire
	
	/**
	 * Constructeur de la classe CompteBancaire.java
	 * @param idCompte
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 */
	public CompteBancaire(long idCompte, long numCompte, Date dateOuverture, double solde, Client proprietaire) {
		super();
		this.idCompte = idCompte;
		this.numCompte = numCompte;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.proprietaire = proprietaire;
	}

	/**
	 * Constructeur de la classe CompteBancaire.java
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 */
	public CompteBancaire(long numCompte, Date dateOuverture, double solde, Client proprietaire) {
		super();
		this.numCompte = numCompte;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.proprietaire = proprietaire;
	}
	
	/**
	 * Constructeur de la classe CompteBancaire.java
	 */
	public CompteBancaire() {
		super();
	}
	
	
	// Getter et Setter de la classe CompteBancaire
	
	/**
	 * Méthode permettant d'obtenir le paramètre : idCompte
	 * @return idCompte
	 */
	public long getIdCompte() {
		return idCompte;
	}

	/**
	 * Méthode permettant de modifier le paramètre : idCompte
	 * @param idCompte le paramètre idCompte à modifier
	 */
	public void setIdCompte(long idCompte) {
		this.idCompte = idCompte;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : numCompte
	 * @return numCompte
	 */
	public long getNumCompte() {
		return numCompte;
	}
	
	/**
	 * Méthode permettant de modifier le paramètre : numCompte
	 * @param numCompte le paramètre numCompte à modifier
	 */
	public void setNumCompte(long numCompte) {
		this.numCompte = numCompte;
	}
	
	/**
	 * Méthode permettant d'obtenir le paramètre : dateOuverture
	 * @return dateOuverture
	 */
	public Date getDateOuverture() {
		return dateOuverture;
	}
	
	/**
	 * Méthode permettant de modifier le paramètre : dateOuverture
	 * @param dateOuverture le paramètre dateOuverture à modifier
	 */
	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	/**
	 * Méthode permettant d'obtenir le paramètre : solde
	 * @return solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/**
	 * Méthode permettant de modifier le paramètre : solde
	 * @param solde le paramètre solde à modifier
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : proprietaire
	 * @return proprietaire
	 */
	public Client getProprietaire() {
		return proprietaire;
	}
	
	/**
	 * Méthode permettant de modifier le paramètre : proprietaire
	 * @param proprietaire le paramètre proprietaire à modifier
	 */
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}
	
}
