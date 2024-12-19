package com.bookinghotels;

import com.bookinghotels.modelos.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Alojamiento> alojamientos;

    public static void main(String[] args) {
        inizializarDatos();
        mostrarLogo();
        gestionarMenu();
    }

    public static void inizializarDatos(){

        Hotel hotel1 = new Hotel("Hotel Mar Azul", "Cartagena", 4.9f, 0, 0,
                new DiaDeSolData("actividades",new ArrayList<String>() {{
                            add("Almuerzo");
                        }}, 20000.0f), true
        );
        hotel1.agregarHabitacion(new Habitacion("Habitación Estándar", "La habitación estándar cuenta con 1 cama queen, aire acondicionado, minibar, baño privado y TV de pantalla plana.", 200000.0f, 10, 2));
        alojamientos.add(hotel1);

        Apartamento apartamento1 = new Apartamento("Apartamento Playa", "Cartagena", 4.7f, 5, 0, 500000.0f, 3, "311A" );
        alojamientos.add(apartamento1);


        Finca finca = new Finca("Finca El Bosque", "Armenia", 4.8f, 5, 0, 800000, null);
        alojamientos.add(finca);
    }

    public static void  mostrarLogo(){
        System.out.println("\n         ___|_|_|_|_|_|_|_|_|_|_|_|_|_|_|_|___    ");
        System.out.println("        |                                     |    ");
        System.out.println("        |      Bienvenido(a) a Book Stay      |    ");
        System.out.println("        |_____________________________________|    ");
        System.out.println("               |     |     |     |     |          \n");
    }

    public static void mostrarMenu(){
        System.out.println("\n*----------------------- Menú -----------------------*");
        System.out.println("| 1. Buscar y reservar alojamiento.                  | ");
        System.out.println("| 2. Consultar reservaciones realizadas.             | ");
        System.out.println("| 3. Modificar una reservación.                      | ");
        System.out.println("| 0. Salir.                                          | ");
        System.out.println("*----------------------------------------------------*\n");
    }

    public static void gestionarMenu(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa la opción que deseas realizar: ");
        int option = teclado.nextInt();
        do{
            mostrarMenu();
            switch (option){
                case 0:
                    System.out.println("\n¡Gracias por usar nuestros servicios!\n");
                    return;
                case 1:
                    System.out.println("Buscar");
                case 2:
                    System.out.println("Consultar");
                case 3:
                    System.out.println("Modificar");
                default:
                    System.out.println("\nOpción no válida, rectifica e intenta nuevamente.");
            }
        } while (true);
    }


}
