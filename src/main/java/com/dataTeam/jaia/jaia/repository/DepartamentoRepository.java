package com.dataTeam.jaia.jaia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dataTeam.jaia.jaia.model.Departamento;


public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {

    //busca pelo Id (código do departamento)

    //@Query("SELECT f FROM FUNCIONARIO f JOIN departamento d on d.cod_depart = f.cod_depart WHERE f.cpf_func = f.supervisor")
    //public Optional<Departamento> findByNome_Func(String nome_func);


}


