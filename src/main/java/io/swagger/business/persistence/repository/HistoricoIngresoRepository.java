package io.swagger.business.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.business.persistence.entity.HistoricoIngreso;

public interface HistoricoIngresoRepository extends JpaRepository<HistoricoIngreso, Integer> {

}
