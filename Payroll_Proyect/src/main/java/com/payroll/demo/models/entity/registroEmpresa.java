
package com.payroll.demo.models.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import com.payroll.demo.models.entity.enums.*;

@Entity
@Table(name = "registro_empresa")
public class registroEmpresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Empresa;

	private String razon_Social;
	private int nit;
	private regimen regimen;
	private respIva respIva;
	private agenteA agente;
	private sector sector;

	@ManyToMany
	@JoinTable(name = "empresa_correo", joinColumns = @JoinColumn(name = "empresa_Id"), inverseJoinColumns = @JoinColumn(name = "Correo_Id"))
	private Set<correo> correos;

	@ManyToMany
	@JoinTable(name = "emp_telefono", joinColumns = @JoinColumn(name = "empresa_Id"), inverseJoinColumns = @JoinColumn(name = "telefono_Id"))
	private Set<telefonos> telef;

	@ManyToMany
	@JoinTable(name = "emp_direcciones", joinColumns = @JoinColumn(name = "empresa_Id"), inverseJoinColumns = @JoinColumn(name = "direccion_Id"))
	private Set<direcciones> direcc;

	@ManyToMany
	@JoinTable(name = "emp_ubicacion", joinColumns = @JoinColumn(name = "empresa_Id"), inverseJoinColumns = @JoinColumn(name = "ubicacion_Id"))
	private List<paises> Pais;

	public Long getId_Empresa() {
		return Id_Empresa;
	}

	public void setId_Empresa(Long id_Empresa) {
		Id_Empresa = id_Empresa;
	}

	public String getRazon_Social() {
		return razon_Social;
	}

	public void setRazon_Social(String razon_Social) {
		this.razon_Social = razon_Social;
	}

	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public regimen getRegimen() {
		return regimen;
	}

	public void setRegimen(regimen regimen) {
		this.regimen = regimen;
	}

	public respIva getRespIva() {
		return respIva;
	}

	public void setRespIva(respIva respIva) {
		this.respIva = respIva;
	}

	public agenteA getAgente() {
		return agente;
	}

	public void setAgente(agenteA agente) {
		this.agente = agente;
	}

	public sector getSector() {
		return sector;
	}

	public void setSector(sector sector) {
		this.sector = sector;
	}

	public Set<correo> getCorreos() {
		return correos;
	}

	public void setCorreos(Set<correo> correos) {
		this.correos = correos;
	}	

	public Set<telefonos> getTelef() {
		return telef;
	}

	public void setTelef(Set<telefonos> telef) {
		this.telef = telef;
	}

	public Set<direcciones> getDirecc() {
		return direcc;
	}

	public void setDirecc(Set<direcciones> direcc) {
		this.direcc = direcc;
	}

	public List<paises> getPais() {
		return Pais;
	}

	public void setPais(List<paises> pais) {
		Pais = pais;
	}

	@Override
	public String toString() {
		return "registroEmpresa [Id_Empresa=" + Id_Empresa + ", razon_Social=" + razon_Social + ", nit=" + nit
				+ ", regimen=" + regimen + ", respIva=" + respIva + ", agente=" + agente + ", sector=" + sector
				+ ", correos=" + correos + ", telef=" + telef + ", direcc=" + direcc + ", Pais=" + Pais + "]";
	}	

}
