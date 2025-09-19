import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Reto: Calculadora");
        var consola = new Scanner(System.in);
        double operando1 = 0, operando2 = 0, resultado = 0;
        var salir = false;

        while (!salir){
            System.out.print("""
                    \n*** Calculadora en Java ***
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoje una opción:\s""");
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 -> {
                    System.out.print("Dame el valor 1: ");
                    operando1 = consola.nextDouble();
                    System.out.print("Dame el valor 2: ");
                    operando2 = consola.nextDouble();
                    resultado = operando1 + operando2;
                    System.out.printf("Resultado suma: %.2f%n%n", resultado);
                }
                case 2 -> {
                    System.out.print("Dame el valor 1: ");
                    operando1 = consola.nextDouble();
                    System.out.print("Dame el valor 2: ");
                    operando2 = consola.nextDouble();
                    resultado = operando1 - operando2;
                    System.out.printf("Resultado resta: %.2f%n%n", resultado);
                }
                case 3 -> {
                    System.out.print("Dame el valor 1: ");
                    operando1 = consola.nextDouble();
                    System.out.print("Dame el valor 2: ");
                    operando2 = consola.nextDouble();
                    resultado = operando1 * operando2;
                    System.out.printf("Resultado multiplicacion: %.2f%n%n", resultado);
                }
                case 4 -> {
                    System.out.print("Dame el valor 1: ");
                    operando1 = consola.nextDouble();
                    System.out.print("Dame el valor 2: ");
                    operando2 = consola.nextDouble();
                    resultado = operando1 / operando2;
                    System.out.printf("Resultado división: %.2f%n%n", resultado);
                }
                case 5 -> {
                    System.out.println("Saliendo del cajero automático. Sayonara!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida...\n");
            }
        }
    }
}
