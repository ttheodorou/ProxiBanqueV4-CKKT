package com.proxibanquev4.ckkt.domaine;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * Classe User.java Represente
 * @author CKKT
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User extends Personne{

	private String login;
	private String password;
	
	@OneToMany(mappedBy = "conseiller")
	private List<Client> clients;
	
	// Constructeur de la classe User

	/**
	 * Constructeur de la classe User.java
	 * @param nom
	 * @param prenom
	 * @param login
	 * @param password
	 * @param clients
	 */
	public User(String nom, String prenom, String login, String password, List<Client> clients) {
		super(nom, prenom);
		this.login = login;
		this.password = password;
		this.clients = clients;
	}

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
