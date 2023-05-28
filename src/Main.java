import net.salesianos.lacuesta.cajero.Cajero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cajero cajero = new Cajero(2);
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1.Abrir caja");
            System.out.println("2.Añadir un nuevo cliente a la cola");
            System.out.println("3.Atender un cliente");
            System.out.println("4.Ver clientes pendientes");
            System.out.println("5.Cerrar supermercado");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    cajero.abrirCaja();
                    break;

                case 2:
                    cajero.aniadirCliente();
                    break;

                case 3:
                    cajero.atenderCliente();
                    break;

                case 4:
                    cajero.verClientesPendientes();
                    break;

                case 5:
                    cajero.cerrarSupermercado();
                    salir = true;
                    System.out.println("Supermercado cerrado");

                    break;

                default:
                    System.out.println("Número de opción erróneo");
                    break;
            }

        }

    }
}