package com.consultorio.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rol_usuario")
public class Rol_Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario",nullable = false)
	private Usuario usuario;
	
	@ManyToOne
	@JoinColumn (name = "id_rol",nullable = false)
	private Rol rol;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	

}
