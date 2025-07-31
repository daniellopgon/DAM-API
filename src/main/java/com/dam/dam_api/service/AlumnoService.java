package com.dam.dam_api.service;

import com.dam.dam_api.model.Alumno;

import java.util.List;

public interface AlumnoService {

    Alumno createAlumno(Alumno alumno);

    List<Alumno> getAllAlumnos();

    Alumno getAlumnoById(Long id);

    void updateAlumno(Alumno alumno);

    void deleteAlumno(Long id);

    List<Alumno> getAlumnosByNombre(String nombre);
}
