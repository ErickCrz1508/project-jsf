/**
 * 
 */
package com.devpredaor.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.devpredaor.projectjsf.dto.UsuarioDTO;

/**
 * @author Erick Michel cruz ceron Clase que permite controlar el funcionamiento
 *         con la pantalla de login.xhtml
 */
@ManagedBean
public class LoginController {
	/**
	 * Usuario que ingresa en el login
	 */
	private String usuario;
	/**
	 * contraseña que ingresa en el login
	 */
	private String password;

	/**
	 * Bean que mantiene la informacion en sesión.
	 */
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	/**
	 * Metodo que nos permite ingresar a la pantalla principal del proyecto
	 */
	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		if (usuario.equals("erick") && password.equals("123")) {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Correcto", ""));
			
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO(); 
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				this.sessionController.setUsuarioDTO(usuarioDTO);
				
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La página no existe.", ""));
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraseña Inorrectos", ""));

		}
	}
	
	private void redireccionar(String paqina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(paqina);
		
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the sessionController
	 */
	public SessionController getSessionController() {
		return sessionController;
	}

	/**
	 * @param sessionController the sessionController to set
	 */
	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}

}
