package com.example.parcial2.servicios;

import com.example.parcial2.modelos.Sala;
import com.example.parcial2.modelos.dtos.SalaGenericoDTO;
import com.example.parcial2.modelos.mapas.IMapaSala;
import com.example.parcial2.repositorios.ISalaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaServicio {

    @Autowired
    private ISalaRepositorio salaRepositorio;

    @Autowired
    private IMapaSala mapaSala;

    public SalaGenericoDTO guardarSala(Sala sala) {
        Sala salaGuardada = salaRepositorio.save(sala);
        return mapaSala.convertirModeloADto(salaGuardada);
    }
}
