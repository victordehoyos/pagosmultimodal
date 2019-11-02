package io.swagger.business.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.business.persistence.entity.Password;

public interface PasswordRepository extends JpaRepository<Password, Integer> {

}
