package com.proxibanquev4.ckkt.dao.test;

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
	protected void setUp() throws Exception {
		super.setUp();
		client = new Client("Castro", "Clement");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDaoClient = (IClientDao) appContext.getBean("IClientDao");
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		client = null;
		appContext = null;
		springDaoClient = null;
	}

	public void testCreateClient() {
		springDaoClient.save(client);
	}
	
	
}
