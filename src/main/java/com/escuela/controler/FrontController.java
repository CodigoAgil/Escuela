package com.escuela.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FrontController {
	/**
	 * Home.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(final Model model) {
		return "index";
	}
	
	/**
	 * Contacto.
	 *
	 * @param model the model
	 * @return the string
	 */
	@RequestMapping(value = "/contacto", method = RequestMethod.GET)
	public String contacto(final Model model) {
		return "contacto";
	}
	
}
