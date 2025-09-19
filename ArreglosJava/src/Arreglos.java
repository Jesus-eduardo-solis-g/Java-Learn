import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Arreglos ***");
        // arreglos
        var enteros = new int[5];
        // modificar los elementos
        enteros[0] = 13;
        enteros[1] = 26;
        enteros[2] = 87;
        enteros[3] = 71;
        enteros[4] = 64;
        // imprimir los valores
        System.out.println("Valor 1 = " + enteros[0]);

        // arreglos 2
        //int[] numeros = {100, 200, 300, 400, 500};
        var numeros = new int[]{100, 200, 300, 400, 500};
        // acceder a los elementos
        System.out.println("Valor 1: " + numeros[0]);
        // imprimir el arreglo (espacio de memoria)
        System.out.println("Imprimir el arreglo: " + numeros);

        // iterar todos los elementos con un ciclo for
        for(var i = 0; i < enteros.length; i++){
            System.out.println("Valor del indice: " + i + " = " + enteros[i]);
        }


        // introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        // creamos de manera dinamica el arreglo
        var enteros1 = new int[largoArreglo];
        // solicitar los valores del arreglo
        for(var i = 0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros1[i] = Integer.parseInt(consola.nextLine());
        }
        // imprimir los valores del arreglo
        System.out.println("\nImpresion del Arreglo: ");
        for(var i=0; i < largoArreglo; i++)
            System.out.println("enteros[" + i + "] = " + enteros1[i]);
    }
}
