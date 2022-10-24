package com.payroll.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.demo.models.entity.direcciones;

import com.payroll.demo.repository.DireccionRepository;

@Service
public class direccionesServiceImplement implements IDireccionService {

	@Autowired
	private DireccionRepository direccionRepository;

	@Override
	public List<direcciones> listaDirecciones() {
		return (List<direcciones>) direccionRepository.findAll();
	}

}
