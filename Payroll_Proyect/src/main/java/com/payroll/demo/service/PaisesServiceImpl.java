package com.payroll.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payroll.demo.models.entity.paises;
import com.payroll.demo.repository.PaisRepository;

@Service
public class PaisesServiceImpl implements IPaisesService{

	@Autowired
	private PaisRepository paisRepository;
	@Override
	public List<paises> listaPaises() {
		
		return (List<paises>) paisRepository.findAll();
	}

}
