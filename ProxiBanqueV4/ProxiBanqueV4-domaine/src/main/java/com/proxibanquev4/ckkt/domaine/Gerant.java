package com.proxibanquev4.ckkt.domaine;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Classe Gerant.java Represente
 * @author CKKT
 */
@Entity
@DiscriminatorValue("GERANT")
public class Gerant extends User {
	
	// Constructeur de la classe Gerant

	/**
	 * Constructeur de la classe Gerant.java
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 * @param clients
	 */
	public Gerant(String nom, String prenom, String login, String password, List<Client> clients) {
		super(nom, prenom, login, password, clients);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur de la classe Gerant.java
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 */
	public Gerant(String nom, String prenom, String login, String password) {
		super(nom, prenom, login, password);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe Gerant.java
	 * @param nom
	 * @param prenom
	 */
	public Gerant(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur de la classe Gerant.java
	 * @param nom
	 */
	public Gerant(String login) {
		super(login);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe Gerant.java
	 */
	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
