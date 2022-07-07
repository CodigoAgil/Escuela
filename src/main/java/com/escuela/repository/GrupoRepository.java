package com.escuela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.escuela.entity.Grupo;

/**
 * The Interface GrupoRepository.
 */
@Repository
public interface GrupoRepository extends JpaRepository<Grupo, Long> {

}
