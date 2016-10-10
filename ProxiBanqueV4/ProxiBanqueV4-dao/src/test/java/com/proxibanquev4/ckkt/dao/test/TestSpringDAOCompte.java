/**
 * 
 */
package com.proxibanquev4.ckkt.dao.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.dao.ICompteBancaireDao;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;

/**
 * Classe TestSpringDAOCompte.java Represente
 * @author CKKT
 */
public class TestSpringDAOCompte {

	private ClassPathXmlApplicationContext appContext;
	
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
	public void testFindOne() {
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		ICompteBancaireDao springDaoCompte = (ICompteBancaireDao) appContext.getBean(ICompteBancaireDao.class);
		CompteBancaire compte1 = springDaoCompte.findOne((long) 7);
		System.out.println(compte1.getIdCompte());
		System.out.println(compte1.getClass());
	}

}
