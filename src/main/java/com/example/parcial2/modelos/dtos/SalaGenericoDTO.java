package com.example.parcial2.modelos.dtos;

public class SalaGenericoDTO {
    private String nombre;
    private Integer capacidad;
    private String tipo;

    public SalaGenericoDTO() {
    }

    public SalaGenericoDTO(String nombre, Integer capacidad, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
