package com.dam.dam_api.model;

import com.fasterxml.jackson.databind.JsonNode;

import java.time.LocalDateTime;

/**
 * Clase para mapear los datos de la tabla Documento de la base de datos.
 */
public class Documento {
    private Long idDocumento;
    private String titulo;
    private JsonNode dato;
    private LocalDateTime fechaCreacion;

    // Constructores
    public Documento() {}

    /**
     * Constructor para inicializar los datos.
     * @param titulo título del documento guardado en BBDD.
     * @param dato JSON con la información del documento.
     */
    public Documento(String titulo, JsonNode dato) {
        this.titulo = titulo;
        this.dato = dato;
    }

    // Getters y Setters
    public Long getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Long idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public JsonNode getDato() {
        return dato;
    }

    public void setDato(JsonNode dato) {
        this.dato = dato;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
