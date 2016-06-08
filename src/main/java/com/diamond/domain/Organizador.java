package com.diamond.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="organizador")
public class Organizador {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idOrganizador;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String calle;
	private String colonia;
	private Integer numInt;
	private Integer numExt;
	private Integer cp;
	private String email;
	private Integer telefono;
	private String usuario;
	private String password;
	
	@OneToMany(mappedBy="organizador")
	private List<Evento> listaeventos;

	public Integer getIdOrganizador() {
		return idOrganizador;
	}

	public void setIdOrganizador(Integer idOrganizador) {
		this.idOrganizador = idOrganizador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public Integer getNumInt() {
		return numInt;
	}

	public void setNumInt(Integer numInt) {
		this.numInt = numInt;
	}

	public Integer getNumExt() {
		return numExt;
	}

	public void setNumExt(Integer numExt) {
		this.numExt = numExt;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Evento> getListaeventos() {
		return listaeventos;
	}

	public void setListaeventos(List<Evento> listaeventos) {
		this.listaeventos = listaeventos;
	}


	

}
