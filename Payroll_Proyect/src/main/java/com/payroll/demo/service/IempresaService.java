package com.payroll.demo.service;

import java.util.List;

import com.payroll.demo.models.entity.registroEmpresa;



public interface IempresaService {
	
	public List<registroEmpresa>listarTodos();
	public void guardar(registroEmpresa empresa);
	public registroEmpresa buscarPorId(Long id);
	public void eliminar(Long id);
	
	

}
