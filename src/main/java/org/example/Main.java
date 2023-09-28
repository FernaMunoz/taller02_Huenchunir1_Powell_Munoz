package org.example;
import java.util.Scanner;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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

                case 2:
                    System.out.println("Imprimir boleta");
                    //imprimirBoleta();
                    break:
                case 3:
                    System.out.println("Limpiar todas las habitaciones");
                    //resetAll();
                    break:

                case 4:
                    System.out.println("saliendo del menu");
                    break;
                default:
                    System.out.println("opcion no valida");

            } while (opcion != 4) ;

            sc.close();
        }
    }

    public static void hotel() {
        for (int i = 1; i <= 10; i++) {
            habitaciones.put("Habitación " + i, Arrays.asList("disponible", "S.E", "S.E"));//S.E, es sin especificar el cual dejamos por defecto
            System.out.println(habitaciones);
        }
    }


  /*  public static void cambiarEstadoHabitacion(int habitacion) {


    }

    public static void imprimirBoleta() {
        System.out.println("hola");
        int habitacion = sc.nextInt();
        if (habitaciones.containsKey(habitacion)) {

        }


    }*/

    public static void Menu() {
        System.out.println("MENU");
        System.out.println("1, Reservar");
        System.out.println("2, Imprimir");
        System.out.println("3, ResetAll");
        System.out.println("4, Salir");
        System.out.println("Seleccione la opcion que desea realizar");
    }

    public static void menuReserva(Scanner sc) {
        System.out.println("Menu para las reservas");
        System.out.println("1, Reservar");
        System.out.println("2, confirmar reserva");
        System.out.println("3, salir");
        System.out.println("Seleccione la opcion que desea realizar");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                //reserva();
                //cantidadDias();
                //servicioComida();
                break;
            case 2:
                //confirmarReserva
                //cambiarEstadoHabitacion
                break;
            case 3:
                System.out.println("saliendo del menu de reserva");
                break;
            default:
                System.out.println("opcion no valida");
    } while (opcion !=3);

    }
}

