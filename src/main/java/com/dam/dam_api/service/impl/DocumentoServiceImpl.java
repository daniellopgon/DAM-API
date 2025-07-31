package com.dam.dam_api.service.impl;

import com.dam.dam_api.mapper.DocumentoMapper;
import com.dam.dam_api.model.Documento;
import com.dam.dam_api.service.DocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoServiceImpl implements DocumentoService {

    @Autowired
    DocumentoMapper documentoMapper;

    public void createDocument(Documento documento) {
        documentoMapper.insertarDocumento(documento);
    }

    public List<Documento> getAllDocuments() {
        return documentoMapper.findAllDocumentos();
    }

    public Documento getDocumentById(Long id) {
        return documentoMapper.findDocumentoById(id);
    }

    public void updateDocument(Documento documento) {
        documentoMapper.updateDocumento(documento);
    }

    public void deleteDocument(Long id) {
        documentoMapper.deleteDocumento(id);
    }

    public List<Documento> getDocumentsByAutor(String autor) {
        return documentoMapper.findDocumentosByAutor(autor);
    }

}
