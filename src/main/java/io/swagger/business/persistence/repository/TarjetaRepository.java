package io.swagger.business.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.business.persistence.entity.Tarjeta;

public interface TarjetaRepository extends JpaRepository<Tarjeta, Integer> {
	
	public Tarjeta findByNroTarjeta(String nroTarjeta);

}
