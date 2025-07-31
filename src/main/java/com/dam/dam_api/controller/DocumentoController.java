package com.dam.dam_api.controller;

import com.dam.dam_api.model.Documento;
import com.dam.dam_api.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
public class DocumentoController {

    @Autowired
    private DocumentoService service;

    // Obtener todos los documentos
    @GetMapping
    public List<Documento> getAllDocuments() {
        return service.getAllDocuments();
    }

    // Obtener un documento por ID
    @GetMapping("/{id}")
    public ResponseEntity<Documento> getDocumentById(@PathVariable Long id) {
        Documento document = service.getDocumentById(id);
        return document != null ? ResponseEntity.ok(document) : ResponseEntity.notFound().build();
    }

    // Crear un documento
    @PostMapping
    public ResponseEntity<Documento> createDocument(@RequestBody Documento document) {
        service.createDocument(document);
        return ResponseEntity.status(201).body(document);
    }

    // Actualizar un documento
    @PutMapping("/{id}")
    public ResponseEntity<Documento> updateDocument(@PathVariable Long id, @RequestBody Documento document) {
        document.setIdDocumento(id);
        service.updateDocument(document);
        return ResponseEntity.ok(document);
    }

    // Eliminar un documento
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocument(@PathVariable Long id) {
        service.deleteDocument(id);
        return ResponseEntity.noContent().build();
    }

    // Buscar documento por el campo "autor"
    @GetMapping("/autor")
    public List<Documento> getDocumentsByAutor(@RequestParam String autor) {
        return service.getDocumentsByAutor(autor);
    }

}
