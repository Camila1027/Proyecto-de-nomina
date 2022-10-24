package com.payroll.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="paises")
public class paises {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Pais;
	private String pais;
	
	
	public Long getId_Pais() {
		return Id_Pais;
	}
	public void setId_Pais(Long id_Pais) {
		Id_Pais = id_Pais;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "paises [Id_Pais=" + Id_Pais + ", pais=" + pais + "]";
	}
	
	
	
}
