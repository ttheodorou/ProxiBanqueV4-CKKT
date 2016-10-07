package com.proxibanquev4.ckkt.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe Adresse.java Represente les Adresses des Clients de la banque
 * Proxibanque
 * 
 * @author CKKT
 */
@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idAdresse;
	private String numRue;
	private String nomRue;
	private int codePostal;
	private String ville;

	// Constructeur de la classe Adresse

	/**
	 * Constructeur de la classe Adresse.java
	 * 
	 * @param idAdresse
	 * @param numRue
	 * @param nomRue
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(long idAdresse, String numRue, String nomRue, int codePostal, String ville) {
		super();
		this.idAdresse = idAdresse;
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	/**
	 * Constructeur de la classe Adresse.java
	 * 
	 * @param numRue
	 * @param nomRue
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(String numRue, String nomRue, int codePostal, String ville) {
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codePostal = codePostal;
		this.ville = ville;
	}

	// Getter et Setter de la classe Adresse

	/**
	 * Méthode permettant d'obtenir le paramètre : idAdresse
	 * 
	 * @return idAdresse
	 */
	public long getIdAdresse() {
		return idAdresse;
	}

	/**
	 * Méthode permettant de modifier le paramètre : idAdresse
	 * 
	 * @param idAdresse
	 *            le paramètre idAdresse à modifier
	 */
	public void setIdAdresse(long idAdresse) {
		this.idAdresse = idAdresse;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : numRue
	 * 
	 * @return numRue
	 */
	public String getNumRue() {
		return numRue;
	}

	/**
	 * Méthode permettant de modifier le paramètre : numRue
	 * 
	 * @param numRue
	 *            le paramètre numRue à modifier
	 */
	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : nomRue
	 * 
	 * @return nomRue
	 */
	public String getNomRue() {
		return nomRue;
	}

	/**
	 * Méthode permettant de modifier le paramètre : nomRue
	 * 
	 * @param nomRue
	 *            le paramètre nomRue à modifier
	 */
	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : codePostal
	 * 
	 * @return codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Méthode permettant de modifier le paramètre : codePostal
	 * 
	 * @param codePostal
	 *            le paramètre codePostal à modifier
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Méthode permettant d'obtenir le paramètre : ville
	 * 
	 * @return ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Méthode permettant de modifier le paramètre : ville
	 * 
	 * @param ville
	 *            le paramètre ville à modifier
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

	@Override
	public String toString() {
		return numRue + " " + nomRue + ", " + codePostal + " " + ville;
	}

}
