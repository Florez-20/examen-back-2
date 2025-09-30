package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineGenericoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapaCine {
   CineGenericoDTO convertirModeloADto(Cine cine);

    List<CineGenericoDTO> convertirListaModelosADtos(List<Cine> cine);

}
