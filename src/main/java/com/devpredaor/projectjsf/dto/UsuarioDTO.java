/**
 * 
 */
package com.devpredaor.projectjsf.dto;

/**
 * @author EricK Michel Cruz Ceron
 * Clase que permitirá contener la infomación del usuario en sesión
 *
 */
public class UsuarioDTO {

	/**
	 * NickName.
	 */
	private String usuario;
	/**
	 * Contraeña.
	 */
	private String password;
	
	
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
}
