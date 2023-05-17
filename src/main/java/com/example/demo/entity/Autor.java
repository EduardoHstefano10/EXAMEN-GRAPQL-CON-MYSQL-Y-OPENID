package com.example.demo.entity;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name= "autor")
@Data


public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "idautor")
	private long idautor;
	
	private String nombre;
	private String apellidos;
	private String pais;
	
	
	
	



	@OneToMany(mappedBy = "autor")
	private List<Libro> libros;

}

