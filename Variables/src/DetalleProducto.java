public class DetalleProducto {
    public static void main(String[] args) {
        // datos iniciales
        String nombreProducto = "Producto 1";
        double precioProducto = 499.99;
        int cantidadDisponible = 20;
        boolean disponibleVenta = true;
        System.out.println(nombreProducto);
        System.out.println(precioProducto);
        System.out.println(cantidadDisponible);
        System.out.println(disponibleVenta);

        // datos modificados
        nombreProducto = "Producto 2";
        precioProducto = 500.00;
        cantidadDisponible = 19;
        disponibleVenta = false;
        System.out.println(nombreProducto);
        System.out.println(precioProducto);
        System.out.println(cantidadDisponible);
        System.out.println(disponibleVenta);
    }
}
