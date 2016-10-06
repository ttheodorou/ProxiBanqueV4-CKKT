package com.proxibanquev4.ckkt.serviceTest;

import java.util.List;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.proxibanquev4.ckkt.service.ClientService;

import junit.framework.TestCase;

@RunWith(MockitoJunitRunner.class)
public class ClientServiceTest extends TestCase {

	ClientService cls = new ClientService();
	
	@Mock
	Conseiller conseiller;
	Mockito.when(conseiller.getId()).thenReturn(1);
	
	@InjectMocks ClientDAO clientDAO;
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		MockitoAnnotations.initMocks(this);
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	@Test
	public void lireTousClientsTest1() {
		List<Client> listeClients = cls.lireTousClients(Conseiller.getId());
		assertNotNull(listeClients);
		
	}

}
