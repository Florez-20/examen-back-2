package com.example.parcial2.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "cine")
public class Cine {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre",length = 50, nullable = false)
    private String nombre;

    @Column(name = "nit", length = 20,nullable = false,unique = true)
    private String nit;

    @OneToOne(mappedBy = "cine")
    @JsonBackReference(value = "relacionDetallecineCine")
    private DetalleCine detalle;

    @OneToMany(mappedBy = "cine", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference(value = "relacionSala_Cine")
    private List<Sala> salas;


    public Cine() {
    }

    public Cine(Integer id, String nombre, String nit, DetalleCine detalle, List<Sala> salas) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.detalle = detalle;
        this.salas = salas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public DetalleCine getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleCine detalle) {
        this.detalle = detalle;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }
}
