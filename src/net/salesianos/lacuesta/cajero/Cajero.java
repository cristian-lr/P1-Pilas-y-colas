package net.salesianos.lacuesta.cajero;

import net.salesianos.lacuesta.cliente.Cliente;

import java.util.LinkedList;
import java.util.Queue;

public class Cajero {
    private String nombre;
    private Queue<Cliente> cola;

    public Cajero() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Queue<Cliente> getCola() {
        return cola;
    }

    public void setCola(Queue<Cliente> cola) {
        this.cola = cola;
    }

    public boolean estaAbierto(){
        if(cola==null){
            return false;
        }else{
            return true;
        }
    }
    public void aniadirCliente() {
        Cliente cliente=new Cliente();
        if (estaAbierto()){
            cola.add(cliente);
            System.out.println("Cliente añadido:\n "+cliente.toString());
        }else{
            System.out.println("La caja está cerrada");
        }


    }

    public void atenderCliente() {
        if (cola.isEmpty()) {
            System.out.println("No hay clientes que atender");
        } else {
            System.out.println("Se ha atendido a:\n" + cola.poll());
        }
    }

    public void verClientesPendientes() {
        System.out.println("Clientes pendientes: ");
        for (Cliente cliente: cola) {
            System.out.println(cliente);
        }
    }

    public void cerrarSupermercado() {
        cerrarCaja();
    }

    public void abrirCaja() {
        if(!estaAbierto()) {
            cola = new LinkedList<>();
            System.out.println("Caja abierta correctamente");
        } else {
            System.out.println("La caja ya estaba abierta");
        }
    }

    public void cerrarCaja() {
        if(!estaAbierto() || cola.isEmpty()) {
            System.out.println("Caja ya está cerrada");
        } else {
            cola.clear();
            cola=null;
            System.out.println("La caja ha sido cerrada correctamente");

        }
    }
    @Override
    public String toString() {
        String colaClientes="";
        for (Cliente persona: cola) {
            colaClientes+="\t-"+colaClientes+"\n";
        }
        return "-----------------------\n"+
                "*Nombre: "+this.nombre+"\n*Total de productos: "+
                this.cola.size()+"\nLista de artículos en la cesta:\n"
                +colaClientes+"----------------------";
    }

}
