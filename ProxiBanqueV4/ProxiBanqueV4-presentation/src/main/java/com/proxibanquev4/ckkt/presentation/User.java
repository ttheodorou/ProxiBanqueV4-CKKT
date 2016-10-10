package com.proxibanquev4.ckkt.presentation;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.service.ConseillerService;

@Component
public class User {

//	@Inject
	ConseillerService conseillerService = new ConseillerService();

	public Conseiller findByLogin(String login) {
		System.out.println("méthode findByLogin de User dans presentation ");

		return conseillerService.lireConseillerParLogin(login);
	}

	public ConseillerService getConseillerService() {
		return conseillerService;
	}

	public void setConseillerService(ConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}

	public User() {
		super();
	}
	

}
