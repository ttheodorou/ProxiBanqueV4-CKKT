package com.proxibanquev4.ckkt.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.dao.ICompteBancaireDao;
import com.proxibanquev4.ckkt.dao.IConseillerDao;
import com.proxibanquev4.ckkt.dao.IGerantDao;
import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.domaine.Gerant;
import com.proxibanquev4.ckkt.domaine.Track;

@Path("/json2/metallica")
public class JSONService2 {

	private ICompteBancaireDao springDaoCompte;
	private IClientDao springDaoClient;
	private IGerantDao springDaoGerant;
	private IConseillerDao springDaoConseiller;
	private ClassPathXmlApplicationContext appContext;
	
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public Client getTrackInJSON(@PathParam("param") String msg) {
		Gerant gerant;
		List<Gerant> gerants;
		Client client;
		Client client1;
		Client client2;
		Client client3;
		Client client4;
		List<Client> clientsG;
		List<Client> clientsC;
		Conseiller conseiller;
		List<Conseiller> conseillers;
		
		
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		springDaoClient = (IClientDao) appContext.getBean(IClientDao.class);
		springDaoConseiller = (IConseillerDao) appContext.getBean(IConseillerDao.class);
		springDaoGerant = (IGerantDao) appContext.getBean(IGerantDao.class);
		springDaoCompte = (ICompteBancaireDao) appContext.getBean(ICompteBancaireDao.class);
		
		gerant = springDaoGerant.findByidPersonne(1);
		clientsG =springDaoClient.findByConseiller(gerant);
		client1 = clientsG.get(0);
		client2 = clientsG.get(1);
		conseiller = springDaoConseiller.findByidPersonne(2);
		clientsC = springDaoClient.findByConseiller(conseiller);
		client3 = clientsC.get(0);
		client4 = clientsC.get(1);
		clientsC = springDaoClient.findByConseiller(conseiller);
		List<Long> li = new ArrayList<Long>();;
		int i=0;
		
		li.add((long)123);
		li.add(123L);
		li.add(123L);
		
		System.out.println(i);
		Client test = new Client("test","client");
		test.setIdPersonne(125L);
		Client test2 = new Client("test","client");
		test2.setIdPersonne(125L);
		List<Client> testListe = new ArrayList<Client>();
		testListe.add(test);
		testListe.add(test2);
		
		return test;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}

}