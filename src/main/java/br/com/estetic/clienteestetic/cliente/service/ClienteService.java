package br.com.estetic.clienteestetic.cliente.service;

import br.com.estetic.clienteestetic.cliente.api.ClienteDetalhadoResponse;
import br.com.estetic.clienteestetic.cliente.api.ClienteListResponse;
import br.com.estetic.clienteestetic.cliente.api.ClienteRequest;
import br.com.estetic.clienteestetic.cliente.api.ClienteResponse;

import java.util.List;
import java.util.UUID;

public interface ClienteService {
    ClienteResponse criaCliente(ClienteRequest clienteRequest);
    List<ClienteListResponse> buscaTodosClientes();
    ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
}
