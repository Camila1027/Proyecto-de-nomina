package com.payroll.demo.models.entity;


import javax.persistence.*;


@Entity
@Table(name="correo")
public class correo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Correo;
	private String Correo;
	
	public Long getId_Correo() {
		return Id_Correo;
	}

	public void setId_Correo(Long id_Correo) {
		Id_Correo = id_Correo;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}
	
	@Override
	public String toString() {
		return "correoEmpresa [Id_Correo=" + Id_Correo + ", Correo=" + Correo + "]";
	}
	
	
	

}
