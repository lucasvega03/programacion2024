package com.mycompany.practico4;

import java.util.List;

class Utilero extends Persona {
    private int aniosExperiencia;
    private String funciones;
    private String categoria;

    public Utilero(String nombre, int edad, int aniosExperiencia, String funciones, String categoria) {
        super(nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.funciones = funciones;
        this.categoria = categoria;
    }

    // Getters and setters for aniosExperiencia, funciones, and categoria
}