package org.example;
import java.util.Scanner;
import java.util.*;

public class Main {
    private static final Map<String, List<String>> habitaciones = new HashMap<>();

    public static void main(String[] args) {
        hotel();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            Menu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Reservar una habitacion");
                    menuReserva(sc);
                    break;
                case 2:
                    System.out.println("Imprimir boleta");
                    //imprimirBoleta();
                    break;
                case 3:
                    System.out.println("Limpiar todas las habitaciones");
                    resetAll();
                    break;
                case 4:
                    System.out.println("Saliendo del menu");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 4);

        sc.close();
    }

    public static void hotel() {
        for (int i = 1; i <= 10; i++) {
            habitaciones.put("Habitación " + i, Arrays.asList("disponible", "S.E", "S.E")); // S.E, es sin especificar el cual dejamos por defecto
        }
    }

    public static void reservar() {
        List<String> habitacionesDisponibles = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : habitaciones.entrySet()) {
            if ("disponible".equals(entry.getValue().get(0))) {
                habitacionesDisponibles.add(entry.getKey());
            }
        }
        System.out.println("Habitaciones disponibles: " + habitacionesDisponibles);
    }

    public static void resetAll() {
        for (Map.Entry<String, List<String>> entry : habitaciones.entrySet()) {
            entry.setValue(Arrays.asList("disponible", "S.E", "S.E"));
        }
        System.out.println("Todas las habitaciones han sido restablecidas a 'disponible'");
    }

    public static void Menu() {
        System.out.println("MENU");
        System.out.println("1. Reservar");
        System.out.println("2. Imprimir");
        System.out.println("3. ResetAll");
        System.out.println("4. Salir");
        System.out.println("Seleccione la opción que desea realizar");
    }

    public static void menuReserva(Scanner sc) {
        int opcion;
        do {
            System.out.println("Menú para las reservas");
            System.out.println("1. Reservar");
            System.out.println("2. Confirmar reserva");
            System.out.println("3. Salir del menú de reserva");
            System.out.println("Seleccione la opción que desea realizar");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    reservar();
                    // cantidadDias();
                    // servicioComida();
                    break;
                case 2:
                    // confirmarReserva
                    // cambiarEstadoHabitacion
                    break;
                case 3:
                    System.out.println("Saliendo del menú de reserva");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
    }
}



