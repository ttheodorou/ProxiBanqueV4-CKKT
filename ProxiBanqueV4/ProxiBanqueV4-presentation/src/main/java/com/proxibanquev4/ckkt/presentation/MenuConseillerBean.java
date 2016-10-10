package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.proxibanquev4.ckkt.domaine.Conseiller;

@ManagedBean(name = "menuConseillerBean")
@SessionScoped
@Controller
public class MenuConseillerBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String login;

	User user;
	NavigateBean navigateBean;
	Conseiller conseiller;

	public String redirect() {
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();

		login = request.getUserPrincipal().getName();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-presentation.xml");

		// Chargement des Bean de la présentation
		user = context.getBean(User.class);

		// Défini le conseiller en session
		conseiller = user.findByLogin(login);

		navigateBean = context.getBean(NavigateBean.class);
		ErrorBean errorBean = context.getBean(ErrorBean.class);
		ListeClientsBean listeClientsBean = context.getBean(ListeClientsBean.class);
		ListeClientsAgenceBean listeClientsAgenceBean = context.getBean(ListeClientsAgenceBean.class);
		VirementBean virementBean = context.getBean(VirementBean.class);

		return "/user/conseiller/testlogin.xhtml";
	}

	public MenuConseillerBean() {
		super();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	// public MenuConseillerBean(LoginBean loginBean) {
	// super();
	// this.loginBean = loginBean;
	// }
	//
	//
	// public LoginBean getLoginBean() {
	// return loginBean;
	// }
	//
	// public void setLoginBean(LoginBean loginBean) {
	// this.loginBean = loginBean;
	// }

}
