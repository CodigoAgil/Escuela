package com.escuela.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The Class Grupo.
 */
@Entity
@Table(name = "Grupo")
public class Grupo {

	/** The id grupo. */
	@Id
	@Column(name = "idGrupo", nullable = false)
	private Long idGrupo;

	/** The grado. */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idGrado", nullable = false)
	private Grado grado;

	/**
	 * Instantiates a new grupo.
	 *
	 * @param idGrupo
	 *        the id grupo
	 * @param grado
	 *        the grado
	 */
	public Grupo(final Long idGrupo, final Grado grado) {
		super();
		this.idGrupo = idGrupo;
		this.grado = grado;
	}

	/**
	 * Instantiates a new grupo.
	 */
	public Grupo() {
		super();
	}

	/**
	 * Gets the id grupo.
	 *
	 * @return the id grupo
	 */
	public Long getIdGrupo() {
		return this.idGrupo;
	}

	/**
	 * Sets the id grupo.
	 *
	 * @param idGrupo
	 *        the new id grupo
	 */
	public void setIdGrupo(final Long idGrupo) {
		this.idGrupo = idGrupo;
	}

	/**
	 * Gets the grado.
	 *
	 * @return the grado
	 */
	public Grado getGrado() {
		return this.grado;
	}

	/**
	 * Sets the grado.
	 *
	 * @param grado
	 *        the new grado
	 */
	public void setGrado(final Grado grado) {
		this.grado = grado;
	}

	/**
	 * Hash code.
	 *
	 * @return the int
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.grado, this.idGrupo);
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
		final Grupo other = (Grupo) obj;
		return Objects.equals(this.grado, other.grado) && Objects.equals(this.idGrupo, other.idGrupo);
	}

}
