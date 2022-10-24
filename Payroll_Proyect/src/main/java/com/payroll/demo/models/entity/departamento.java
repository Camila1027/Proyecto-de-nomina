package com.payroll.demo.models.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamentos")
public class departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	private int codigo;
	
	public Long getId_dep() {
		return Id;
	}
	public String getNombre() {
		return nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setId_dep(Long id_dep) {
		this.Id = id_dep;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return "departamento [id_dep=" + Id + ", nombre=" + nombre + ", codigo=" + codigo + "]";
	} 
	

}
