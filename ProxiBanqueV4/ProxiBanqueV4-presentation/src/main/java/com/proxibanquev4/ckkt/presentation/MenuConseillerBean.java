package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "menuConseillerBean")
@SessionScoped
public class MenuConseillerBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{loginBean}")
	private LoginBean loginBean;
	
	public String redirect(){
		return loginBean.getNavigateBean().redirectToListeClients();
	}

	public MenuConseillerBean() {
		super();
	}
	

	public MenuConseillerBean(LoginBean loginBean) {
		super();
		this.loginBean = loginBean;
	}


	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}
	
	

}
