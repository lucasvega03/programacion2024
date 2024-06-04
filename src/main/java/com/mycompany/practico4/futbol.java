package com.mycompany.practico4;

import java.util.Arrays;
import java.util.Scanner;


public class Futbol{
    
    public static void main(String[] args) {
        
        Equipo miEquipo = new Equipo("FC Barcelona", "Barcelona");
        
        Jugador jugador1 = new Jugador("Lionel Messi", 34, "Delantero", 10);
        Jugador jugador2 = new Jugador("Sergio Ramos", 35, "Defensa", 4);
        Jugador jugador3 = new Jugador("Gerard Pique", 34, "Defensa", 3);
        Jugador jugador4 = new Jugador("Marc-Andre ter Stegen", 29, "Portero", 1);
        Jugador jugador5 = new Jugador("Sergio Busquets", 33, "Centrocampista", 5);
        Jugador jugador6 = new Jugador("Frenkie de Jong", 24, "Centrocampista", 21);
        Jugador jugador7 = new Jugador("Ansu Fati", 19, "Delantero", 31);
       
        miEquipo.agregarJugador(jugador1);
        miEquipo.agregarJugador(jugador2);
        miEquipo.agregarJugador(jugador3);
        miEquipo.agregarJugador(jugador4);
        miEquipo.agregarJugador(jugador5);
        miEquipo.agregarJugador(jugador6);
        miEquipo.agregarJugador(jugador7);
        
         Entrenador entrenador = new Entrenador("Zinedine Zidane", 50, 20, "Licenciado en Educación Física", "Barcelona");
        miEquipo.agregarCuerpoTecnico(entrenador);
        
        Masajista masajista;
        masajista = new Masajista("Ponce de Leon",30,10, Arrays.asList("Universitario","y Postgrado"),"Zona lumbar" );
        miEquipo.agregarCuerpoTecnico(masajista);
        
        Utilero utilero = new Utilero("Juan Ignacio",16,2,"Asistir a todo el equipo","Cadete");
        miEquipo.agregarCuerpoTecnico(utilero);

        
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("\nSeleccione una opcion:");
                System.out.println("1. Mostrar la formacion del equipo");
                System.out.println("2. Mostrar el cuerpo tecnico");
                System.out.println("3. Hacer que el equipo viaje");
                System.out.println("4. Hacer que el equipo entrene");
                System.out.println("5. Hacer que el equipo juegue un partido");
                System.out.println("0. Salir");
                System.out.print("Opcion: ");
                opcion = scanner.nextInt();
                
                switch (opcion) { 
                    case 1 ->  {
                               System.out.println("Equipo: " + miEquipo.getNombreEquipo());
                               System.out.println("Ciudad: " + miEquipo.getciudad());
                               System.out.println("Jugadores:"); 
                                    for (Jugador jugador : miEquipo.getJugadores()) {
                                    System.out.println("- " + jugador.getNombre() + " (" + jugador.getPosicion() + ")");
                }
                    }
                    case 2 -> {
                              System.out.println("Entrenador: " + entrenador.getNombre());
                              System.out.println("Masajista: " + masajista.getNombre());
                              System.out.println("Utilireo: " + utilero.getNombre());
                    }
                    case 3 -> System.out.println("El equipo esta viajando");
                    case 4 -> System.out.println("El equipo esta entrenando");
                    case 5 -> System.out.println("El equipo esta jugando un partido");
                    case 0 -> System.out.println("Saliendo...");
                    default -> System.out.println("Opción no valida");
                }
            } while (opcion != 0);
                }
       

        
    }
}

        