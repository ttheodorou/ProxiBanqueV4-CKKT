package com.proxibanquev4.ckkt.presentation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by Guillaume on 12/09/2016, modifié par CKKT le 07/10/2016.
 */
@ManagedBean
@SessionScoped
public class ErrorBean implements Serializable{

    private static final long serialVersionUID = 3L;

    private String message;

    public ErrorBean() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
