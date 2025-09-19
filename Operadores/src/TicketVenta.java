import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generacion ticket de venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio Pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // calculo subtotal sin impuestos
        var subtotal = precioLechuga + precioLeche + precioPan + precioPlatanos;

        // aplicar el descuento
        var descuento = subtotal * (descuentoPorcentaje/100.0);

        // subtotal con descuento
        var subTotalDescuento = subtotal - descuento;

        // calculo con impuestos 16%
        var impuesto = subTotalDescuento * 0.16;

        // calculo total de la compra (con impuestos)
        var costoTotalCompra = subTotalDescuento + impuesto;

        // imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                -----------------
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);
    }
}
