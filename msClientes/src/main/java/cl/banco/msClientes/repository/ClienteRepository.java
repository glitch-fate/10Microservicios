package cl.banco.msClientes.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.banco.msClientes.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    Optional<Cliente> findByRut(String rut);
}
