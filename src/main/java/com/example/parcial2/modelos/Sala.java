package com.example.parcial2.modelos;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
@Table(name = "salas")
public class Sala {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombre",length = 50, nullable = false)
    private String nombre;

    @Column(name = "capacidad",length = 50, nullable = false,unique = false)
    private Integer capacidad;

    @Column(name = "tipo",length = 50, nullable = false, unique = false)
    private String tipo; // 2D, 3D, IMAX...

    @ManyToOne
    @JoinColumn(name = "FK_cine",referencedColumnName = "id")
    @JsonManagedReference(value = "relacionSala_Cine")
    private Cine cine;

    public Sala() {
    }

    public Sala(Integer id, String nombre, Integer capacidad, String tipo, Cine cine) {
        this.id = id;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.cine = cine;
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

    public Cine getCine() {
        return cine;
    }

    public void setCine(Cine cine) {
        this.cine = cine;
    }
}
