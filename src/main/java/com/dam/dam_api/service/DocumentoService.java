package com.dam.dam_api.service;

import com.dam.dam_api.model.Documento;

import java.util.List;

public interface DocumentoService {

    void createDocument(Documento documento);

    List<Documento> getAllDocuments();

    Documento getDocumentById(Long id);

    void updateDocument(Documento documento);

    void deleteDocument(Long id);

    List<Documento> getDocumentsByAutor(String autor);
}
