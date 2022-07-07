package com.escuela.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escuela.entity.Grupo;
import com.escuela.repository.GrupoRepository;

/**
 * The Class GrupoServiceImpl.
 */
@Service
public class GrupoServiceImpl implements GrupoService {

	/** The grupo repository. */
	@Autowired
	private GrupoRepository grupoRepository;

	/**
	 * Gets the all grupos.
	 *
	 * @return the all grupos
	 */
	@Override
	public List<Grupo> getAllGrupos() {
		return this.grupoRepository.findAll();
	}

	/**
	 * Save grupo.
	 *
	 * @param grupo
	 *        the grupo
	 */
	@Override
	public void saveGrupo(final Grupo grupo) {
		this.grupoRepository.save(grupo);

	}

	/**
	 * Gets the grupo by id.
	 *
	 * @param id
	 *        the id
	 * @return the grupo by id
	 */
	@Override
	public Grupo getGrupoById(final long id) {

		final Optional<Grupo> optional = this.grupoRepository.findById(id);
		Grupo grupo = null;

		if (optional.isPresent()) {
			grupo = optional.get();
		} else {
			throw new RuntimeException("Grupo no encontrado por id :: " + id);
		}

		return grupo;
	}

	/**
	 * Delete grupo.
	 *
	 * @param id
	 *        the id
	 */
	@Override
	public void deleteGrupo(final long id) {
		this.grupoRepository.deleteById(id);
	}

}
