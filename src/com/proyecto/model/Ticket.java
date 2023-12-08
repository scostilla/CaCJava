package com.proyecto.model;

public class Ticket {

    private Long id;
    private String nombre;
    private String apellido;
    private int cantidad;
    private String categoria;

    public Ticket() {
    };

    public Ticket(Long id, String nombre, String apellido, int cantidad, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

}
