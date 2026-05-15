package cl.banco.msClientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.banco.msClientes.model.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Integer> {
}
