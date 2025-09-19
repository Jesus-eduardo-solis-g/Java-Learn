import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("Reto: Sistema de Reserva Hotel");
        var consola = new Scanner(System.in);
        final var VISTA_CON_MAR = 190.50;
        final var VISTA_SIN_MAR = 150.50;

        // datos por el usuario
        System.out.print("Nombre del Cliente: ");
        var nombre = consola.nextLine();
        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());
        System.out.print("Con vista al mar (true/false)? ");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());
        double costoTotal = 0.0;

        // detalles de la reservación
        if (vistaMar){
            costoTotal = VISTA_CON_MAR * diasEstadia;
            System.out.printf("""
                    %nCliente: %s
                    Días de estadía: %d
                    Costo total: $%.2f
                    Habitación con vista al mar: Si :)
                    """, nombre, diasEstadia, costoTotal);
        } else {
            costoTotal = VISTA_SIN_MAR * diasEstadia;
            System.out.printf("""
                    %nCliente: %s
                    Días de estadía: %d
                    Costo total: $%.2f
                    Habitación con vista al mar: No :C
                    """, nombre, diasEstadia, costoTotal);
        }
    }
}
