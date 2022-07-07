package com.escuela.service;

import java.util.List;

import com.escuela.entity.Grupo;

/**
 * The Interface GrupoService.
 */
public interface GrupoService {

	/**
	 * Gets the all grupos.
	 *
	 * @return the all grupos
	 */
	public List<Grupo> getAllGrupos();

	/**
	 * Save grupo.
	 *
	 * @param grupo
	 *        the grupo
	 */
	public void saveGrupo(Grupo grupo);

	/**
	 * Gets the grupo by id.
	 *
	 * @param id
	 *        the id
	 * @return the grupo by id
	 */
	public Grupo getGrupoById(long id);

	/**
	 * Delete grupo.
	 *
	 * @param id
	 *        the id
	 */
	public void deleteGrupo(long id);

}
