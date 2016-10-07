package com.proxibanquev4.ckkt.domaine;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

/**
 * Classe User.java Represente
 * @author CKKT
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "role")
@DiscriminatorValue("user")
public abstract class User {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long idPersonne;
	
	private String nom;
	private String prenom;
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
		this.nom = nom;
		this.prenom = prenom;
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
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}

	/**
	 * Constructeur de la classe User.java
	 * @param nom
	 * @param prenom
	 */
	public User(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe User.java
	 * @param nom
	 */
	public User(String login) {
		this.login = login;
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

	/**
	 * Méthode permettant d'obtenir le paramètre : idPersonne
	 * @return idPersonne
	 */
	public long getIdPersonne() {
		return idPersonne;
	}

	/**
	 * Méthode permettant de modifier le paramètre : idPersonne
	 * @param idPersonne le paramètre idPersonne à modifier
	 */
	public void setIdPersonne(long idPersonne) {
		this.idPersonne = idPersonne;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Méthode permettant de modifier le paramètre : nom
	 * @param nom le paramètre nom à modifier
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : prenom
	 * @return prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Méthode permettant de modifier le paramètre : prenom
	 * @param prenom le paramètre prenom à modifier
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : clients
	 * @return clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/**
	 * Méthode permettant de modifier le paramètre : clients
	 * @param clients le paramètre clients à modifier
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	
}
