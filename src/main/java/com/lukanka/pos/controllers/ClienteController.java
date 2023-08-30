package com.lukanka.pos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lukanka.pos.services.impl.CategoriaImpl;
import com.lukanka.pos.services.impl.ClienteImpl;

@Controller
@RequestMapping(value = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteImpl clienteImpl;
    @Autowired
    private CategoriaImpl categoriaImpl;

    @GetMapping({ "/", "", "/home" })
    public String home(Model model) {
        model.addAttribute("categorias", this.categoriaImpl.listarCategorias());
        return "index";
    }

    @GetMapping(value = "/listar-clientes")
    public String listarClientes(Model model) {
        model.addAttribute("clientes", clienteImpl.listarClientes());
        return "clientes";
    }
    
}
