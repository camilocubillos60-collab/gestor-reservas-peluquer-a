import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sr = new Scanner(System.in);

        int opcion;

        do{
            Menu.mostrarMenu();

            opcion = Menu.leerOpcion(sr);

            switch (opcion) {
                case 1:
                    Operaciones.agendar(sr);
                    break;
                case 2:
                    Operaciones.listar();
                    break;
                case 3:
                    Operaciones.cancelar(sr);
                    break;
                case 4:
                    Operaciones.reporte();
                    break;
                default:
                    System.out.println("Opción invalida");
                    break;
                case 5:
                    break;
            }
        }while (opcion != 5);
        System.out.println("Saliendo");
    }
}