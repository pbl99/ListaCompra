package com.palmen.form.listacompra.controllers;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.palmen.form.listacompra.models.ListaCompra;

@Controller
public class ListaCompraController {

	@GetMapping("/")
	public String mostrarFormulario() {
		return "index";
	}

	@PostMapping("/muestraLista")
	public String muestraLista(ListaCompra listaCompra, Model model) {
		model.addAttribute("listaCompra", listaCompra);

		return "resultadoLista";
	}
}
