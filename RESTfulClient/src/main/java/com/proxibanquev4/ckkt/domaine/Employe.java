package com.proxibanquev4.ckkt.domaine;

public class Employe {								

	private String nom ;      // Propri�t� 'nom'
	private String prenom ;

	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Employe() {
	super();
	}

	public String getNom() {  // Getter pour propri�t� 'nom'
		return nom;
	}

	public void setNom(String nom) { // Setter pour propri�t� 'nom'
		this.nom = nom;
	}

	public String getPrenom() { // Getter pour propri�t� 'prenom'
		return prenom;
	}

	public void setPrenom(String prenom) { // Setter pour propri�t� 'prenom'
		this.prenom = prenom;
	}

	public void poserConges() {
	System.out.println("L'employe " + this.prenom + " " + this.nom + " pose des Conges");
	}
}