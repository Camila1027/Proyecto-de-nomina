package com.payroll.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.payroll.demo.models.entity.registroEmpresa;


@Repository
public interface empresaRepository extends CrudRepository<registroEmpresa, Long> {

}
