import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        Random random = new Random();
        var consola = new Scanner(System.in);
        System.out.println("*** Sistema Generador de ID Unico ***");

        // introducir datos por el usuario
        System.out.print("Cual es tu nombre? ");
        var nombre = consola.nextLine().toUpperCase();
        System.out.print("Cual es tu apellido? ");
        var apellido = consola.nextLine().toUpperCase();
        System.out.print("Cual es tu año de nacimiento (YYYY)? ");
        var yearNacimiento = Integer.parseInt(consola.nextLine().substring(2, 4));
        // valor aleatorio de 4 digitos entre 1 y 9999, con llenado de 0
        var numeroAleatorio = random.nextInt(9999) + 1;
        // imprimimos el ID Unico
        System.out.printf("""
                %nHola %s,
                \tTu nuevo número de indentificación (ID) generado por el sistema es:\s
                \t%s%s%02d%04d
                \tFelicidades!
                """, nombre, nombre.substring(0, 2), apellido.substring(0, 2), yearNacimiento, numeroAleatorio);
    }
}
