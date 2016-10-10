package com.proxibanquev4.ckkt.serviceTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.dao.ICompteBancaireDao;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.service.CompteService;

import junit.framework.TestCase;

/**
 * Classe de test unitaire pour la classe CompteService.
 * @author CKKT
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class CompteServiceTestUnit extends TestCase {

	@InjectMocks
	CompteService cs;
	
	@Mock
	ICompteBancaireDao dao;
	
	@Spy
	CompteBancaire compte1;
	@Spy
	CompteBancaire compte2;
	
	private ClassPathXmlApplicationContext appContext;
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * Test unitaire de la méthode virement.
	 */
	@Test
	public void testVirement() {
		
		compte1 = new CompteBancaire(100.0) {};
		compte2 = new CompteBancaire(100.0) {};
		
		Mockito.when(dao.findOne(1L)).thenReturn(compte1);
		Mockito.when(dao.findOne(2L)).thenReturn(compte2);
		
		cs.virement(compte1, compte2, 10.0);
		
		assertEquals(cs.lireCompteParId(1L).getSolde(), 90.0, 1E-5);
		assertEquals(cs.lireCompteParId(2L).getSolde(), 110.0, 1E-5);
		
	}
	
	@Test
	public void testFindOne() {
		appContext = new ClassPathXmlApplicationContext("spring-service.xml");
		CompteService Compteserv = (CompteService) appContext.getBean(CompteService.class);
		CompteBancaire compte1 = Compteserv.lireCompteParId((long) 7);
		System.out.println(compte1.getIdCompte());
		System.out.println(compte1.getClass());
	}
}
