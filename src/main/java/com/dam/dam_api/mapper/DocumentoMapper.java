package com.dam.dam_api.mapper;

import com.dam.dam_api.model.Documento;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DocumentoMapper {
    void insertarDocumento(Documento documento);

    List<Documento> findAllDocumentos();

    Documento findDocumentoById(Long idDocumento);

    void updateDocumento(Documento documento);

    void deleteDocumento(Long idDocumento);

    List<Documento> findDocumentosByAutor(@Param("autor") String autor);
}
