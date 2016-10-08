package com.proxibanquev4.ckkt.presentation;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.service.ConseillerService;

@Component
public class User {

	@Inject
	ConseillerService conseillerService;

	public Conseiller findByLogin(String login) {

		return conseillerService.lireConseillerParLogin(login);
	}

}
