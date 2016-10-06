package com.proxibanquev4.ckkt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proxibanquev4.ckkt.domaine.Gerant;

/**
 * Interface IGerant.java permet la gestion des Gerant en base de données.
 * @author CKKT
 */
public interface IGerantDao extends JpaRepository<Gerant, Long> {
	
	public Gerant findByLogin(String login);

}