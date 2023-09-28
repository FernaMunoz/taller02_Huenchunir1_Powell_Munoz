package org.example;
import java.util.Scanner;
import java.util.*;
public class Main {
    private static final int PRECIOCOMIDA = 30000;
    private static final int PRECIOSINCOMIDA = 45000;


    private static final Map<String, List<String>> habitaciones = new LinkedHashMap<>();
    public static void main(String[] args) {
        hotel();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de habitación: ");
        int numeroHabitacion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        servicioComida(numeroHabitacion, scanner);
        cantidadDias(numeroHabitacion, scanner);
        confirmarReserva(numeroHabitacion, scanner);
        scanner.close();
    }


    public static void hotel() {
        for (int i = 1; i <= 10; i++) {
            List<String> estadoHabitacion = new ArrayList<>(Arrays.asList("disponible", "S.E", "S.E"));
            habitaciones.put("Habitación " + i, estadoHabitacion);
        }
    }


    public static void servicioComida(int numhabitacion, Scanner scanner){
        System.out.print("¿Desea agregar servicio de alimentacion en la habitacion, ingrese S/N");
        //
        String respuesta = scanner.nextLine();
        if (respuesta.equals("S")){
            List<String> estadoHabitacion = habitaciones.get("Habitación " + numhabitacion);
            estadoHabitacion.set(1, "OA");
            System.out.print("Habitacion con comida asignada");
        } else {
            List<String> estadoHabitacion = habitaciones.get("Habitación " + numhabitacion);
            estadoHabitacion.set(1, "OS");
        }

    }

    public static void cantidadDias(int numhabitacion,Scanner scanner){
        System.out.print("¿Cuantos dias desea reservar?, ingrese la cantidad: ");
        int Dias = scanner.nextInt();
        scanner.nextLine();
        List<String> estadoHabitacion = habitaciones.get("Habitación " + numhabitacion);
        int costoDias = estadoHabitacion.get(1).equals("OA") ? Dias * PRECIOCOMIDA : Dias * PRECIOSINCOMIDA;
        System.out.print("El costo total de la habitacion es de $ " + costoDias);
    }
    public void confirmarReserva(int numhabitacion, Scanner scanner) {
        System.out.print("Ya esta casi listo: ");
        System.out.print("¿Desea confirmar la reserva?, ingrese (S/N): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equals("S")) {
            List<String> estadoHabitacion = habitaciones.get("Habitación " + numhabitacion);
            estadoHabitacion.set(0, "reservada");
            System.out.println("Reserva confirmada.");
        } else {
            System.out.println("Reserva cancelada.");
        }
    }
}