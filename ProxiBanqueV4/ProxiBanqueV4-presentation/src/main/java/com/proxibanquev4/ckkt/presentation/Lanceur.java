/**
 * 
 */
package com.proxibanquev4.ckkt.presentation;

import com.proxibanquev4.ckkt.domaine.Gerant;

/**
 * Classe Lanceur.java Represente
 * @author CKKT
 */
public class Lanceur {

	/**
	 * Méthode permmettant
	 * @param args
	 */
	public static void main(String[] args) {


		Gerant gerant = new Gerant("castro", "clement", "cca", "mdp");
		System.out.println(gerant.getNom());
		System.out.println(gerant.getPrenom());
		System.out.println(gerant.getLogin());
		System.out.println(gerant.getPassword());
		System.out.println(gerant.getRole());
	}

}
