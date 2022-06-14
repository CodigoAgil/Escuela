package com.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escuela.entity.TipoUsuario;

/**
 * The Interface TipoUsuarioRepository.
 */
@Repository
public interface TipoUsuarioRepository extends JpaRepository<TipoUsuario, Long> {

}
