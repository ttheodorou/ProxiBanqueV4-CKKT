package com.proxibanquev4.ckkt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanquev4.ckkt.domaine.Client;


/**
 * Interface IClient.java permet la gestion des Clients en base de données.
 * @author CKKT
 */
@Repository
public interface IClientDao extends JpaRepository<Client, Long> {

	
}
