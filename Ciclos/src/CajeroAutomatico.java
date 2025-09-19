import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("Reto: Cajero Automatico");
        var consola = new Scanner(System.in);
        var salir = false;
        double saldoInicial = 1000.0;
        double retirar = 0;
        double depositar = 0;

        // iteracion del menu
        while(!salir) {
            System.out.print("""
                    \n*** Aplicación de Cajero Automático ***
                    Operaciones que puedes realizar:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoje una opción:\s""");
            var opcion = consola.nextInt();
            consola.nextLine();
            // evaluar cada opcion
            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo actual es: $%.2f", saldoInicial);
                case 2 -> {
                    System.out.print("\nIngresa el monto de retirar: ");
                    retirar = Double.parseDouble(consola.nextLine());
                    if (retirar <= saldoInicial){
                        saldoInicial -= retirar;
                        System.out.printf("\nTu nuevo saldo es: $%.2f%n%n", saldoInicial);
                    } else {
                        System.out.printf("\nNo cuentas con el saldo suficiente. Saldo actual es: $%.2f%n%n", saldoInicial);
                    }
                }
                case 3 -> {
                    System.out.print("\nIngresa el monto a depositar: ");
                    depositar = Double.parseDouble(consola.nextLine());
                    saldoInicial += depositar;
                    System.out.printf("\nTu nuevo saldo es: $%.2f%n%n", saldoInicial);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automático. Sayonara!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida...\n");
            }
        }
    }
}
