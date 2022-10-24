package com.payroll.demo.models.entity.enums;

public enum agenteA {
	si("si"),
	no("no");
	
	private final String selec;
	
	agenteA (String selec) {
		this.selec = selec;
	}

	public String getSelec() {
		return selec;
	}
}
