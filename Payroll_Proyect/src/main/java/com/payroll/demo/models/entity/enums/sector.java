package com.payroll.demo.models.entity.enums;

public enum sector {
	Agropecuario("AGROPECUARIO"),
	Comerci_servicios("COMERCIO Y SERVICIOS"),
	Comercio_exterior("COMERCIO EXTERIOR"),
	Construccion("CONSTRUCCION"),
	Industria("INDUSTRIA"),
	Precios("PRECIOS"),
	Economia_Regional("ECONOMIA REGIONAL"),
	Educacion("EDUCACION"),
	Tecnologias_informacion("TECNOLOGIAS DE INFORMACION"),
	Indicadores_Competitividad("INDICADORES DE COMPETITIVIDAD");
	
	
	private final String nombre;
	
	sector(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
}
