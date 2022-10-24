package com.payroll.demo.models.entity.enums;

public enum respIva {
	si("si"),
	no("no");
	
	private final String selec;
	
	respIva (String selec) {
		this.selec = selec;
	}

	public String getSelec() {
		return selec;
	}
}
