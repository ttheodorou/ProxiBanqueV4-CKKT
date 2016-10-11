package com.proxibanquev4.ckkt.presentation;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import org.springframework.stereotype.Component;

/**
 * Created by Guillaume on 12/09/2016, modifié par CKKT le 07/10/2016.
 */
@ManagedBean(name = "navigateBean", eager = true)
@RequestScoped
@Component
public class NavigateBean implements Serializable {

	private static final long serialVersionUID = 2L;

	@Inject
	private ErrorBean errorBean;

	/**
	 * Permet d'effectuer une redirection vers la page de login de conseiller
	 *
	 * @return l'adresse de la page login
	 */
	public String redirectToLogin() {
		
		return "/login.xhtml?faces-redirect=true";
	}

	/**
	 * Permet de naviguer vers la page de login
	 *
	 * @return l'adresse relative de la page login
	 */
	public String toLogin() {
		return "/login.xhtml";
	}


	/**
	 * Permet de rediriger vers la page des clients du conseiller
	 *
	 * @return l'adresse de la page menuconseiller
	 */
	public String redirectToListeClients() {
		return "/user/conseiller/listeclients.xhtml?faces-redirect=true";
	}

	/**
	 * Permet de naviguer vers la page des clients du conseiller
	 *
	 * @return l'adresse relative de la page menuconseiller
	 */
	public String toListeClients() {
		return "/user/conseiller/listeclients.xhtml";
	}
	
	/**
	 * Permet de rediriger vers la page des clients du conseiller
	 *
	 * @return l'adresse de la page menuconseiller
	 */
	public String redirectToEditionClients() {
		return "/user/conseiller/editionclients.xhtml?faces-redirect=true";
	}

	/**
	 * Permet de naviguer vers la page d'édition des clients du conseiller
	 *
	 * @return l'adresse relative de la page menuconseiller
	 */
	public String toListeEditionClients() {
		return "/user/conseiller/editionclients.xhtml";
	}
	
	/**
	 * Permet de rediriger vers la page d'édition des clients de l'agence
	 *
	 * @return l'adresse de la page menuconseiller
	 */
	public String redirectToListeClientsAgence() {
		return "/user/gerant/listeclientsagence.xhtml?faces-redirect=true";
	}

	/**
	 * Permet de naviguer vers la page des clients de l'agence
	 *
	 * @return l'adresse relative de la page menuconseiller
	 */
	public String toListeClientsAgence() {
		return "/user/gerant/listeclientsagence.xhtml";
	}
	
	/**
	 * Permet de rediriger vers la page d'historique des transactions
	 *
	 * @return l'adresse de la page menuconseiller
	 */
	public String redirectToTransaction() {
		return "/user/gerant/historique.xhtml?faces-redirect=true";
	}

	/**
	 * Permet de naviguer vers la page d'historique des transactions
	 *
	 * @return l'adresse relative de la page menuconseiller
	 */
	public String toTransaction() {
		return "/user/gerant/historique.xhtml";
	}

	/**
	 * Permet de rediriger vers la page des clients du conseiller
	 *
	 * @return l'adresse de la page menuconseiller
	 */
	public String redirectToVirement() {
		return "/user/conseiller/virement.xhtml?faces-redirect=true";
	}

	/**
	 * Permet de naviguer vers la page pour faire des virements
	 *
	 * @return l'adresse relative de la page virement
	 */
	public String toVirement() {
		return "/user/conseiller/virement.xhtml";
	}

	/**
	 * Permet de rediriger vers une page d'erreur personnalisée
	 *
	 * @return l'adresse de la page error.xhtml
	 */
	public String redirectToError(String messagePerso) {

		// try {
		//
		// String urlEncoder = URLEncoder.encode(messagePerso, "UTF-8"); //Use
		// URLDecoder.decode(url, "UTF-8") to reverse in bean error page
		// return "/secured_pages/error.xhtml?faces-redirect=true&message=" +
		// urlEncoder;
		//
		// } catch (UnsupportedEncodingException e) {
		// e.printStackTrace();
		// return "/secured_pages/error.xhtml?faces-redirect=true";
		// }

		errorBean.setMessage(messagePerso);
		return "/error.jsp?faces-redirect=true";

	}

	/**
	 * Permet de naviguer vers une page d'erreur personnalisée
	 *
	 * @return l'adresse relative de la page d'erreur
	 */
	public String toError(String messagePerso) {

		// try {
		//
		// String urlEncoder = URLEncoder.encode(messagePerso, "UTF-8"); //Use
		// URLDecoder.decode(url, "UTF-8") to reverse in bean error page
		// return "/secured_pages/error.xhtml?message=" + urlEncoder;
		//
		// } catch (UnsupportedEncodingException e) {
		// e.printStackTrace();
		// return "/secured_pages/error.xhtml";
		// }

		errorBean.setMessage(messagePerso);
		return "/error.jsp";

	}

	public ErrorBean getErrorBean() {
		return errorBean;
	}

	public void setErrorBean(ErrorBean errorBean) {
		this.errorBean = errorBean;
	}
}
