/**
 * 
 */
package com.proxibanquev4.ckkt.dao.test;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
	private AnnotationConfigApplicationContext appContext;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		conseiller = new Conseiller("Theodorou", "Thomas", "Theo", "toto");
		appContext = new AnnotationConfigApplicationContext("spring-data.xml");

		springDaoConseiller = (IConseillerDao) appContext.getBean("IClientDao");
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
		conseiller = null;
		appContext = null;
		springDaoConseiller = null;
	}
	
	public void testCreerConseiller() {
		springDaoConseiller.save(conseiller);
	}
	
	public void testFindByLogin() {
		List<Conseiller> listConseiller = springDaoConseiller.findByLogin(conseiller.getNom());
		for(Conseiller e : listConseiller) {
			System.out.println(e.getNom());
		}
		assertNotNull(listConseiller);
	}

	
}
