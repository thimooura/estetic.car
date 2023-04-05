package br.com.estetic.clienteestetic.cliente.Clienteapplication.service;

import br.com.estetic.clienteestetic.cliente.Clienteapplication.api.ClienteDetalhadoResponse;
import br.com.estetic.clienteestetic.cliente.Clienteapplication.api.ClienteListResponse;
import br.com.estetic.clienteestetic.cliente.Clienteapplication.api.ClienteRequest;
import br.com.estetic.clienteestetic.cliente.Clienteapplication.api.ClienteResponse;
import br.com.estetic.clienteestetic.cliente.domain.Cliente;
import br.com.estetic.clienteestetic.cliente.Clienteapplication.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Log4j2
@Service
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {
    private final ClienteRepository clienteRepository;

    @Override
    public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
        log.info("[inicia] ClienteApplicationService - criaCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
        log.info("[finaliza] ClienteApplicationService - criaCliente");
        return ClienteResponse.builder()
                .idCliente(cliente.getIdCliente())
                .build();
    }

    @Override
    public List<ClienteListResponse> buscaTodosClientes() {
        log.info("[inicia] ClienteApplicationService - buscaTodosClientes");
        List<Cliente> clientes = clienteRepository.buscaTodosClientes();
        log.info("[finaliza] ClienteApplicationService - buscaTodosClientes");
        return ClienteListResponse.converte(clientes);
    }

    @Override
    public ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente) {
        log.info("[inicia] ClienteApplicationService - buscaClienteAtravesId");
        Cliente cliente = clienteRepository.buscaClienteAtravesId(idCliente);
        log.info("[finaliza] ClienteApplicationService - buscaClienteAtravesId");
        return new ClienteDetalhadoResponse(cliente);
    }
}
