package com.proxibanquev4.ckkt.serviceTest;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.service.ClientService;

import junit.framework.TestCase;

public class ClientServiceTestUnit extends TestCase {

	@InjectMocks
	ClientService cs;
	
	@Mock
	IClientDao dao;
	
	@Spy
	CompteBancaire compte1;
	@Spy
	CompteBancaire compte2;
	
	
	@Before
	public void setUp() throws Exception {
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
