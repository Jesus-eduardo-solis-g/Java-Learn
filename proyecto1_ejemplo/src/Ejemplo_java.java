import java.util.Scanner;

public class Ejemplo_java {
    static int cuentaAhorro;
    static String texto, nombre;
    static int numero;

    public static void main(String[] args) {
        cuentaAhorro = 50000;
        texto = "esta es mi cuenta";
        nombre = "Dante";
        System.out.println(cuentaAhorro);
        System.out.println(texto);
        System.out.println(nombre);
        
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce un numero ");
        numero = consola.nextInt();
        System.out.println("numero = " + numero);
    }
}
