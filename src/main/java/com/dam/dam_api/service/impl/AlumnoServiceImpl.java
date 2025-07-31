package com.dam.dam_api.service.impl;

import com.dam.dam_api.mapper.AlumnoMapper;
import com.dam.dam_api.model.Alumno;
import com.dam.dam_api.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    AlumnoMapper alumnoMapper;


    public Alumno createAlumno(Alumno alumno) {
        alumnoMapper.insertarAlumno(alumno);
        return alumnoMapper.findAlumnoById(alumno.getIdAlumno());
    }

    public List<Alumno> getAllAlumnos() {
        return alumnoMapper.findAllAlumnos();
    }

    public Alumno getAlumnoById(Long id) {
        return alumnoMapper.findAlumnoById(id);
    }

    public void updateAlumno(Alumno alumno) {
        alumnoMapper.updateAlumno(alumno);
    }

    public void deleteAlumno(Long id) {
        alumnoMapper.deleteAlumno(id);
    }

    public List<Alumno> getAlumnosByNombre(String nombre) {
        return alumnoMapper.findAlumnosByNombre(nombre);
    }
}
