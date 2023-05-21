package net.salesianos.lacuesta.cliente;

import net.salesianos.lacuesta.util.Aleatorio;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Cliente {
    private String nombre;
    private int totalProductos;
    private Stack<String> cestaArticulos = new Stack<>();
    private String[] arrayProductos;

    int tope = 0;

    public Cliente() {
        Random random = new Random();
        this.totalProductos = random.nextInt(9) + 1;
        arrayProductos = new String[totalProductos];
        String producto;
        boolean estaRepetido = false;
        this.nombre = Aleatorio.devuelveNombreAleatorio();

        for (int i = 0; i < arrayProductos.length; i++) {
            estaRepetido = false;
            producto = Aleatorio.devuelveProductoAleatorio();
            for (int j = 0; j < i; j++) {
                if (producto == arrayProductos[j]) {
                    estaRepetido = true;
                    i--;
                }
            }
            if (!estaRepetido) {
                arrayProductos[i] = producto;
                cestaArticulos.push(arrayProductos[i]);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTotalProductos() {
        return totalProductos;
    }

    public void setTotalProductos(int totalProductos) {
        this.totalProductos = totalProductos;
    }

    public Stack<String> getCestaArticulos() {
        return cestaArticulos;
    }

    public void setCestaArticulos(Stack<String> cestaArticulos) {
        this.cestaArticulos = cestaArticulos;
    }

    @Override
    public String toString() {
        String pilaArticulos="";
        for (int i = 0; i <cestaArticulos.size() ; i++) {
            pilaArticulos+="\t-"+cestaArticulos.get(i)+"\n";
        }
        return "-----------------------\n"+
                "*Nombre: "+this.nombre+"\n*Total de productos: "+
                this.totalProductos+"\n*Lista de artículos en la cesta:\n"
                +pilaArticulos+"----------------------\n";

    }
}

