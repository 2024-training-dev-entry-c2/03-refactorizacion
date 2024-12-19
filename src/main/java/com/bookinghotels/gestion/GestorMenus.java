package com.bookinghotels.gestion;

import com.bookinghotels.Main;

import java.util.Scanner;

public class GestorMenus {
    public void mostrarMenu() {
        System.out.println("\n*----------------------- Menú -----------------------*");
        System.out.println("| 1. Buscar y reservar alojamiento.                  | ");
        System.out.println("| 2. Consultar reservaciones realizadas.             | ");
        System.out.println("| 3. Modificar una reservación.                      | ");
        System.out.println("| 0. Salir.                                          | ");
        System.out.println("*----------------------------------------------------*\n");
    }

    public void gestionarOpciones() {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            System.out.println("Ingresa la opción que deseas realizar: ");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 0 -> salir = true;
                case 1 -> Main.gestionarOpcionBuscarYReservar();
                case 2 -> System.out.println("Consultar reservaciones. (Funcionalidad en desarrollo)");
                case 3 -> Main.gestionarOpcionModificarReserva();
                default -> System.out.println("\nOpción no válida, intenta nuevamente.");
            }
        }
    }
}
