package com.palmen.form.listacompra.models;

import java.time.LocalDate;

public class ListaCompra {
	private String nombrelista;
	private String descripcion;
	private String items;
	private String fecha;

	public String getNombrelista() {
		return nombrelista;
	}

	public void setNombrelista(String nombrelista) {
		this.nombrelista = nombrelista;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
