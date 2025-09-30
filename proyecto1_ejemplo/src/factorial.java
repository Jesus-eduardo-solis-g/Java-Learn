import java.util.Scanner;

public class factorial {
    static int numero, contador, acumulador;

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce un número para sacar el factorial: ");
        numero = consola.nextInt();

        contador = 0;
        acumulador = 1;
        while(contador<numero){
            contador += 1;
            acumulador = acumulador*contador;
        }
        System.out.println("El factorial de " + numero + " es " + acumulador);
    }
}
