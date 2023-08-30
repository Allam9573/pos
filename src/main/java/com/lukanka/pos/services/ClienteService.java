package com.lukanka.pos.services;

import java.util.List;

import com.lukanka.pos.models.Cliente;

public interface ClienteService {

    public void guardarCliente(Cliente cliente);

    public List<Cliente> listarClientes();

}
