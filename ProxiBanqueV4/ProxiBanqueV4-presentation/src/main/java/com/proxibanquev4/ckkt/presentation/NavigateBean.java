package com.proxibanquev4.ckkt.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

import java.io.Serializable;

/**
 * Created by Guillaume on 12/09/2016, modifié par CKKT le 07/10/2016.
 */
@ManagedBean(name = "navigateBean")
@SessionScoped
public class NavigateBean implements Serializable{

    private static final long serialVersionUID = 2L;

    @ManagedProperty(value="#{errorBean}")
    private ErrorBean errorBean;


    /**
     * Permet d'effectuer une redirection vers la page de login de conseiller
     *
     * @return l'adresse de la page login
     */
    public String redirectToLogin(){
        return "/login.xhtml?faces-redirect=true";
    }

    /**
     * Permet de naviguer vers la page de login
     *
     * @return l'adresse relative de la page login
     */
    public String toLogin(){
        return "/login.xhtml";
    }

//    /**
//     * Permet de rediriger vers la page des clients du conseiller
//     *
//     * @return l'adresse de la page menuconseiller
//     */
//    public String redirectToMenuConseiller(){
//        return "/user/conseiller/listeclients.xhtml?faces-redirect=true";
//    }
//
//
//    /**
//     * Permet de naviguer vers la page des clients du conseiller
//     *
//     * @return l'adresse relative de la page menuconseiller
//     */
//    public String toMenuConseiller(){
//        return "/user/conseiller/listeclients.xhtml";
//    }
    
    /**
     * Permet de rediriger vers la page des clients du conseiller
     *
     * @return l'adresse de la page menuconseiller
     */
    public String redirectToListeClients(){
        return "/user/conseiller/listeclients.xhtml?faces-redirect=true";
    }


    /**
     * Permet de naviguer vers la page des clients du conseiller
     *
     * @return l'adresse relative de la page menuconseiller
     */
    public String toListeClients(){
        return "/user/conseiller/listeclients.xhtml";
    }


    /**
     * Permet de rediriger vers la page des clients du conseiller
     *
     * @return l'adresse de la page menuconseiller
     */
    public String redirectToVirement(){
        return "/user/conseiller/virement.xhtml?faces-redirect=true";
    }


    /**
     * Permet de naviguer vers la page pour faire des virements
     *
     * @return l'adresse relative de la page virement
     */
    public String toVirement(){
        return "/user/conseiller/virement.xhtml";
    }



    /**
     * Permet de rediriger vers une page d'erreur personnalisée
     *
     * @return l'adresse de la page error.xhtml
     */
    public String redirectToError(String messagePerso){

//        try {
//
//            String urlEncoder = URLEncoder.encode(messagePerso, "UTF-8");   //Use URLDecoder.decode(url, "UTF-8") to reverse in bean error page
//            return "/secured_pages/error.xhtml?faces-redirect=true&message=" + urlEncoder;
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//            return "/secured_pages/error.xhtml?faces-redirect=true";
//        }

        errorBean.setMessage(messagePerso);
        return "/error.jsp?faces-redirect=true";

    }


    /**
     * Permet de naviguer vers une page d'erreur personnalisée
     *
     * @return l'adresse relative de la page d'erreur
     */
    public String toError(String messagePerso){


//        try {
//
//            String urlEncoder = URLEncoder.encode(messagePerso, "UTF-8");   //Use URLDecoder.decode(url, "UTF-8") to reverse in bean error page
//            return "/secured_pages/error.xhtml?message=" + urlEncoder;
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//            return "/secured_pages/error.xhtml";
//        }

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
