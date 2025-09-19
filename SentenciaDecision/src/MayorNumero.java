import java.util.Scanner;

public class MayorNumero {
    public static void main(String[] args) {
        System.out.println("Reto: Mayor de 2 Números");
        var consola = new Scanner(System.in);

        // datos por el usuario
        System.out.print("Introduce un numero a: ");
        var numeroA = Integer.parseInt(consola.nextLine());
        System.out.print("Introduce un numero b: ");
        var numeroB = Integer.parseInt(consola.nextLine());

        if (numeroA > numeroB){
            System.out.println("El numero mayor es: " + numeroA);
        } else if (numeroA == numeroB){
            System.out.println("Son iguales los numeros");
        } else {
            System.out.println("El numero mayor es: " + numeroB);
        }
    }
}
