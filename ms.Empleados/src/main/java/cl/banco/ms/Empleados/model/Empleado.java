package cl.banco.ms.Empleados.model;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empleados")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, unique = true)
    private String rut;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String cargo;

    @Column(nullable = false)
    private String sucursal;

    // AREA DEL EMPLEADO
    // EJ: Creditos, Seguros, Inversiones
    @Column(nullable = false)
    private String area;

    private Boolean disponible;
}