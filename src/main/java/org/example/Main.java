package org.example;
import java.util.Scanner;
import java.util.*;
public class Main {
    private static final int numhabitacion = 10;
    private static final int PRECIOCOMIDA = 30000;
    private static final int PRECIOSINCOMIDA = 45000;


    private static final Map<String, List<String>> habitaciones = new HashMap<>();
    public static void main(String[] args) {
        hotel();
    }

    public static void hotel() {
        for (int i = 1; i <= 10; i++) {
            habitaciones.put("Habitación " + i, Arrays.asList("disponible", "S.E", "S.E"));//S.E, es sin especificar el cual dejamos por defecto
            System.out.println(habitaciones);
        }
    }

    private Scanner scanner;
    public void servicioComida(int numhabitacion){
        System.out.print("¿Desea agregar servicio de alimentacion en la habitacion, ingrese S/N");
        //
        String respuesta = scanner.nextLine();
        if (respuesta.equals("S")){
            habitaciones[numhabitacion - 1] = "OA";
            System.out.print("Habitacion con comida asignada");
        } else {
            habitaciones[numhabitacion -1] = "OS";
        }

    }

    public void cantidadDias(int numhabitacion){
        System.out.print("¿Cuantos dias desea reservar?, ingrese la cantidad: ");
        int Dias = scanner.nextInt();
        int costoDias = habitaciones[numhabitacion - 1].equals("OA")  ? Dias * PRECIOCOMIDA: Dias * PRECIOSINCOMIDA;
        System.out.print("El costo total de la habitacion es de $ " + costoDias);
    }
    public void confirmarReserva(int numhabitacion) {
        System.out.print("Ya esta casi listo: ");
        System.out.print("¿Desea confirmar la reserva?, ingrese (S/N): ");
        String respuesta = scanner.nextLine();

        if (respuesta.equals("S")) {
            cambiarEstadoHabitacion(numeroHabitacion);
            System.out.println("Reserva confirmada.");
        } else {
            System.out.println("Reserva cancelada.");
        }

    }
}