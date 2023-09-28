package org.example;
import java.util.Scanner;
import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final Map<String, List<String>> habitaciones = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            Menu();
            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Reservar una habitacion");
                    do{
                        MenuReserva();
                        opcion = sc.nextInt();
                        switch (opcion){
                            case 1:
                                //reserva();
                                //cantidadDias();
                                //servicioComida();
                                //
                        }
                    }
                    hotel();

                case 2:
                    System.out.println("Imprimir boleta");
                    //imprimirBoleta();
            }

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
    public static void MenuReserva() {
        System.out.println("Menu para las reservas");
        System.out.println("1, Reservar");
        System.out.println("3, confirmar reserva");
        System.out.println("Seleccione la opcion que desea realizar")
    }

}

