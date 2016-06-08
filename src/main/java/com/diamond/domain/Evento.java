package com.diamond.domain;



import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="evento")
public class Evento {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idEvento;
	private String nombreEvento;
	private Integer salon;
	private Date fechaEvento;

	/*tabla organizador*/
	@ManyToOne
	@JoinColumn(name="Organizador_id_organizador")
	private Organizador organizador;
	
	
	/* tabla visitante*/
	/*
	@JoinTable(name="Registro_Visitante",
			joinColumns = {
					@JoinColumn(name = "Evento_id_evento", referencedColumnName = "idEvento")
					},
			inverseJoinColumns = {
					@JoinColumn(name= "Visitamte_id_visitante" ,referencedColumnName ="idVisitante")
			}
   )
	@ManyToMany
	private Collection<Visitante> visitantes;
	*/

	public Integer getIdEvento() {
		return idEvento;
	}


	public void setIdEvento(Integer idEvento) {
		this.idEvento = idEvento;
	}


	public String getNombreEvento() {
		return nombreEvento;
	}


	public void setNombreEvento(String nombreEvento) {
		this.nombreEvento = nombreEvento;
	}


	public Integer getSalon() {
		return salon;
	}


	public void setSalon(Integer salon) {
		this.salon = salon;
	}


	public Date getFechaEvento() {
		return fechaEvento;
	}


	public void setFechaEvento(Date fechaEvento) {
		this.fechaEvento = fechaEvento;
	}


	public Organizador getOrganizador() {
		return organizador;
	}


	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}

	/*
	public Collection<Visitante> getVisitantes() {
		return visitantes;
	}


	public void setVisitantes(Collection<Visitante> visitantes) {
		this.visitantes = visitantes;
	}
	*/
		
}
