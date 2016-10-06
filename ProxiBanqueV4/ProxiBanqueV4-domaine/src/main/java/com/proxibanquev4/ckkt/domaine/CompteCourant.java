package com.proxibanquev4.ckkt.domaine;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Classe CompteCourant.java Represente les Comptes Courant des Clients de ProxiBanque
 * @author CKKT
 */
@Entity
@DiscriminatorValue("COURANT")
public class CompteCourant extends CompteBancaire {

	private double decouvertAutorise;

	
	// Constructeur de la classe CompteCourant
	
	/**
	 * Constructeur de la classe CompteCourant.java
	 * @param idCompte
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 * @param decouvertAutorise
	 */
	public CompteCourant(long idCompte, long numCompte, Date dateOuverture, double solde, Client proprietaire,
			double decouvertAutorise) {
		super(idCompte, numCompte, dateOuverture, solde, proprietaire);
		this.decouvertAutorise = decouvertAutorise;
	}

	/**
	 * Constructeur de la classe CompteCourant.java
	 * @param idCompte
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 */
	public CompteCourant(long idCompte, long numCompte, Date dateOuverture, double solde, Client proprietaire) {
		super(idCompte, numCompte, dateOuverture, solde, proprietaire);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe CompteCourant.java
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 * @param decouvertAutorise
	 */
	public CompteCourant(long numCompte, Date dateOuverture, double solde, Client proprietaire,
			double decouvertAutorise) {
		super(numCompte, dateOuverture, solde, proprietaire);
		this.decouvertAutorise = decouvertAutorise;
	}
	
	/**
	 * Constructeur de la classe CompteCourant.java
	 * @param numCompte
	 * @param dateOuverture
	 * @param solde
	 * @param proprietaire
	 */
	public CompteCourant(long numCompte, Date dateOuverture, double solde, Client proprietaire) {
		super(numCompte, dateOuverture, solde, proprietaire);
		// TODO Auto-generated constructor stub
	}
	
	
	// Getter et Setter de la classe CompteEpargne
	
	/**
	 * Méthode permettant d'obtenir le paramètre : decouvertAutorise
	 * @return decouvertAutorise
	 */
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	/**
	 * Méthode permettant de modifier le paramètre : decouvertAutorise
	 * @param decouvertAutorise le paramètre decouvertAutorise à modifier
	 */
	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}

}
