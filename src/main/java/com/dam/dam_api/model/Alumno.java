package com.dam.dam_api.model;

import com.fasterxml.jackson.databind.JsonNode;

import java.time.LocalDateTime;

/**
 * Clase para mapear los datos de la tabla Alumnos de la base de datos.
 */

public class Alumno {
    private Long idAlumno;
    private String nombre;
    private String apellidos;
    private JsonNode asignaturas;
    private LocalDateTime fechaNacimiento;

    // Constructores
    public Alumno() {
    }

    /**
     * Constructor para inicializar los datos.
     *
     * @param nombre      nombre del alumnos guardado en BBDD.
     * @param asignaturas JSON con la información del Alumno.
     */

    public Alumno(String nombre, String apellidos, JsonNode asignaturas, LocalDateTime fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.asignaturas = asignaturas;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters y Setters
    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public JsonNode getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(JsonNode asignaturas) {
        this.asignaturas = asignaturas;
    }

    public LocalDateTime getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
