package com.proxibanquev4.ckkt.dao.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.dao.ICompteBancaireDao;
import com.proxibanquev4.ckkt.dao.IConseillerDao;
import com.proxibanquev4.ckkt.dao.IGerantDao;
import com.proxibanquev4.ckkt.domaine.Adresse;
import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.domaine.CompteCourant;
import com.proxibanquev4.ckkt.domaine.CompteEpargne;
import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.domaine.Gerant;

import junit.framework.TestCase;

/**
 * Classe TestSpringDAOConseiller.java Represente
 * @author CKKT
 */
public class TestSpringDAOConseiller extends TestCase {

	private ICompteBancaireDao springDaoCompte;
	private IClientDao springDaoClient;
	private IGerantDao springDaoGerant;
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
	
//	@Test
//	public void testCreerConseiller() {
//		
//		Gerant gerant1 = new Gerant("Castro", "Clement", "Clement", "admin"); 
//		Conseiller conseiller1 = new Conseiller("Thomas", "Konrad", "Konrad", "admin");
//		Conseiller conseiller2 = new Conseiller("Theodorou", "Thomas", "Thomas", "admin");
//		
//		Adresse adresse1 = new Adresse("84", "rue de la paix", 69005, "Lyon");
//		Adresse adresse2 = new Adresse("53", "rue de la guerre", 69005, "Lyon");
//		Adresse adresse3 = new Adresse("74", "rue de l'avenue", 69005, "Lyon");
//		Adresse adresse4 = new Adresse("41", "rue du champs", 69005, "Lyon");
//		Adresse adresse5 = new Adresse("68", "rue du code", 69005, "Lyon");
//		Adresse adresse6 = new Adresse("92", "rue de la victoire", 69005, "Lyon");
//		
//		List<CompteBancaire> listComptes1 = new ArrayList<CompteBancaire>();
//		List<CompteBancaire> listComptes2 = new ArrayList<CompteBancaire>();
//		List<CompteBancaire> listComptes3 = new ArrayList<CompteBancaire>();
//		List<CompteBancaire> listComptes4 = new ArrayList<CompteBancaire>();
//		List<CompteBancaire> listComptes5 = new ArrayList<CompteBancaire>();
//		List<CompteBancaire> listComptes6 = new ArrayList<CompteBancaire>();
//		
//		Client client1 = new Client("Marley","bob", "06.23.04.98.62", "marley@chanson.com", gerant1, listComptes1);
//		Client client2 = new Client("Morose","Marylin", "06.23.04.98.62", "marley@gmail.com", gerant1, listComptes2);
//		Client client3 = new Client("Marteau","Jean", "06.23.04.98.62", "Jean@gmail.com", conseiller1, listComptes3);
//		Client client4 = new Client("Marcheciel","Luc", "06.23.04.98.62", "Luc@gmail.com", conseiller1, listComptes4);
//		Client client5 = new Client("Pacreau","Sylvie", "06.23.04.98.62", "Sylvie@gmail.com", conseiller2, listComptes5);
//		Client client6 = new Client("Cousteau","Fernand", "06.23.04.98.62", "Fernand@gmail.com", conseiller2, listComptes6);
//		
//		CompteBancaire compteE1 = new CompteEpargne(101, new Date(), 5426, client1);
//		CompteBancaire compteE2 = new CompteEpargne(102, new Date(), 658, client2);
//		CompteBancaire compteE3 = new CompteEpargne(103, new Date(), 946, client3);
//		CompteBancaire compteE4 = new CompteEpargne(104, new Date(), 6987, client4);
//		CompteBancaire compteE5 = new CompteEpargne(105, new Date(), 5124, client5);
//		
//		CompteBancaire compteC1 = new CompteCourant(201, new Date(), 8745, client1);
//		CompteBancaire compteC2 = new CompteCourant(202, new Date(), 7582, client2);
//		CompteBancaire compteC3 = new CompteCourant(203, new Date(), 2145, client3);
//		CompteBancaire compteC4 = new CompteCourant(204, new Date(), 3674, client4);
//		
//		listComptes1.add(compteE1);
//		listComptes2.add(compteE2);
//		listComptes3.add(compteE3);
//		listComptes4.add(compteE4);
//		listComptes5.add(compteE5);
//		
//		listComptes1.add(compteC1);
//		listComptes2.add(compteC2);
//		listComptes3.add(compteC3);
//		listComptes4.add(compteC4);
//
//		client1.setComptes(listComptes1);
//		client2.setComptes(listComptes2);
//		client3.setComptes(listComptes3);
//		client4.setComptes(listComptes4);
//		client5.setComptes(listComptes5);
//		
//		client1.setAdresse(adresse1);
//		client2.setAdresse(adresse2);
//		client3.setAdresse(adresse3);
//		client4.setAdresse(adresse4);
//		client5.setAdresse(adresse5);
//		client6.setAdresse(adresse6);
//		
//		List<Client> clients1 = new ArrayList<Client>();
//		List<Client> clients2 = new ArrayList<Client>();
//		List<Client> clients3 = new ArrayList<Client>();
//		
//		clients1.add(client1);
//		clients1.add(client2);
//		clients2.add(client3);
//		clients2.add(client4);
//		clients3.add(client5);
//		clients3.add(client6);
//		
//		gerant1.setClients(clients1);
//		conseiller1.setClients(clients2);
//		conseiller2.setClients(clients3);
//		
//		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
//		
//		springDaoGerant = (IGerantDao) appContext.getBean(IGerantDao.class);
//		springDaoGerant.save(gerant1);
//		
//		springDaoConseiller = (IConseillerDao) appContext.getBean(IConseillerDao.class);
//		springDaoConseiller.save(conseiller1);
//		springDaoConseiller.save(conseiller2);
//		
//		springDaoClient = (IClientDao) appContext.getBean(IClientDao.class);
//		springDaoClient.save(client1);
//		springDaoClient.save(client2);
//		springDaoClient.save(client3);
//		springDaoClient.save(client4);
//		springDaoClient.save(client5);
//		springDaoClient.save(client6);
//		
//		springDaoCompte = (ICompteBancaireDao) appContext.getBean(ICompteBancaireDao.class);
//		springDaoCompte.save(compteE1);
//		springDaoCompte.save(compteE2);
//		springDaoCompte.save(compteE3);
//		springDaoCompte.save(compteE4);
//		springDaoCompte.save(compteE5);
//		
//		springDaoCompte.save(compteC1);
//		springDaoCompte.save(compteC2);
//		springDaoCompte.save(compteC3);
//		springDaoCompte.save(compteC4);
//	}


	
}
