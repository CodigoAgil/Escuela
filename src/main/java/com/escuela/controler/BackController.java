package com.escuela.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BackController {

	/**
	 * Contacto.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/dasboard", method = RequestMethod.GET)
	public String contacto(final Model model) {
		return "back/index";
	}
}
