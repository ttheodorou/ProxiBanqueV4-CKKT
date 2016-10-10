package com.proxibanquev4.ckkt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.domaine.Gerant;

/**
 *  Interface IConseiller.java permet la gestion des Conseillers en base de données.
 * @author CKKT
 */
@Repository
public interface IConseillerDao extends JpaRepository<Conseiller, Long> {

	public Conseiller findByidPersonne(long idPersonne);
	public Conseiller findByLogin(String login);
}
