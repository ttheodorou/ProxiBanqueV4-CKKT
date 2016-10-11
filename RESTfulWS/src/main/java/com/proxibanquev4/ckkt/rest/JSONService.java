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
import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.domaine.CompteBancaire;
import com.proxibanquev4.ckkt.domaine.Track;

@Path("/json/metallica")
public class JSONService {

//	private ICompteBancaireDao springDaoCompte;
	private IClientDao springDaoClient;
//	private IGerantDao springDaoGerant;
//	private IConseillerDao springDaoConseiller;
	private ClassPathXmlApplicationContext appContext;
	
	public boolean estDebiteur(Client client) {
		for (CompteBancaire compte : client.getComptes()) {
			if (compte.getSolde() < 0) {
				return true;
			}
		}
		return false;
	}
	
	@GET
	@Path("/{param}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Long> getTrackInJSON(@PathParam("param") String msg) {

		appContext = new ClassPathXmlApplicationContext("spring-data.xml");
		springDaoClient = (IClientDao) appContext.getBean(IClientDao.class);
//		
		List<Client> listeClients = springDaoClient.findAll();
		
		List<Long> idsClientsADebit = new ArrayList<Long>();
		
		for(Client client : listeClients) {
			if (estDebiteur(client)) {
				idsClientsADebit.add(client.getIdPersonne());
			}
		}
		
		return idsClientsADebit;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}

}