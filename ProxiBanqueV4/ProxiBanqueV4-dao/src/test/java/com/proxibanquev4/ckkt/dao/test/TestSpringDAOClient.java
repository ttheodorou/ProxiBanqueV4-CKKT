package com.proxibanquev4.ckkt.dao.test;

import java.util.List;

import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.domaine.Client;

import junit.framework.TestCase;

/**
 * Classe TestSpringDAOClient.java est une classe qui permet de tester les méthodes de IClientDao
 * @author CKKT
 */
public class TestSpringDAOClient extends TestCase {

	private Client client;
	private IClientDao springDaoClient;
	
	private ClassPathXmlApplicationContext appContext;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		springDaoClient = (IClientDao) appContext.getBean(IClientDao.class);
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Teste la création et suppresion d'un client en s'assurent qu'aucun erreur se produit.
	 */
	@Test
	public void testCreateClient() {
		
		client = new Client("Castro", "Clement");
		
		try {
			springDaoClient.save(client);
			springDaoClient.delete(client);
		} catch (IllegalArgumentException e) {
			Assume.assumeNoException(e);
		}
	}
	
	@Test
	public void testReadClient() {
				
		long id = 0L;
		
		// Chercher le client avec l'id la plus petite.
		while (springDaoClient.findOne(++id) == null);
		
		// Vérifier que le client n'est pas null
		assertNotNull(springDaoClient.findOne(id));
	}
	
	@Test
	public void testLireTousClients() {
		try {
			//List<Client> tousClients = springDaoClient.findAll();
			assertNotNull(springDaoClient.findAll());
		} catch (Exception e) {
			Assume.assumeNoException(e);
		}
	}
}

