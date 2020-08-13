package com.curso.api.repositories;

import com.curso.api.models.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
    Categoria findByDescripcion(String descripcion);
    @Query("SELECT c from Categoria c WHERE descripcion=?1")
    Categoria getByDescripcion(String descripion);
}