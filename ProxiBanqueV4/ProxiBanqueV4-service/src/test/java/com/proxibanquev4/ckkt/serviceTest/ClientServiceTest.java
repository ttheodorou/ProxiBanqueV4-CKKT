/**
 * 
 */
package com.proxibanquev4.ckkt.serviceTest;

import javax.inject.Inject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.service.ClientService;

/**
 * Classe de test non-unitaire de ClientService pour test l'interaction entre les couches service et DAO.
 * @author CKKT
 */
@Configuration
@ComponentScan
public class ClientServiceTest {

	IClientDao clientDao;
	ClientService service;
	
	/**
	 * Méthode permmettant
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * Méthode permmettant
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindOneAppelDao() {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-service.xml");
		clientDao =context.getBean(IClientDao.class);
		
		Client client = new Client();
		client = clientDao.findOne((long) 4);
		System.out.println(client);
	}

	@Test
	public void testLireClient() {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-service.xml");
		service =context.getBean(ClientService.class);
		
		Client client = new Client();
		client = service.lireClient(4);
		System.out.println(client.getNom());
		
	}
}
