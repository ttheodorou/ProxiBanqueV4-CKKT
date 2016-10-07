package com.proxibanquev4.ckkt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanquev4.ckkt.domaine.Gerant;

/**
 * Interface IGerant.java permet la gestion des Gerant en base de données.
 * @author CKKT
 */
@Repository
public interface IGerantDao extends JpaRepository<Gerant, Long> {
	
	public Gerant findByLogin(String login);

}
