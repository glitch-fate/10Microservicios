package cl.banco.msClientes.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import cl.banco.msClientes.model.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
