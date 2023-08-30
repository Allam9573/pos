package com.lukanka.pos.repositories;

import org.springframework.data.repository.CrudRepository;

import com.lukanka.pos.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Integer> {
    
}
