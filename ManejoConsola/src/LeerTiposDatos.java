import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // leer distintos tipos de datos
        // leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        // consumimos el caracter de salto de linea
        consola.nextLine();

        // leer un tipo string
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        // para no usar nextIn / nextDouble / etc
        // conversion de datos
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        // var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        //tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);
        // Double.parseDouble();
        // Boolean.parseBoolean();
    }
}
