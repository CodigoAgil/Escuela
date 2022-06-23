package com.escuela.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escuela.entity.TipoUsuario;
import com.escuela.repository.TipoUsuarioRepository;


/**
 * The Class TipoUsuarioServiceImpl.
 */
@Service
public class TipoUsuarioServiceImpl implements TipoUsuarioService {

	/** The tipo usuario repository. */
	@Autowired
	private TipoUsuarioRepository tipoUsuarioRepository;

	/**
	 * Gets the all tipo usuario.
	 *
	 * @return the all tipo usuario
	 */
	@Override
	public List<TipoUsuario> getAllTipoUsuario() {
		return tipoUsuarioRepository.findAll();
	}

	/**
	 * Save tipo usuario.
	 *
	 * @param tipoUsuario the tipo usuario
	 */
	@Override
	public void saveTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuarioRepository.save(tipoUsuario);
	}

	/**
	 * Gets the tipo usuario by id.
	 *
	 * @param id the id
	 * @return the tipo usuario by id
	 */
	@Override
	public TipoUsuario getTipoUsuarioById(long id) {

		final Optional<TipoUsuario> optional = this.tipoUsuarioRepository.findById(id);
		TipoUsuario tipoUsuario = null;

		if(optional.isPresent()) {
			tipoUsuario = optional.get();

		}else {
			throw new RuntimeException("Tipo de usuario no encontrado por id :: " + id);
		}

		return tipoUsuario;
	}

	/**
	 * Delete tipo usuario by id.
	 *
	 * @param id the id
	 */
	@Override
	public void deleteTipoUsuarioById(long id) {
		this.tipoUsuarioRepository.deleteById(id);

	}

}
