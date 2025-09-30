package com.example.parcial2.modelos.dtos;

public class DetalleCineGenericoDTO {
    private String direccion;
    private String ciudad;
    private String telefono;

    public DetalleCineGenericoDTO() {
    }

    public DetalleCineGenericoDTO(String direccion, String ciudad, String telefono) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
