package com.dam.dam_api.controller;

import com.dam.dam_api.model.Alumno;
import com.dam.dam_api.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumno")

public class AlumnoController {
    @Autowired
    private AlumnoService service;

    // Obtener todos los alumnos
    @GetMapping
    public List<Alumno> getAllAlumnos() {
        return service.getAllAlumnos();
    }

    // Obtener un alumno por ID
    @GetMapping("/{id}")
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable Long id) {
        Alumno alumno = service.getAlumnoById(id);
        return alumno != null ? ResponseEntity.ok(alumno) : ResponseEntity.notFound().build();
    }

    // Crear un alumno
    @PostMapping
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno alumno) {
        service.createAlumno(alumno);
        return ResponseEntity.status(201).body(alumno);
    }

    // Actualizar un alumno
    @PutMapping("/{id}")
    public ResponseEntity<Alumno> updateAlumno(@PathVariable Long id, @RequestBody Alumno alumno) {
        alumno.setIdAlumno(id);
        service.updateAlumno(alumno);
        return ResponseEntity.ok(alumno);
    }

    // Eliminar un alumno
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAlumno(@PathVariable Long id) {
        service.deleteAlumno(id);
        return ResponseEntity.noContent().build();
    }

    // Buscar alumno por el campo "nombre"
    @GetMapping("/nombre")
    public List<Alumno> getAlumnosByNombre(@RequestParam String nombre) {
        return service.getAlumnosByNombre(nombre);
    }
}
