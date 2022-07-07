package com.escuela.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.escuela.entity.Grado;
import com.escuela.entity.Grupo;
import com.escuela.service.GradoService;

@Controller
public class GradoController {

	/** The Constant PAGINA_GRUPOS. */
	private static final String PAGINA_GRADOS= "grados";

	/** The Constant PAGINA_NUEVO_GRUPO. */
	private static final String PAGINA_NUEVO_GRADO = "new_grado";

	/** The Constant REDIRIGIR_PAGINA_GRUPOS. */
	private static final String REDIRIGIR_PAGINA_GRADOS = "redirect:/grados";

	/** The Constant PAGINA_ACTUALIZAR_GRUPO. */
	private static final String PAGINA_ACTUALIZAR_GRADO = "update_grado";
	
	@Autowired
	private GradoService gradoService;
	
	/**
	 * View grados page.
	 *
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping("/grados")
	public String viewGradosPage(final Model model) {
		model.addAttribute("listaGrados", this.gradoService.getAllGrados());
		return GradoController.PAGINA_GRADOS;

	}
	
	/**
	 * Show new grado form.
	 *
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping("/showNewGradoForm")
	public String showNewGradoForm(final Model model) {

		final Grado grado = new Grado();
		model.addAttribute("grado", grado);

		return GradoController.PAGINA_NUEVO_GRADO;
	}
	
	
	/**
	 * Save grado.
	 *
	 * @param grado
	 *        the grado
	 * @param model
	 *        the model
	 * @return the string
	 */
	@PostMapping("/saveGrado")
	public String saveGrado(final Grado grado, final Model model) {
		this.gradoService.saveGrado(grado);
		return GradoController.REDIRIGIR_PAGINA_GRADOS;
	}
	
	/**
	 * Show form for update grado.
	 *
	 * @param id
	 *        the id
	 * @param model
	 *        the model
	 * @return the string
	 */
	@GetMapping("/showFormForUpdateGrado/{id}")
	public String showFormForUpdateGrado(@PathVariable(value = "id") final long id, final Model model) {

		final Grado grado = this.gradoService.getGradoById(id);
		model.addAttribute("grado", grado);

		return GradoController.PAGINA_ACTUALIZAR_GRADO;

	}
	
	/**
	 * Update grado.
	 *
	 * @param grado
	 *        the grado
	 * @param model
	 *        the model
	 * @return the string
	 */
	@PostMapping("/updateGrado")
	public String updateGrado(final Grado grado, final Model model) {
		this.gradoService.saveGrado(grado);
		return GradoController.REDIRIGIR_PAGINA_GRADOS;
	}
	
	/**
	 * Delete grupo.
	 *
	 * @param id
	 *        the id
	 * @return the string
	 */
	@GetMapping("/deleteGrado/{id}")
	public String deleteGrado(@PathVariable(value = "id") final long id) {
		this.gradoService.deleteGrado(id);
		return GradoController.REDIRIGIR_PAGINA_GRADOS;

	}

}
