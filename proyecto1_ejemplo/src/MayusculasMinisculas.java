public class MayusculasMinisculas {
    static String nombre, frase, nombreOriginal, nombreResultante, caracterCad;
    static int longitudCiclo, contador;
    static char caracter;

    public static void main(String[] args) {
        nombre = "Cristiano ronaldo";
        frase = "BUENOS DIAS ALEGRIA";
        nombre = nombre.toUpperCase();
        frase = frase.toLowerCase();
        System.out.println("nombre = " + nombre);
        System.out.println("frase = " + frase);

        // con una cadena cambiar la primera
        // letra de los iniciales a mayúsculas
        nombreOriginal = "dante gonzalez";
        nombreResultante = "";
        nombreOriginal = nombreOriginal.toUpperCase();
        longitudCiclo = nombreOriginal.length();
        System.out.println("La longitud es " + longitudCiclo);
        contador = 0;
        while (contador < longitudCiclo) {
            caracterCad = "";
            caracter = nombreOriginal.charAt(contador);
            caracterCad = caracterCad + caracter;

            if (contador == 0) {
                nombreResultante = nombreResultante + caracterCad;
            } else {
                if (caracterCad.equals(" ")) {
                    nombreResultante = nombreResultante + caracterCad;
                    contador++;
                    if (contador < longitudCiclo) {
                        caracter = nombreOriginal.charAt(contador);
                        nombreResultante = nombreResultante + ("" + caracter);
                    }
                } else {
                    nombreResultante = nombreResultante + caracterCad.toLowerCase();
                }
            }
            contador++;
        }
        System.out.println("Resultado final: " + nombreResultante);
    }
}
