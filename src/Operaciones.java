import java.util.Scanner;
public class Operaciones {

    public static String[] clientes = new String[10];
    public static int[] horas = new int[10];
    public static int[] servicios = new int[10];

    public static int contador = 0;
    public static final int MAX_CLIENTES = 10;

    public static void main(String[] args) {

    }

    public static void agendar(Scanner sr){

        if (contador >= MAX_CLIENTES) {
            System.out.println("No hay cupos disponibles.");
            return;
        }

        sr.nextLine();

        String nombre;
        int hora;
        int servicio;

        do {
            System.out.println("Ingrese el nombre: ");
            nombre = sr.nextLine();
        }while (!Validador.nombreValido(nombre));

        do {
            System.out.println("Ingrese la hora (8 - 17): ");
            hora = sr.nextInt();
        }while (!Validador.horaValida(hora));

        do {
            System.out.println("Ingrese el servicio (1.Corte 2.Tinte 3.Manicure): ");
            servicio = sr.nextInt();
        }while (!Validador.servicioValido(servicio));

        sr.nextLine();

        clientes[contador] = nombre;
        horas[contador] = hora;
        servicios[contador] = servicio;

        contador++;

        System.out.println("Reserva registrada correctamente.");
    }

    public static void listar() {

        if (contador == 0) {
            System.out.println("No hay reservas.");
            return;
        }

        for (int i = 0; i < contador; i++) {

            System.out.println("Cliente: " + clientes[i]);
            System.out.println("Hora: " + horas[i]);
            System.out.println("Servicio: " + servicios[i]);
            System.out.println("---------------------------");
        }
    }

    public static void cancelar(Scanner sr) {
        sr.nextLine();

        System.out.println("Nombre del cliente: ");
        String nombre = sr.nextLine();

        for (int i = 0; i < contador; i++) {

            if (clientes[i].equalsIgnoreCase(nombre)) {

                for (int j = i; j < contador - 1; j++) {
                    clientes[j] = clientes[j + 1];
                    horas[j] = horas[j + 1];
                    servicios[j] = servicios[j + 1];
                }

                contador--;

                System.out.println("Reserva cancelada.");

                return;
            }
        }

        System.out.println("Cliente no encontrado.");
    }

    public static void reporte() {
        System.out.println("Reservas registradas: " + contador);
        System.out.println("Cupos disponibles: " + (MAX_CLIENTES - contador));
    }

}
