package cl.banco.ms.Empleados.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import cl.banco.ms.Empleados.model.Empleado;
import cl.banco.ms.Empleados.service.EmpleadoService;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {

    @Autowired
    private EmpleadoService service;

    // LISTAR
    @GetMapping
    public List<Empleado> listar() {
        return service.listar();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Empleado buscarPorId(@PathVariable Integer id) {
        return service.buscarPorId(id);
    }

    // BUSCAR POR RUT
    @GetMapping("/rut/{rut}")
    public Empleado buscarPorRut(@PathVariable String rut) {
        return service.buscarPorRut(rut);
    }

    // GUARDAR
    @PostMapping
    public Empleado guardar(@RequestBody Empleado empleado) {
        return service.guardar(empleado);
    }

    // ACTUALIZAR
    @PutMapping("/{id}")
    public Empleado actualizar(@PathVariable Integer id,
                               @RequestBody Empleado empleado) {

        return service.actualizar(id, empleado);
    }

    // ELIMINAR
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        service.eliminar(id);
    }
}
