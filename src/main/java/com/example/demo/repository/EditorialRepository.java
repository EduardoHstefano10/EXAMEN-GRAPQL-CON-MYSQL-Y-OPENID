package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Editorial;


public interface EditorialRepository extends JpaRepository<Editorial, Long> {

}
