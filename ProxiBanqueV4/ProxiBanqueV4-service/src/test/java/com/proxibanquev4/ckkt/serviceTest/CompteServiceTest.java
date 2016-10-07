package com.proxibanquev4.ckkt.serviceTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.proxibanquev4.ckkt.dao.ICompteBancaireDao;
import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.service.CompteService;

import junit.framework.Assert;
import junit.framework.TestCase;

//@RunWith(MockitoJunitRunner.class)
public class CompteServiceTest extends TestCase {

	@InjectMocks
	CompteService cs;
	
	@Mock
	ICompteBancaireDao dao;
	
	@Mock
	CompteBancaire compte;
	
	Client client = new Client("Thomas");
	
//	Mockito.when(conseiller.getIdPersonne()).thenReturn(1L);
	
//	@InjectMocks ClientDAO clientDAO;
	
//	@Before
//	protected void setUp() throws Exception {
//		super.setUp();
//		//MockitoAnnotations.initMocks(this);
//	}
//
//	@After
//	protected void tearDown() throws Exception {
//		super.tearDown();
//	}
	
	@Test
	public void testDebiter() {
		Mockito.when(dao.findOne(1L)).thenReturn(compte);
		Mockito.when(compte.getSolde()).thenReturn(100.00);
		
		cs.debiter(compte, 10.0);
		
		Assert.assertEquals(cs.lireCompteParId(1L).getSolde(), 90.0, 1E-5);
		
	}

}
