package com.mycompany.practico4;

class Entrenador extends Persona {
    private int aniosExperiencia;
    private String titulo;
    private String nombreEquipo;

    public Entrenador(String nombre, int edad, int aniosExperiencia, String titulo, String nombreEquipo) {
        super(nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.titulo = titulo;
        this.nombreEquipo = nombreEquipo;
    }

    // Getters and setters for aniosExperiencia, titulo, and nombreEquipo
}

