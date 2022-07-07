package com.escuela.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escuela.entity.Grado;
import com.escuela.repository.GradoRepository;

/**
 * The Class GradoServiceImpl.
 */
@Service
public class GradoServiceImpl implements GradoService {

	/** The grado repository. */
	@Autowired
	private GradoRepository gradoRepository;

	/**
	 * Gets the all grados.
	 *
	 * @return the all grados
	 */
	@Override
	public List<Grado> getAllGrados() {
		return this.gradoRepository.findAll();
	}

	/**
	 * Save grado.
	 *
	 * @param grado the grado
	 */
	@Override
	public void saveGrado(Grado grado) {
		this.gradoRepository.save(grado);

	}

	/**
	 * Gets the grado by id.
	 *
	 * @param id the id
	 * @return the grado by id
	 */
	@Override
	public Grado getGradoById(long id) {
		final Optional<Grado> optional = this.gradoRepository.findById(id);
		Grado grado = null;

		if(optional.isPresent()) {
			grado = optional.get();
		} else {
			throw new RuntimeException("Grado no encontrado por id :: " + id);
		}

		return grado;
	}

	/**
	 * Delete grado.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteGrado(long id) {
		this.gradoRepository.deleteById(id);
	}
}
