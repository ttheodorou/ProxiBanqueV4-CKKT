package com.proxibanquev4.ckkt.domaine;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 * Classe Client.java hérite de Personne et Represente les Clients de la banque ProxiBanque
 * @author CKKT
 */
public class Client extends Personne {

	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Adresse adresse;
	
	private String telephone;
	private String mail;
	
	@ManyToOne
	private User conseiller;
	
	@OneToMany(mappedBy="proprietaire", fetch=FetchType.EAGER)
	private List<CompteBancaire> comptes;


	// Constructeur de la classe Client

	/**
	 * Constructeur de la classe Client.java
	 * @param idPersonne
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param mail
	 * @param conseiller
	 * @param comptes
	 */
	public Client(long idPersonne, String nom, String prenom, Adresse adresse, String telephone, String mail,
			User conseiller, List<CompteBancaire> comptes) {
		super(idPersonne, nom, prenom);
		this.adresse = adresse;
		this.telephone = telephone;
		this.mail = mail;
		this.conseiller = conseiller;
		this.comptes = comptes;
	}
	
	/**
	 * Constructeur de la classe Client.java
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param mail
	 * @param conseiller
	 * @param comptes
	 */
	public Client(String nom, String prenom, Adresse adresse, String telephone, String mail, User conseiller,
			List<CompteBancaire> comptes) {
		super(nom, prenom);
		this.adresse = adresse;
		this.telephone = telephone;
		this.mail = mail;
		this.conseiller = conseiller;
		this.comptes = comptes;
	}
	

	/**
	 * Constructeur de la classe Client.java
	 * @param nom
	 * @param prenom
	 * @param telephone
	 * @param mail
	 * @param conseiller
	 * @param comptes
	 */
	public Client(String nom, String prenom, String telephone, String mail, User conseiller,
			List<CompteBancaire> comptes) {
		super(nom, prenom);
		this.telephone = telephone;
		this.mail = mail;
		this.conseiller = conseiller;
		this.comptes = comptes;
	}
	

	/**
	 * Constructeur de la classe Client.java
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param conseiller
	 * @param comptes
	 */
	public Client(String nom, String prenom, String mail, User conseiller, List<CompteBancaire> comptes) {
		super(nom, prenom);
		this.mail = mail;
		this.conseiller = conseiller;
		this.comptes = comptes;
	}
	

	/**
	 * Constructeur de la classe Client.java
	 * @param nom
	 * @param prenom
	 * @param conseiller
	 * @param comptes
	 */
	public Client(String nom, String prenom, User conseiller, List<CompteBancaire> comptes) {
		super(nom, prenom);
		this.conseiller = conseiller;
		this.comptes = comptes;
	}
	

	/**
	 * Constructeur de la classe Client.java
	 * @param nom
	 * @param prenom
	 * @param conseiller
	 * @param comptes
	 */
	public Client(String nom, String prenom, User conseiller) {
		super(nom, prenom);
		this.conseiller = conseiller;
	}
	

	/**
	 * Constructeur de la classe Client.java
	 * @param nom
	 * @param prenom
	 */
	public Client(String nom, String prenom) {
		super(nom, prenom);
		// TODO Auto-generated constructor stub
	}


	/**
	 * Constructeur de la classe Client.java
	 * @param nom
	 */
	public Client(String nom) {
		super(nom);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Constructeur de la classe Client.java
	 */
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	// Getter et Setter de la classe Client
	
	/**
	 * Méthode permettant d'obtenir le paramètre : adresse
	 * @return adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	
	/**
	 * Méthode permettant de modifier le paramètre : adresse
	 * @param adresse le paramètre adresse à modifier
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : telephone
	 * @return telephone
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * Méthode permettant de modifier le paramètre : telephone
	 * @param telephone le paramètre telephone à modifier
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * Méthode permettant d'obtenir le paramètre : mail
	 * @return mail
	 */
	public String getMail() {
		return mail;
	}
	
	/**
	 * Méthode permettant de modifier le paramètre : mail
	 * @param mail le paramètre mail à modifier
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

	
	/**
	 * Méthode permettant d'obtenir le paramètre : conseiller
	 * @return conseiller
	 */
	public User getConseiller() {
		return conseiller;
	}
	

	/**
	 * Méthode permettant de modifier le paramètre : conseiller
	 * @param conseiller le paramètre conseiller à modifier
	 */
	public void setConseiller(User conseiller) {
		this.conseiller = conseiller;
	}
	

	/**
	 * Méthode permettant d'obtenir le paramètre : comptes
	 * @return comptes
	 */
	public List<CompteBancaire> getComptes() {
		return comptes;
	}
	

	/**
	 * Méthode permettant de modifier le paramètre : comptes
	 * @param comptes le paramètre comptes à modifier
	 */
	public void setComptes(List<CompteBancaire> comptes) {
		this.comptes = comptes;
	}

	
}

