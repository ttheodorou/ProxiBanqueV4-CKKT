package com.proxibanquev4.ckkt.rest;
 
import java.io.File;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.dao.ICompteBancaireDao;
import com.proxibanquev4.ckkt.dao.IConseillerDao;
import com.proxibanquev4.ckkt.dao.IGerantDao;
import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.domaine.Gerant;
 
@Path("/hello2")
public class ProxibanqueWS2 {

	
	private ICompteBancaireDao springDaoCompte;
	private IClientDao springDaoClient;
	private IGerantDao springDaoGerant;
	private IConseillerDao springDaoConseiller;
	private ClassPathXmlApplicationContext appContext;
	
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
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
		
		String output = "Jersey say : " + msg + client1.getNom() + client2.getNom() + client3.getNom() + client4.getNom()  ;
		String output2 = "" + client1.getComptes().get(0).getSolde();
		
		ObjectMapper mapper = new ObjectMapper();
		

		//Object to JSON in file
//		mapper.writeValue(new File("c:\\user.json"), client3);

		//Object to JSON in String
//		String jsonInString = mapper.writeValueAsString(user);
		
		gerant= null;
		gerants= null;
		client= null;
		client1= null;
		client2= null;
		clientsG= null;
		clientsC= null;
		conseiller= null;
		conseillers= null;
		appContext = null;
		springDaoClient = null;
		return Response.status(200).entity(output + output2).build();
 
	}
 
}