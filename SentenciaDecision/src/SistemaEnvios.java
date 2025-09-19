import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("Reto: Sistema de Envíos");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine();
        System.out.print("Ingresa el peso del paquete (en kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        double costoFinal = 0;
        if (destino.equals("nacional")){
            costoFinal = peso * 10;
            System.out.printf("\nEl costo de envio del paquete es: $%.2f", costoFinal);
        } else if (destino.equals("internacional")) {
            costoFinal = peso * 20;
            System.out.printf("\nEl costo de envio del paquete es: $%.2f", costoFinal);
        } else {
            System.out.println("Destino o peso desconodico");
        }
    }
}
