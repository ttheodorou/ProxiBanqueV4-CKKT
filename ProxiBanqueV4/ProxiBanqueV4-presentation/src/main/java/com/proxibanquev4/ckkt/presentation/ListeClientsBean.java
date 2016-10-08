package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import com.proxibanquev4.ckkt.domaine.Client;
import com.proxibanquev4.ckkt.service.ClientService;

@ManagedBean(name = "listeClientsBean")
@ViewScoped
public class ListeClientsBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<Client> listeClients;

	@ManagedProperty("#{clientService}")
	private ClientService clientService;

	@ManagedProperty(value = "#{loginbean}")
	private LoginBean loginBean;

	@PostConstruct
	public void init() {

		listeClients = (ArrayList<Client>) clientService.lireTousClients(loginBean.getConseiller().getIdPersonne());

	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public void setClientService(ClientService clientService) {
		this.clientService = clientService;
	}

	public LoginBean getLoginBean() {
		return loginBean;
	}

	public void setLoginBean(LoginBean loginBean) {
		this.loginBean = loginBean;
	}
	

}
