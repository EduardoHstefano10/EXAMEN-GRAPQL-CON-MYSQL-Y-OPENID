package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Autor;


public interface AutorRepository extends JpaRepository<Autor, Long> {

}
