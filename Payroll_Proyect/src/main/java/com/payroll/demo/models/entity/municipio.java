package com.payroll.demo.models.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="municipios")
public class municipio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private int codigo;
	private String nombre;
	
	
	private Long id_dep;
	
	public Long getId_mun() {
		return Id;
	}
	public Long getId_dep() {
		return id_dep;
	}
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setId_mun(Long id_mun) {
		this.Id = id_mun;
	}
	public void setId_dep(Long id_dep) {
		this.id_dep = id_dep;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "municipio [id_mun=" + Id + ", id_dep=" + id_dep + ", codigo=" + codigo + ", nombre=" + nombre + "]";
	}

}
