package com.payroll.demo.models.entity;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "telefonos")
public class telefonos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Telefono;
	private int telefono;
	private int celular;

	public Long getId_Telefono() {
		return Id_Telefono;
	}

	public void setId_Telefono(Long id_Telefono) {
		Id_Telefono = id_Telefono;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public int getCelular() {
		return celular;
	}

	public void setCelular(int celular) {
		this.celular = celular;
	}

	@Override
	public String toString() {
		return "telefonosEmpresa [Id_Telefono=" + Id_Telefono + ", telefono=" + telefono + ", celular=" + celular
				+"]";
	}
	
	
	
	
}
