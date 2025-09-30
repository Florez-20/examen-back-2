package com.example.parcial2.repositorios;

import com.example.parcial2.modelos.Cine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICineRepositorio  extends JpaRepository<Cine,Integer> {
    List<Cine>findByNombre(String nombre);
}
