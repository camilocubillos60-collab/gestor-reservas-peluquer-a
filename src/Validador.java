public class Validador {

    public static boolean horaValida(int hora){

        if (hora >= 8 && hora <= 17){

            return true;
        }else {
            return false;
        }
    }

    public static boolean nombreValido(String nombre){

        if (nombre == null){
            return false;
        }

        if (nombre.trim().isEmpty()){
            return false;
        }

        return true;
    }

    public static boolean servicioValido(int servicio){

        if (servicio == 1 || servicio == 2 || servicio == 3){
            return true;
        }else {
            return false;
        }
    }
}