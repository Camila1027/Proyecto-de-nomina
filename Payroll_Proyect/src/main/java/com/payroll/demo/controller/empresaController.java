package com.payroll.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.payroll.demo.models.entity.*;
import com.payroll.demo.models.entity.enums.agenteA;
import com.payroll.demo.models.entity.enums.regimen;
import com.payroll.demo.models.entity.enums.respIva;
import com.payroll.demo.models.entity.enums.sector;
import com.payroll.demo.service.*;



@Controller
@RequestMapping("/views/empresas")
public class empresaController{

	@Autowired
	private IempresaService empresaService;
	
	@Autowired
	private IPaisesService paisesService;
	
	@GetMapping("/")
	public String listarEmpresa(Model model) {
		
		List<registroEmpresa> listEmpresas = empresaService.listarTodos();
		
		model.addAttribute("titulo","Empresas Registradas");
		model.addAttribute("listEmpresas", listEmpresas);
		
		return "/views/empresas/listar_empresas";
	}
	
	@GetMapping("/create")
	public String crear(Model model) {
		
		registroEmpresa crear_empresa = new registroEmpresa();
		correo correo = new correo();
		telefonos telefono = new telefonos();
		direcciones direccion = new direcciones();
		
		List<paises> listPaises = paisesService.listaPaises();
		
		
		model.addAttribute("titulo","Registro de Empresa");
		model.addAttribute("crear_empresa",crear_empresa);
		model.addAttribute("correo", correo);
		model.addAttribute("telefono", telefono);
		model.addAttribute("direccion", direccion);
		
		model.addAttribute("paises", listPaises);
		model.addAttribute("agente",agenteA.values());
		model.addAttribute("sector", sector.values());
		model.addAttribute("respIva",respIva.values());
		model.addAttribute("regimen",regimen.values());
		
		
		
		return "/views/empresas/frmRegEmpresa";
		
	}
	
	@PostMapping("/save")
	public String guardar(@ModelAttribute registroEmpresa empresa) {
		empresaService.guardar(empresa);
		System.out.println("Cliente guardado con exito");
		return "redirect:/views/empresas/";
	}
}

