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
@Table(name= "editorial")
@Data

public class Editorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "ideditorial")
	private long ideditorial;
	
	private String nombre;
	private String pais;
	
	@OneToMany(mappedBy = "editorial")
	private List<Libro> libros;

}
