package com.dam.dam_api.mapper;

import com.dam.dam_api.model.Alumno;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AlumnoMapper {

    void insertarAlumno(Alumno alumno);

    List<Alumno> findAllAlumnos();

    Alumno findAlumnoById(Long idAlumno);

    void updateAlumno(Alumno alumno);

    void deleteAlumno(Long idAlumno);

    List<Alumno> findAlumnosByNombre(@Param("nombre") String nombre);
}
