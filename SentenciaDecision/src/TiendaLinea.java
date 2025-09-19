import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        System.out.println("Reto: Tienda en Línea con Descuentos");
        var consola = new Scanner(System.in);
        System.out.print("Cual es el monto de su compra? ");
        var monto = Double.parseDouble(consola.nextLine());
        System.out.print("Es miembro de la tienda (true/false)? ");
        var miembro = Boolean.parseBoolean(consola.nextLine());

        if (monto >= 1000 && miembro){
            System.out.print("\nFelicidades, has obtenido un descuento del 10%");
            var descuento = monto * 0.10;
            var montoFinal = monto - descuento;
            System.out.printf("""
                    \nMonto de la compre: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """, monto, descuento, montoFinal);
        } else if (monto < 1000 && miembro) {
            System.out.print("\nFelicidades, has obtenido un descuento del 5%");
            var descuento = monto * 0.05;
            var montoFinal = monto - descuento;
            System.out.printf("""
                    \nMonto de la compre: $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """, monto, descuento, montoFinal);
        } else {
            System.out.print("\nNo obtuviste ningún tipo de descuento");
            System.out.print("\nTe invitamos a hacerte miembro de la tienda");
            System.out.printf("\nMonto final de la compra: $%.2f", monto);
        }
    }
}
