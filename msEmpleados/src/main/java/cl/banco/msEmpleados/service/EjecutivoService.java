package cl.banco.msEmpleados.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cl.banco.msEmpleados.model.Ejecutivo;
import cl.banco.msEmpleados.repository.EjecutivoRepository;

@Service
public class EjecutivoService {

    private EjecutivoRepository repoEjecutivo;

    public List<Ejecutivo> listar(){
        return repoEjecutivo.findAll();
    }

    public Ejecutivo buscarPorId(Integer id){
        return repoEjecutivo.findById(id).orElseThrow(() -> new RuntimeException("Ejecutivo no encontrado"));
    }

    public Ejecutivo guardar(Ejecutivo ejecutivo){
        return repoEjecutivo.save(ejecutivo);
    }

    public void eliminar(Integer id){
        if (!repoEjecutivo.existsById(id)){
            throw new RuntimeException("Ejecutivo no Existe");
        }
        repoEjecutivo.deleteById(id);
    }

}
