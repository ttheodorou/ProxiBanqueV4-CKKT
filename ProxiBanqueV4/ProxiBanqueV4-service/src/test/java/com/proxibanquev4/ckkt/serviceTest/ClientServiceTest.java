/**
 * 
 */
package com.proxibanquev4.ckkt.serviceTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.service.ClientService;

import junit.framework.TestCase;

/**
 * Classe de test non-unitaire de ClientService pour test l'interaction entre les couches service et DAO.
 * @author CKKT
 */
@Configuration
@ComponentScan
public class ClientServiceTest extends TestCase {

	IClientDao clientDao;
	ClientService service;
	
	/**
	 * Méthode permmettant
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Méthode permmettant
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testLireClient() {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-service.xml");
		service = context.getBean(ClientService.class);
		
		long id = 0L;
		
		// Chercher le client avec l'id la plus petite.
		while (service.lireClient(++id) == null);
		
//		Client client = new Client();
		assertNotNull(service.lireClient(id));
		
	}
}
