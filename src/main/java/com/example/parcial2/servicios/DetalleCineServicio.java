package com.example.parcial2.servicios;

import com.example.parcial2.modelos.DetalleCine;
import com.example.parcial2.modelos.dtos.DetalleCineGenericoDTO;
import com.example.parcial2.modelos.mapas.IMapaDetalleCine;
import com.example.parcial2.repositorios.IDetalleCineRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleCineServicio {
    @Autowired
    private IDetalleCineRepositorio detalleCineRepositorio;

    @Autowired
    private IMapaDetalleCine mapaDetalleCine;

    public DetalleCineGenericoDTO guardarDetalleCine(DetalleCine detalleCine) {
        DetalleCine detalleCineGuardado = detalleCineRepositorio.save(detalleCine);
        return mapaDetalleCine.convertirModeloADto(detalleCineGuardado);
    }
}