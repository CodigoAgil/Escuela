package com.escuela.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.escuela.service.TipoUsuarioService;

/**
 * The Class TipoUsuarioController.
 */
@Controller
public class TipoUsuarioController {

	/** The Constant PAGINA_TIPOS_USUARIO. */
	private static final String PAGINA_TIPOS_USUARIO = "prueba";


	/** The tipo usuario service. */
	@Autowired
	private TipoUsuarioService tipoUsuarioService;


	/**
	 * View tipo usuario page.
	 *
	 * @param model the model
	 * @return the string
	 */
	@GetMapping("/tiposUsuarios")
	public String viewTipoUsuarioPage (final Model model) {
		model.addAttribute("listaTiposUsuario",this.tipoUsuarioService.getAllTipoUsuario());
		return TipoUsuarioController.PAGINA_TIPOS_USUARIO;

	}
}
