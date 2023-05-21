package net.salesianos.lacuesta.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Aleatorio {
    private static final String[] productos = new String[]{
            "usb", "televisión", "teclado", "monitor", "iphone", "ratón", "auriculares", "altavoz", "nintendo switch",
            "ps4", "ps5", "mac"
    };

    private static final String[] nombres = new String[]{
            "Isabella", "Ethan", "Sophia", "Mason", "Emma", "Jacob", "Olivia", "William", "Ava", "Noah", "Emily", "Liam", "Abigail", "Michael", "Madison", "Elijah", "Mia", "Alexander", "Chloe", "Daniel"
    };

    private static final Set<String> nombresUsados = new HashSet<>();

    public static String devuelveProductoAleatorio() {
        Random random = new Random();
        int randomIndex = random.nextInt(Aleatorio.productos.length);

        // Esta es otra manera de hacerlo, pero es más difícil obtener los índices
        // de los extremos del array:
        // int randomIndex = (int) (Math.random() * (AnimalGenerator.ANIMAL_NAMES.length - 1)) ;

        return Aleatorio.productos[randomIndex];
    }

    public static String devuelveNombreAleatorio() {
        Random random = new Random();

        // Esta es otra manera de hacerlo, pero es más difícil obtener los índices
        // de los extremos del array:
        // int randomIndex = (int) (Math.random() * (AnimalGenerator.ANIMAL_NAMES.length - 1)) ;

        int randomIndex;
        String nombre;

        do {
            randomIndex = random.nextInt(Aleatorio.nombres.length);
            nombre = Aleatorio.nombres[randomIndex];
        } while (nombresUsados.contains(nombre));

        nombresUsados.add(nombre);

        return nombre;
    }


}
