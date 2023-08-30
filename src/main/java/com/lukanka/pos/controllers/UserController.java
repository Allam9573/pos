package com.lukanka.pos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lukanka.pos.models.Cliente;
import com.lukanka.pos.services.impl.ClienteImpl;

@Controller
public class UserController {

    @Autowired
    private ClienteImpl clienteImpl;

    @GetMapping(value="/home")
    public String home(){
        return "home";
    }

    @GetMapping(value = "/nuevo-cliente")
    public String index() {
        return "index";
    }

    @GetMapping(value = "/listar-clientes")
    public String listarClientes(Model model) {
        model.addAttribute("clientes", this.clienteImpl.listarClientes());
        return "clientes";
    }

    @PostMapping(value = "/api/crear-cliente")
    public String guardarCliente(@RequestParam String nombre, @RequestParam String correo,
            @RequestParam String telefono) {
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        this.clienteImpl.guardarCliente(cliente);
        return "redirect:/listar-clientes";
    }
}
