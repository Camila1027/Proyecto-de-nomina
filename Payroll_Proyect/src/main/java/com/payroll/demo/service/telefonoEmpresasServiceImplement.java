package com.payroll.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.demo.models.entity.telefonos;
import com.payroll.demo.repository.TelefonoRepository;

@Service
public class telefonoEmpresasServiceImplement implements ITeleEmpService {

	@Autowired
	private TelefonoRepository telefonoRepository;
	
	@Override
	public List<telefonos> listaTelefonos() {
		return (List<telefonos>) telefonoRepository.findAll();
	}

}
