package br.com.estetic.clienteestetic.cliente.infra;

import br.com.estetic.clienteestetic.cliente.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

    public interface ClienteSpringDataJPARepository extends JpaRepository<Cliente, UUID> {

    }
