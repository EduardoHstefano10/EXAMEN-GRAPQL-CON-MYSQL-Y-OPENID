package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Libro;


public interface LibroRepository extends JpaRepository<Libro, Long>{

}
