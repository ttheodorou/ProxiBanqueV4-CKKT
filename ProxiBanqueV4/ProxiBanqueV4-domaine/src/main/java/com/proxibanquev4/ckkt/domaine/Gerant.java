package com.proxibanquev4.ckkt.domaine;

/**
 * Classe Gerant.java Represente
 * @author CKKT
 */
public class Gerant extends User {

	private final String role = "gerant";

	// Constructeur de la classe Gerant

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
	public Gerant(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe Gerant.java
	 */
	public Gerant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// Getter et Setter de la classe Gerant
	
	/**
	 * Méthode permettant d'obtenir le paramètre : role
	 * @return role
	 */
	public String getRole() {
		return role;
	}
	
}
