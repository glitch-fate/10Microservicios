package cl.banco.ms.Empleados.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.banco.ms.Empleados.model.Empleado;
import cl.banco.ms.Empleados.repository.EmpleadoRepository;

@Service
public class EmpleadoService {

    @Autowired
    private EmpleadoRepository repository;

    // LISTAR
    public List<Empleado> listar() {
        return repository.findAll();
    }

    // BUSCAR POR ID
    public Empleado buscarPorId(Integer id) {
        return repository.findById(id).orElse(null);
    }

    // BUSCAR POR RUT
    public Empleado buscarPorRut(String rut) {
        return repository.findByRut(rut).orElse(null);
    }

    // GUARDAR
    public Empleado guardar(Empleado empleado) {
        return repository.save(empleado);
    }

    // ACTUALIZAR
    public Empleado actualizar(Integer id, Empleado empleadoActualizado) {

        Empleado empleado = repository.findById(id).orElse(null);

        if (empleado != null) {

            empleado.setRut(empleadoActualizado.getRut());
            empleado.setNombre(empleadoActualizado.getNombre());
            empleado.setApellido(empleadoActualizado.getApellido());
            empleado.setCorreo(empleadoActualizado.getCorreo());
            empleado.setCargo(empleadoActualizado.getCargo());
            empleado.setSucursal(empleadoActualizado.getSucursal());
            empleado.setEspecialidad(empleadoActualizado.getEspecialidad());
            empleado.setDisponible(empleadoActualizado.getDisponible());

            return repository.save(empleado);
        }

        return null;
    }

    // ELIMINAR
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }
}
