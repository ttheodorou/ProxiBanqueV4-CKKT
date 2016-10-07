/**
 * 
 */
package com.proxibanquev4.ckkt.dao.test;

import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.dao.IConseillerDao;
import com.proxibanquev4.ckkt.domaine.Conseiller;

import junit.framework.TestCase;

/**
 * Classe TestSpringDAOConseiller.java Represente
 * @author CKKT
 */
public class TestSpringDAOConseiller extends TestCase {

	private Conseiller conseiller;
	private IConseillerDao springDaoConseiller;
	private ClassPathXmlApplicationContext appContext;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testCreerConseiller() {
		conseiller = new Conseiller("Theodorou", "Thomas", "Theo", "toto");
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		springDaoConseiller = (IConseillerDao) appContext.getBean(IConseillerDao.class);
		springDaoConseiller.save(conseiller);
	}


	
}
