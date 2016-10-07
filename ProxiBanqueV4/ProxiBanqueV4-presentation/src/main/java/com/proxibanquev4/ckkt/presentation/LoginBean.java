package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;
import java.security.Principal;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.service.ConseillerService;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value="#{navigateBean}")
    private NavigateBean navigateBean;
	
	ConseillerService conseillerService;
	Conseiller conseiller;

	String login;

	public LoginBean() {
		Principal principal = FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
		// get login from principal
		login = principal.getName();
		conseiller = conseillerService.lireConseillerParLogin(login);

	}
	
	
//	Méthode qui permettrait de charger le conseiller à chaque fois
//	ConseillerService conseillerService1 = new ConseillerService();
//	
//	public Conseiller lireConseillerEnCours(){
//		Conseiller conseiller1 = conseillerService1.lireConseillerParLogin(login);
//		return conseiller1;
//		
//	}
	
	
	

	public NavigateBean getNavigateBean() {
		return navigateBean;
	}

	public void setNavigateBean(NavigateBean navigateBean) {
		this.navigateBean = navigateBean;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public ConseillerService getConseillerService() {
		return conseillerService;
	}

	public void setConseillerService(ConseillerService conseillerService) {
		this.conseillerService = conseillerService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
