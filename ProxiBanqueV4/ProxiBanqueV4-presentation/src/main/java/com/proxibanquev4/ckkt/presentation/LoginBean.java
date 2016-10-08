package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proxibanquev4.ckkt.domaine.Conseiller;

@ManagedBean(name = "loginBean")
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@ManagedProperty(value = "#{navigateBean}")
	private NavigateBean navigateBean;

//	private ConseillerService conseillerService;
	private Conseiller conseiller;

	private String login;

	private User user;

	// public LoginBean() {
	// Principal principal =
	// FacesContext.getCurrentInstance().getExternalContext().getUserPrincipal();
	// // get login from principal
	// login = principal.getName();
	// conseiller = conseillerService.lireConseillerParLogin(login);
	//
	// }

	public LoginBean() {
		doLogin();
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();

		String login = request.getUserPrincipal().getName();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-presentation.xml");
		user = context.getBean(User.class);
		conseiller = user.findByLogin(login);
	}
	public String doLogin() {
		return "tu as appelé la méthode doLogin";
	}

	// Méthode qui permettrait de charger le conseiller à chaque fois
	// ConseillerService conseillerService1 = new ConseillerService();
	//
	// public Conseiller lireConseillerEnCours(){
	// Conseiller conseiller1 =
	// conseillerService1.lireConseillerParLogin(login);
	// return conseiller1;
	//
	// }

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

//	public ConseillerService getConseillerService() {
//		return conseillerService;
//	}
//
//	public void setConseillerService(ConseillerService conseillerService) {
//		this.conseillerService = conseillerService;
//	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
