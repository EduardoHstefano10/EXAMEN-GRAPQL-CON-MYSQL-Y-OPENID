package com.example.demo.dto;

import lombok.Data;

@Data
public class LibroRequest {
	private	long idlibro;
	private	String titulo; 
	private	String descripcion;
	private	int pagina;
	private	String edicion;
	private	long idautor;
	private	long ideditorial;
}
