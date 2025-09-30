package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.CineGenericoDTO;
import com.example.parcial2.modelos.dtos.SalaGenericoDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IMapaSala {
    SalaGenericoDTO convertirModeloADto(Sala sala);
}
