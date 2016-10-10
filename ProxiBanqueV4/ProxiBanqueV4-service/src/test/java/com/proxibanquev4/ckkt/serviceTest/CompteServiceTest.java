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

import com.proxibanquev4.ckkt.dao.ICompteBancaireDao;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.service.CompteService;

import junit.framework.Assert;
import junit.framework.TestCase;

@RunWith(MockitoJUnitRunner.class)
public class CompteServiceTest extends TestCase {

	@InjectMocks
	CompteService cs;
	
	@Mock
	ICompteBancaireDao dao;
	
	@Spy
	CompteBancaire compte1;
	@Spy
	CompteBancaire compte2;
	
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
		//MockitoAnnotations.initMocks(this);
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void testDebiter() {
		
		compte1 = new CompteBancaire(100.0) {};
		
		Mockito.when(dao.findOne(1L)).thenReturn(compte1);
		
		cs.debiter(compte1, 10.0);
		
		Assert.assertEquals(cs.lireCompteParId(1L).getSolde(), 90.0, 1E-5);
		
	}
	
	@Test
	public void testCrediter() {
		
		compte2 = new CompteBancaire(100.0) {};
		
		Mockito.when(dao.findOne(2L)).thenReturn(compte2);
		
		cs.crediter(compte2, 10.0);
		
		Assert.assertEquals(cs.lireCompteParId(2L).getSolde(), 110.0, 1E-5);
		
	}
	
	@Test
	public void testVirement() {
		
		compte1 = new CompteBancaire(100.0) {};
		compte2 = new CompteBancaire(100.0) {};
		
		Mockito.when(dao.findOne(1L)).thenReturn(compte1);
		Mockito.when(dao.findOne(2L)).thenReturn(compte2);
		
		cs.virement(compte1, compte2, 10.0);
		
		Assert.assertEquals(cs.lireCompteParId(1L).getSolde(), 90.0, 1E-5);
		Assert.assertEquals(cs.lireCompteParId(2L).getSolde(), 110.0, 1E-5);
		
	}
}
