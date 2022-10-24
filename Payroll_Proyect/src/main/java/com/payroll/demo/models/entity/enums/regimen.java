package com.payroll.demo.models.entity.enums;

public enum regimen {

	Gran_Contribuyente("GRAN CONTRIBUYENTE"),
	Autorretenedor("AUTORETENEDOR"),
	Regimen_Comun("REGIMEN SIMPLE"),
	Regimen_Simplificado("REGIMEN SIMPLIFICADO"),
	Regimen_Especial("REGIMEN ESPECIAL");
	
	private final String tipo;
	regimen(String tipo){
		this.tipo = tipo;
	}
	public String getTipo() {
		return tipo;
	}
}
