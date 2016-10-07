package com.proxibanquev4.ckkt.domaine;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Classe Conseiller.java Represente
 * @author CKKT
 */
@Entity
@DiscriminatorValue("CONSEILLER")
public class Conseiller extends User {

	// Constructeur de la classe Conseiller
	
	/**
	 * Constructeur de la classe Conseiller.java
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 * @param clients
	 */
	public Conseiller(String nom, String prenom, String login, String password, List<Client> clients) {
		super(nom, prenom, login, password, clients);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur de la classe Conseiller.java
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 */
	public Conseiller(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe Conseiller.java
	 * @param nom
	 * @param prenom
	 */
	public Conseiller(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe Conseiller.java
	 * @param nom
	 */
	public Conseiller(String login) {
		super(login);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur de la classe Conseiller.java
	 */
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

}
