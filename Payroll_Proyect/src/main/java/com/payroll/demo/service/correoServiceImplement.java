package com.payroll.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.payroll.demo.models.entity.correo;
import com.payroll.demo.repository.CorreoEmpresaRespitory;

@Service
public class correoServiceImplement implements ICorreoEmpresaService {
	@Autowired
	private CorreoEmpresaRespitory correoRepository;

	@Override
	public List<correo> listaCorreos() {

		return (List<correo>) correoRepository.findAll();
	}

}
