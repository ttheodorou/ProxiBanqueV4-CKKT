package com.proxibanquev4.ckkt.domaine;

/**
 * Classe User.java Represente
 * @author CKKT
 */
public abstract class User extends Personne{

	private String login;
	private String password;
	
	
	// Constructeur de la classe User

	/**
	 * Constructeur de la classe User.java
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 */
	public User(String nom, String prenom, String login, String password) {
		super(nom, prenom);
		this.login = login;
		this.password = password;
	}

	/**
	 * Constructeur de la classe User.java
	 * @param nom
	 * @param prenom
	 */
	public User(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe User.java
	 * @param nom
	 */
	public User(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructeur de la classe User.java
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// Getter et Setter de la classe User
	




	/**
	 * Méthode permettant d'obtenir le paramètre : login
	 * @return login
	 */
	public String getLogin() {
		return login;
	}


	
	/**
	 * Méthode permettant de modifier le paramètre : login
	 * @param login le paramètre login à modifier
	 */
	public void setLogin(String login) {
		this.login = login;
	}


	
	/**
	 * Méthode permettant d'obtenir le paramètre : password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}


	
	/**
	 * Méthode permettant de modifier le paramètre : password
	 * @param password le paramètre password à modifier
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
