package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

@ManagedBean(name = "logoutBean")
@SessionScoped
@Controller
public class LogoutBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	MenuConseillerBean menuConseiller;

	private String redirect;

	public String redirect() throws ServletException {
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext()
				.getRequest();
		request.getSession().invalidate();
		redirect = menuConseiller.navigateBean.redirectToLogout();

		return redirect;
	}

	public MenuConseillerBean getMenuConseiller() {
		return menuConseiller;
	}

	public void setMenuConseiller(MenuConseillerBean menuConseiller) {
		this.menuConseiller = menuConseiller;
	}

	public String getRedirect() {
		return redirect;
	}

	public void setRedirect(String redirect) {
		this.redirect = redirect;
	}
	

}
