package com.mycompany.practico4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Equipo {
    private String nombreEquipo;
    private String ciudad;
    private List<Jugador> jugadores;
    private List<Persona> cuerpoTecnico;
    private final String NombreEquipo;

    public Equipo(String nombreEquipo, String ciudad) {
        this.NombreEquipo = nombreEquipo;
        this.ciudad = ciudad;
        this.jugadores = new ArrayList<>();
        this.cuerpoTecnico = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public void eliminarJugador(Jugador jugador) {
        jugadores.remove(jugador);
    }
    
    String getNombreEquipo(){
        return "Barcelona";
    }
    
    String getciudad() {
        return ciudad;
    }
     Iterable<Jugador> getJugadores() {
        return jugadores;
    }
      public void agregarCuerpoTecnico(Persona miembro) {
        cuerpoTecnico.add(miembro);
    }


    }

    