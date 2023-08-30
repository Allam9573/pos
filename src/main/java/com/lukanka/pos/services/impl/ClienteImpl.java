package com.lukanka.pos.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.pos.models.Cliente;
import com.lukanka.pos.repositories.ClienteRepository;
import com.lukanka.pos.services.ClienteService;

@Service
public class ClienteImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void guardarCliente(Cliente cliente) {
        this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> listarClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

}
