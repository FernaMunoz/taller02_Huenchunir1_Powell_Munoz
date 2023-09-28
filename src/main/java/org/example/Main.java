package org.example;

import java.util.*;

public class Main {
    private static final Map<String, List<String>> habitaciones = new LinkedHashMap<>();
    public static void main(String[] args) {
        hotel();
        reservar();
        // confirmarReserva("Habitación 1"); deberia modificar a habitacion 1
        System.out.println(habitaciones);
    }

    public static void hotel() {
        for (int i = 1; i <= 10; i++) {
            habitaciones.put("Habitación " + i, Arrays.asList("disponible", "S.E", "S.E"));//S.E, es sin especificar el cual dejamos por defecto
            System.out.println(habitaciones);
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

    public static void confirmarReserva(String habitacion) {
        if (habitaciones.containsKey(habitacion)) {
            habitaciones.put(habitacion, Arrays.asList("no disponible", "S.E", "S.E"));
            System.out.println(habitacion + " ha sido reservada.");
        } else {
            System.out.println("La habitación especificada no existe.");
        }
    }

    public static void resetAll() {
        for (Map.Entry<String, List<String>> entry : habitaciones.entrySet()) {
            entry.setValue(Arrays.asList("disponible", "S.E", "S.E"));
        }
        System.out.println("Todas las habitaciones han sido restablecidas a 'disponible'");
    }
}



