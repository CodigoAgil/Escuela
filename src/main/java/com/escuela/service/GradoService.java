package com.escuela.service;

import java.util.List;

import com.escuela.entity.Grado;

public interface GradoService {

	/**
	 * Gets the all grado.
	 *
	 * @return the all grado
	 */
	public List<Grado> getAllGrados();

	/**
	 * Save grado.
	 *
	 * @param grado
	 *        the grado
	 */
	public void saveGrado(Grado grado);

	/**
	 * Gets the grado by id.
	 *
	 * @param id
	 *        the id
	 * @return the grado by id
	 */
	public Grado getGradoById(long id);

	/**
	 * Delete grado.
	 *
	 * @param id
	 *        the id
	 */
	public void deleteGrado(long id);
}
