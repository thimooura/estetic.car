package br.com.estetic.clienteestetic.cliente.Clienteapplication.api;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Builder
@Value
public class ClienteResponse {
    private UUID idCliente;
}
