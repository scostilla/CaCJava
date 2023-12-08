package com.proyecto.model;

public class Orador {

    private Long id;
    private String nombre;
    private String apellido;
    private String tema;

    public Orador() {
    }

    public Orador(Long id, String nombre, String apellido, String tema) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tema = tema;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTema() {
        return tema;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

}
