package com.proxibanquev4.ckkt.domaine;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Classe CompteEpargne.java Represente les Comptes Epargnes des Clients de ProxiBanque
 * @author CKKT
 */
@Entity
@DiscriminatorValue("EPARGNE")
public class CompteEpargne extends CompteBancaire {

	private double tauxRemuneration;
	
	
	// Constructeur de la classe CompteEpargne
	
	/**
	 * Constructeur de la classe CompteEpargne.java
	 * @param idCompte
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 * @param tauxRemuneration
	 */
	public CompteEpargne(long idCompte, long numCompte, Date dateOuverture, double solde, Client proprietaire,
			double tauxRemuneration) {
		super(idCompte, numCompte, dateOuverture, solde, proprietaire);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Constructeur de la classe CompteEpargne.java
	 * @param idCompte
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 */
	public CompteEpargne(long idCompte, long numCompte, Date dateOuverture, double solde, Client proprietaire) {
		super(idCompte, numCompte, dateOuverture, solde, proprietaire);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe CompteEpargne.java
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 * @param tauxRemuneration
	 */
	public CompteEpargne(long numCompte, Date dateOuverture, double solde, Client proprietaire,
			double tauxRemuneration) {
		super(numCompte, dateOuverture, solde, proprietaire);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Constructeur de la classe CompteEpargne.java
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 */
	public CompteEpargne(long numCompte, Date dateOuverture, double solde, Client proprietaire) {
		super(numCompte, dateOuverture, solde, proprietaire);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur de la classe CompteEpargne.java
	 */
	public CompteEpargne() {
		super();
	}
	
	
	// Getter et Setter de la classe CompteEpargne
	

	/**
	 * Méthode permettant d'obtenir le paramètre : tauxRemuneration
	 * @return tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Méthode permettant de modifier le paramètre : tauxRemuneration
	 * @param tauxRemuneration le paramètre tauxRemuneration à modifier
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
