package com.lukanka.pos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lukanka.pos.models.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
    
}
