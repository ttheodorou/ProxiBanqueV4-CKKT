package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.proxibanquev4.ckkt.dao.IClientDao;
import com.proxibanquev4.ckkt.domaine.Conseiller;
import com.proxibanquev4.ckkt.service.ConseillerService;

@ManagedBean(name = "menuConseillerBean")
@SessionScoped
@Controller
public class MenuConseillerBean implements Serializable {

	private static final long serialVersionUID = 1L;

	// @ManagedProperty(value = "#{loginBean}")
	// @Autowired
	// private LoginBean loginBean;
	private String login;
	ConseillerService conseillerService;

	Conseiller conseiller;

	public String redirect() {
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();

		login = request.getUserPrincipal().getName();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-presentation.xml");
		conseillerService = context.getBean(ConseillerService.class);
		conseiller = conseillerService.lireConseillerParLogin(login);
		
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("spring-presentation.xml");
		// User user = context.getBean(User.class);
		// Conseiller conseiller = user.findByLogin(login);
		// return loginBean.getNavigateBean().redirectToListeClients();
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
