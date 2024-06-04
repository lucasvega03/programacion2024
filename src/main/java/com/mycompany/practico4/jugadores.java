package com.mycompany.practico4;

import java.util.Arrays;

class Jugador extends Persona {
    private String posicion;
    private int dorsal;
    private int golesAnotados;

    public Jugador(String nombre, int edad, String posicion, int dorsal) {
        super(nombre, edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.golesAnotados = 0;
    }

    // Getters and setters for posicion, dorsal, and golesAnotados

    String getPosicion() {
        return posicion;
    }
}