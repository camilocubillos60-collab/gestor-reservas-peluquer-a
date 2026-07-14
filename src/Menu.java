import java.util.Scanner;

public class Menu {

    public static void mostrarMenu(){

            System.out.println("=====MARTA PELUQUERIA=====");
            System.out.println("1. Agendar cita.");
            System.out.println("2. Listar citas.");
            System.out.println("3. Cancelar cita.");
            System.out.println("4. Reporte del día.");
            System.out.println("5. Salir");

    }

    public static int leerOpcion(Scanner sr){

        int opcion;

        System.out.println("Seleccione una opción.");
        opcion = sr.nextInt();

        return opcion;

    }

}
