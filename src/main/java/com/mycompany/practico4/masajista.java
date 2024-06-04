package com.mycompany.practico4;


import java.util.List;

class Masajista extends Persona {
    private int aniosExperiencia;
    private List<String> certificados;
    private String especialidad;

    public Masajista(String nombre, int edad, int aniosExperiencia, List<String> certificados, String especialidad) {
        super(nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.certificados = certificados;
        this.especialidad = especialidad;
    }

}