package com.escuela.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.escuela.entity.Grupo;
import com.escuela.service.GrupoService;

/**
 * The Class GrupoController.
 */
@Controller
public class GrupoController {

	/** The Constant PAGINA_GRUPOS. */
	private static final String PAGINA_GRUPOS = "grupos";

	/** The Constant PAGINA_NUEVO_GRUPO. */
	private static final String PAGINA_NUEVO_GRUPO = "new_grupo";

	/** The Constant REDIRIGIR_PAGINA_GRUPOS. */
	private static final String REDIRIGIR_PAGINA_GRUPOS = "redirect:/grupos";

	/** The Constant PAGINA_ACTUALIZAR_GRUPO. */
	private static final String PAGINA_ACTUALIZAR_GRUPO = "update_grupo";

	/** The grupo service. */
	@Autowired
	private GrupoService grupoService;

	/**
	 * View grupos page.
	 *
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping("/grupos")
	public String viewGruposPage(final Model model) {
		model.addAttribute("listaGrupos", this.grupoService.getAllGrupos());
		return GrupoController.PAGINA_GRUPOS;

	}

	/**
	 * Show new grupo form.
	 *
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping("/showNewTagForm")
	public String showNewGrupoForm(final Model model) {

		final Grupo grupo = new Grupo();
		model.addAttribute("grupo", grupo);

		return GrupoController.PAGINA_NUEVO_GRUPO;
	}

	/**
	 * Save grupo.
	 *
	 * @param grupo
	 *        the grupo
	 * @param model
	 *        the model
	 * @return the string
	 */
	@PostMapping("/saveGrupo")
	public String saveGrupo(final Grupo grupo, final Model model) {
		this.grupoService.saveGrupo(grupo);
		return GrupoController.REDIRIGIR_PAGINA_GRUPOS;
	}

	/**
	 * Show form for update grupo.
	 *
	 * @param id
	 *        the id
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping("/showFormForUpdateGrupo/{id}")
	public String showFormForUpdateGrupo(@PathVariable(value = "id") final long id, final Model model) {

		final Grupo grupo = this.grupoService.getGrupoById(id);
		model.addAttribute("grupo", grupo);

		return GrupoController.PAGINA_ACTUALIZAR_GRUPO;

	}

	/**
	 * Update grupo.
	 *
	 * @param grupo
	 *        the grupo
	 * @param model
	 *        the model
	 * @return the string
	 */
	@PostMapping("/updateGrupo")
	public String updateGrupo(final Grupo grupo, final Model model) {
		this.grupoService.saveGrupo(grupo);
		return GrupoController.REDIRIGIR_PAGINA_GRUPOS;
	}

	/**
	 * Delete grupo.
	 *
	 * @param id
	 *        the id
	 * @return the string
	 */
	@GetMapping("/deleteGrupo/{id}")
	public String deleteGrupo(@PathVariable(value = "id") final long id) {
		this.grupoService.getGrupoById(id);
		return GrupoController.REDIRIGIR_PAGINA_GRUPOS;

	}

}
