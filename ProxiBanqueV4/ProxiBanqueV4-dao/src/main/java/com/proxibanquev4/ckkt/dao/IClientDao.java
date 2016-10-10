package com.proxibanquev4.ckkt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.domaine.User;


/**
 * Interface IClient.java permet la gestion des Clients en base de données.
 * @author CKKT
 */
@Repository
public interface IClientDao extends JpaRepository<Client, Long> {

	public List<Client> findByConseiller(User conseiller);
	
}
