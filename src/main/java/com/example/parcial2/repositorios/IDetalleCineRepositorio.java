package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.DetalleCine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IDetalleCineRepositorio extends JpaRepository<DetalleCine, Long> {
    // Buscar detalles por ciudad
    List<DetalleCine> findByCiudad(String ciudad);

    // Buscar detalles por teléfono
    List<DetalleCine> findByTelefono(String telefono);
}
