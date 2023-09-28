package org.example;
import java.util.Scanner;

public class Main {
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
}
