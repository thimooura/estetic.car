package br.com.estetic.clienteestetic.cliente.Clienteapplication.service;

import br.com.estetic.clienteestetic.cliente.Clienteapplication.api.ClienteDetalhadoResponse;
import br.com.estetic.clienteestetic.cliente.Clienteapplication.api.ClienteListResponse;
import br.com.estetic.clienteestetic.cliente.Clienteapplication.api.ClienteRequest;
import br.com.estetic.clienteestetic.cliente.Clienteapplication.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
