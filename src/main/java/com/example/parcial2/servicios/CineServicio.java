package com.example.parcial2.servicios;

import com.example.parcial2.modelos.Cine;
import com.example.parcial2.modelos.dtos.CineGenericoDTO;
import com.example.parcial2.modelos.mapas.IMapaCine;
import com.example.parcial2.repositorios.ICineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CineServicio {
    @Autowired
    private ICineRepositorio cineRepositorio;

    @Autowired
    private IMapaCine mapaCine;

    public CineGenericoDTO guardarCine(Cine cine) {
        Cine cineGuardado = cineRepositorio.save(cine);
        return mapaCine.convertirModeloADto(cineGuardado);
    }

}
