package com.payroll.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.demo.models.entity.registroEmpresa;
import com.payroll.demo.repository.empresaRepository;


@Service
public class empresaServiceImplement implements IempresaService {

	@Autowired
	private empresaRepository empresaRepository;
	
	@Override
	public List<registroEmpresa> listarTodos() {
		return (List<registroEmpresa>) empresaRepository.findAll();
	}

	@Override
	public void guardar(registroEmpresa empresa) {
		empresaRepository.save(empresa);

	}

	@Override
	public registroEmpresa buscarPorId(Long id) {
		return empresaRepository.findById(id).orElse(null);
	}

	@Override
	public void eliminar(Long id) {
		empresaRepository.deleteById(id);

	}

}
