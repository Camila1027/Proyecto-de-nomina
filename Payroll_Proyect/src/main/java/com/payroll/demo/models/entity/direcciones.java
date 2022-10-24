package com.payroll.demo.models.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="direcciones")
public class direcciones implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long Id_Direccion;
	public String Direccion;
	
	
	public Long getId_Direccion() {
		return Id_Direccion;
	}
	public void setId_Direccion(Long id_Direccion) {
		Id_Direccion = id_Direccion;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	@Override
	public String toString() {
		return "direcciones [Id_Direccion=" + Id_Direccion + ", Direccion=" + Direccion + "]";
	}
	

}
