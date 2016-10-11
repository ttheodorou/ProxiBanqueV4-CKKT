package com.proxibanquev4.ckkt.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Classe Personne.java : Represente des personnes de ProxiBanque.
 * @author CKKT
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long idPersonne;
	

	private String nom;
	private String prenom;
	
	
	// Constructeur de la classe Personne
	
	/**
	 * Constructeur de la classe Personne.java
	 * @param idPersonne
	 * @param nom
	 * @param prenom
	 */
	public Personne(long idPersonne, String nom, String prenom) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Constructeur de la classe Personne.java
	 * @param nom
	 * @param prenom
	 */
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * Constructeur de la classe Personne.java
	 * @param nom
	 */
	public Personne(String nom) {
		super();
		this.nom = nom;
	}

	/**
	 * Constructeur de la classe Personne.java
	 */
	public Personne() {
		super();
	}

	
	// Getter et Setter de la classe Personne

	/**
	 * Méthode permettant d'obtenir l'ID de la personne
	 * @return
	 */
	public long getIdPersonne() {
		return idPersonne;
	}

	/**
	 * Méthode permettant de modifier l'ID de la personne
	 * @param idPersonne
	 */
	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}

	/**
	 * Méthode permettant d'obtenir le Nom de la personne
	 * @return
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Méthode permettant de modifier le Nom de la personne
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Méthode permettant d'obtenir le Prenom de la personne
	 * @return
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Méthode permettant de modifier le Prenom de la personne.
	 * @param prenom
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
}
