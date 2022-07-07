package com.escuela.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

	/** The descripcion grado. */
	@Column(name = "descripcionGrado", length = 50, nullable = false)
	private String descripcionGrado;

	/** The grupos. */
	@OneToMany(mappedBy = "grado", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Grupo> grupos;

	/**
	 * Instantiates a new grado.
	 *
	 * @param idGrado
	 *        the id grado
	 * @param descripcionGrado
	 *        the descripcion grado
	 * @param grupos
	 *        the grupos
	 */
	public Grado(final Long idGrado, final String descripcionGrado, final List<Grupo> grupos) {
		super();
		this.idGrado = idGrado;
		this.descripcionGrado = descripcionGrado;
		this.grupos = grupos;
	}

	/**
	 * Instantiates a new grado.
	 */
	public Grado() {
		super();
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
	 * Gets the descripcion grado.
	 *
	 * @return the descripcion grado
	 */
	public String getDescripcionGrado() {
		return this.descripcionGrado;
	}

	/**
	 * Sets the descripcion grado.
	 *
	 * @param descripcionGrado
	 *        the new descripcion grado
	 */
	public void setDescripcionGrado(final String descripcionGrado) {
		this.descripcionGrado = descripcionGrado;
	}

	/**
	 * Gets the grupos.
	 *
	 * @return the grupos
	 */
	public List<Grupo> getGrupos() {
		return this.grupos;
	}

	/**
	 * Sets the grupos.
	 *
	 * @param grupos
	 *        the new grupos
	 */
	public void setGrupos(final List<Grupo> grupos) {
		this.grupos = grupos;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.descripcionGrado, this.grupos, this.idGrado);
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
		return Objects.equals(this.descripcionGrado, other.descripcionGrado) && Objects.equals(this.grupos, other.grupos) && Objects.equals(this.idGrado, other.idGrado);
	}

}
