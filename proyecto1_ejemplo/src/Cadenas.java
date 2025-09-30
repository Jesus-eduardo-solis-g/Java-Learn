public class Cadenas {
    static String cadena, mensaje, cadenaOriginal, cadenaReves;
    static int longitudCad, longitudMsj, longitudOriginal;
    static char caracter;
    public static void main(String[] args) {
        cadena = "empresa";
        mensaje = "gracias por todo";

        // longitud de una cadena
        longitudCad = cadena.length();
        longitudMsj = mensaje.length();
        System.out.println(longitudCad);
        System.out.println(longitudMsj);

        // posición de un caracter
        caracter = mensaje.charAt(4);
        System.out.println(caracter);

        // cadena al reves
        cadenaOriginal = "ropa";
        longitudOriginal = cadenaOriginal.length();
        int contador = 0;
        int longitudCiclo = longitudOriginal;
        cadenaReves = "";
        longitudOriginal -= 1;
        while(contador < longitudCiclo){
            char caracter1 = cadenaOriginal.charAt(longitudOriginal);
            cadenaReves = cadenaReves + caracter1;
            longitudOriginal -=1;
            contador += 1;
        }
        System.out.println(cadenaOriginal + "/" + cadenaReves);
    }
}
