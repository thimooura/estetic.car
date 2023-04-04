package br.com.estetic.clienteestetic.cliente.repository;

import br.com.estetic.clienteestetic.cliente.domain.Cliente;

import java.util.List;
import java.util.UUID;


    public interface ClienteRepository {
        Cliente salva(Cliente cliente);
        List<Cliente> buscaTodosClientes();
        Cliente buscaClienteAtravesId(UUID idCliente);
    }

