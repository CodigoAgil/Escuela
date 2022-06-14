package com.escuela.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class TipoUsuario.
 */
@Entity
@Table(name = "TipoUsuario")
public class TipoUsuario {

	/** The id tipo usuario. */
	@Id
	@Column(name = "idTipoUsuario",  nullable = false)
	private Long idTipoUsuario;

	/** The descripcion. */
	@Column(name = "descripcion", length = 50, nullable = false)
	private String descripcion;

	/**
	 * Instantiates a new tipo usuario.
	 */
	public TipoUsuario() {
		super();
	}

	/**
	 * Instantiates a new tipo usuario.
	 *
	 * @param idTipoUsuario
	 *        the id tipo usuario
	 * @param descripcion
	 *        the descripcion
	 */
	public TipoUsuario(final Long idTipoUsuario, final String descripcion) {
		super();
		this.idTipoUsuario = idTipoUsuario;
		this.descripcion = descripcion;
	}

	/**
	 * Gets the id tipo usuario.
	 *
	 * @return the id tipo usuario
	 */
	public Long getIdTipoUsuario() {
		return this.idTipoUsuario;
	}

	/**
	 * Sets the id tipo usuario.
	 *
	 * @param idTipoUsuario
	 *        the new id tipo usuario
	 */
	public void setIdTipoUsuario(final Long idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion
	 *        the new descripcion
	 */
	public void setDescripcion(final String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.descripcion, this.idTipoUsuario);
	}

	/**
	 * Equals.
	 *
	 * @param obj
	 *        the obj
	 * @return true, if successful
	 */
	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if ((obj == null) || (getClass() != obj.getClass())) {
			return false;
		}
		final TipoUsuario other = (TipoUsuario) obj;
		return Objects.equals(this.descripcion, other.descripcion) && Objects.equals(this.idTipoUsuario, other.idTipoUsuario);
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "TipoUsuario [idTipoUsuario=" + this.idTipoUsuario + ", descripcion=" + this.descripcion + "]";
	}

}
