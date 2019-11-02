package io.swagger.business.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.business.persistence.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
