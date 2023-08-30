package com.lukanka.pos.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lukanka.pos.models.Cliente;
import com.lukanka.pos.services.impl.ClienteImpl;

@RestController
@RequestMapping(value = "/api/clientes")
public class ClienteRest {
    @Autowired
    private ClienteImpl clienteImpl;

    @PostMapping(value = "/nuevo-cliente")
    public ModelAndView guardarCliente(@RequestParam String nombre, @RequestParam String correo,
            @RequestParam String telefono) {
        ModelAndView redirect = new ModelAndView("redirect:/clientes/listar-clientes");
        Cliente cliente = new Cliente();
        cliente.setNombre(nombre);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        clienteImpl.guardarCliente(cliente);
        return redirect;    
    }

}
