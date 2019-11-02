package io.swagger.business.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.business.persistence.entity.TipoIdentificacion;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {

}
