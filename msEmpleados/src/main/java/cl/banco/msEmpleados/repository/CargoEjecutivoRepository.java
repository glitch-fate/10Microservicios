package cl.banco.msEmpleados.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.banco.msEmpleados.model.CargoEjecutivo;

public interface CargoEjecutivoRepository extends JpaRepository<CargoEjecutivo, Integer> {

}
