import java.util.Scanner;

public class Potencia {
    static int numero, potencia, contador, acumulador;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        numero = in.nextInt();
        System.out.print("Introduce una potencia a la que quieras elevar el numero: ");
        potencia = in1.nextInt();

        contador = 1;
        acumulador = numero;
        while(contador<potencia){
            acumulador = acumulador * numero;
            contador++;
        }
        System.out.println(numero + " a la potencia " + contador + " = " + acumulador);
    }
}
