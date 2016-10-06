package com.proxibanquev4.ckkt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.proxibanquev4.ckkt.domaine.Client;


/**
 * Interface IClient.java permet la gestion des Clients en base de données.
 * @author CKKT
 */
public interface IClientDao extends JpaRepository<Client, Double> {

	
}
