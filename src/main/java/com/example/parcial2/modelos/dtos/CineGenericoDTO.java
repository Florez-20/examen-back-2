package com.example.parcial2.modelos.dtos;

public class CineGenericoDTO {
    private String nombre;
    private String nit;

    public CineGenericoDTO() {
    }

    public CineGenericoDTO(String nombre, String nit) {
        this.nombre = nombre;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
}
