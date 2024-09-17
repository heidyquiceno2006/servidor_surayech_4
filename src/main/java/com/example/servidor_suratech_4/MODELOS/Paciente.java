package com.example.servidor_suratech_4.MODELOS;

import org.hibernate.loader.ast.spi.Loadable;

import java.time.LocalDate;

public class Paciente {

    private Integer id;
    private String nombre;
    private Integer edad;
    private LocalDate fechaNacimiento;
    private String documento;
    private String telefono;
    private Integer copago;
    private String email;
    private String direccion;
    private String ips;
    private String medicoFamilia;
}
