package com.lukanka.pos.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.pos.models.Categoria;
import com.lukanka.pos.repositories.CategoriaRepository;
import com.lukanka.pos.services.CategoriaService;

@Service
public class CategoriaImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> listarCategorias() {
        return (List<Categoria>) this.categoriaRepository.findAll();
    }

}
