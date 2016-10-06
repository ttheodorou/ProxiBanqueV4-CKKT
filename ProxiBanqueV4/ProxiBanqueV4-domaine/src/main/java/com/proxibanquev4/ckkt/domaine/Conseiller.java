package com.proxibanquev4.ckkt.domaine;

/**
 * Classe Conseiller.java Represente
 * @author CKKT
 */
public class Conseiller extends User {

	private final String role = "conseiller";

	// Constructeur de la classe Conseiller
	
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
	public Conseiller(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * Constructeur de la classe Conseiller.java
	 */
	public Conseiller() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// Getter de la classe Conseiller
	
	/**
	 * Méthode permettant d'obtenir le paramètre : role
	 * @return role
	 */
	public String getRole() {
		return role;
	}

}
