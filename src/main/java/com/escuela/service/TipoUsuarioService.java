package com.escuela.service;

import java.util.List;

import com.escuela.entity.TipoUsuario;

/**
 * The Interface TipoUsuarioService.
 */
public interface TipoUsuarioService {

	/**
	 * Gets the all tipo usuario.
	 *
	 * @return the all tipo usuario
	 */
	public List<TipoUsuario> getAllTipoUsuario();

	/**
	 * Save tipo usuario.
	 *
	 * @param tipoUsuario
	 *        the tipo usuario
	 */
	public void saveTipoUsuario(TipoUsuario tipoUsuario);

	/**
	 * Gets the tipo usuario by id.
	 *
	 * @param id
	 *        the id
	 * @return the tipo usuario by id
	 */
	public TipoUsuario getTipoUsuarioById(long id);

	/**
	 * Delete tipo usuario by id.
	 *
	 * @param id
	 *        the id
	 */
	public void deleteTipoUsuarioById(long id);
}
