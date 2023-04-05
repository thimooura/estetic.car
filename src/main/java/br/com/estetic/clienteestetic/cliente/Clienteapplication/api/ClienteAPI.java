package br.com.estetic.clienteestetic.cliente.Clienteapplication.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

    @RestController
    @RequestMapping("/v1/cliente")
    public interface ClienteAPI {
        @PostMapping
        @ResponseStatus(code = HttpStatus.CREATED)
        ClienteResponse postCliente(@Valid @RequestBody ClienteRequest clienteRequest);

        @GetMapping
        @ResponseStatus(code = HttpStatus.OK)
        List<ClienteListResponse> getTodosClientes();

        @GetMapping(value = "/{idCliente}")
        @ResponseStatus(code = HttpStatus.OK)
        ClienteDetalhadoResponse getClienteAtravesId(@PathVariable UUID idCliente);
    }

