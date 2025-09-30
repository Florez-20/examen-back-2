package com.example.parcial2.modelos.mapas;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.DetalleCineGenericoDTO;
import com.example.parcial2.modelos.dtos.SalaGenericoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IMapaDetalleCine {
    DetalleCineGenericoDTO convertirModeloADto(DetalleCine detalleCine);
}
