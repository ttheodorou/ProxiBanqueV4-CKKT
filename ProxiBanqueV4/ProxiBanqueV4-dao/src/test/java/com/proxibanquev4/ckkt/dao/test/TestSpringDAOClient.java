package com.proxibanquev4.ckkt.dao.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testCreateClient() {
		
		client = new Client("Castro", "Clement");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDaoClient = (IClientDao) appContext.getBean(IClientDao.class);
		springDaoClient.save(client);
	}
	
}
