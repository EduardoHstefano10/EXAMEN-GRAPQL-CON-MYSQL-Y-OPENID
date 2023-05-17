package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "libro")
	@Data
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlibro")
    private long idlibro;

    private String titulo;
    private String descripcion;
    private int pagina;
    private String edicion;

   

	@ManyToOne
    @JoinColumn(name = "idautor")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "ideditorial")
    private Editorial editorial;

    // Otros campos y relaciones
}
