package com.proxibanquev4.ckkt.serviceTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.service.ClientsADecouvertService;

import junit.framework.TestCase;

public class ClientsADecouvertServiceTest extends TestCase {

	ClientsADecouvertService service;
	
	@Before
	public void setUp() throws Exception {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring-service.xml");
		service = context.getBean(ClientsADecouvertService.class);
		super.setUp();
	}

	@After
	public void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void test() {
		assertNotNull(service.lireTousDecouverts());
	}

}
