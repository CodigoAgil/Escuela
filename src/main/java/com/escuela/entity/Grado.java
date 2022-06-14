package com.escuela.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The Class Grado.
 */
@Entity
@Table(name = "Grado")
public class Grado {

	/** The id grado. */
	@Id
	@Column(name = "idGrado", nullable = false)
	private Long idGrado;

	/** The nombre grado. */
	@Column(name = "nombreGrado", length = 50, nullable = false)
	private String nombreGrado;

	/** The seccion. */
	@Column(name = "seccion", length = 4, nullable = false)
	private String seccion;

	/** The tutor. */
	@Column(name = "tutor", length = 30, nullable = false)
	private String tutor;

	/*
	 * Fran todavia no esta la entidad Institucion que tiene relacion con esta entidad.
	 */

	/**
	 * Instantiates a new grado.
	 */
	public Grado() {
		super();
	}

	/**
	 * Instantiates a new grado.
	 *
	 * @param idGrado
	 *        the id grado
	 * @param nombreGrado
	 *        the nombre grado
	 * @param seccion
	 *        the seccion
	 * @param tutor
	 *        the tutor
	 */
	public Grado(final Long idGrado, final String nombreGrado, final String seccion, final String tutor) {
		super();
		this.idGrado = idGrado;
		this.nombreGrado = nombreGrado;
		this.seccion = seccion;
		this.tutor = tutor;
	}

	/**
	 * Gets the id grado.
	 *
	 * @return the id grado
	 */
	public Long getIdGrado() {
		return this.idGrado;
	}

	/**
	 * Sets the id grado.
	 *
	 * @param idGrado
	 *        the new id grado
	 */
	public void setIdGrado(final Long idGrado) {
		this.idGrado = idGrado;
	}

	/**
	 * Gets the nombre grado.
	 *
	 * @return the nombre grado
	 */
	public String getNombreGrado() {
		return this.nombreGrado;
	}

	/**
	 * Sets the nombre grado.
	 *
	 * @param nombreGrado
	 *        the new nombre grado
	 */
	public void setNombreGrado(final String nombreGrado) {
		this.nombreGrado = nombreGrado;
	}

	/**
	 * Gets the seccion.
	 *
	 * @return the seccion
	 */
	public String getSeccion() {
		return this.seccion;
	}

	/**
	 * Sets the seccion.
	 *
	 * @param seccion
	 *        the new seccion
	 */
	public void setSeccion(final String seccion) {
		this.seccion = seccion;
	}

	/**
	 * Gets the tutor.
	 *
	 * @return the tutor
	 */
	public String getTutor() {
		return this.tutor;
	}

	/**
	 * Sets the tutor.
	 *
	 * @param tutor
	 *        the new tutor
	 */
	public void setTutor(final String tutor) {
		this.tutor = tutor;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.idGrado, this.nombreGrado, this.seccion, this.tutor);
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
		final Grado other = (Grado) obj;
		return Objects.equals(this.idGrado, other.idGrado) && Objects.equals(this.nombreGrado, other.nombreGrado) && Objects.equals(this.seccion, other.seccion)
				&& Objects.equals(this.tutor, other.tutor);
	}

	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Grado [idGrado=" + this.idGrado + ", nombreGrado=" + this.nombreGrado + ", seccion=" + this.seccion + ", tutor=" + this.tutor + "]";
	}

}
