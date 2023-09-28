package org.example;

import java.util.*;

public class Main {
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
}


