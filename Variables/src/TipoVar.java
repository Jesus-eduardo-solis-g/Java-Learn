public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java ***");
        // sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);
        // con el uso de var
        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);
        // definir otras variables usando var
        var edad = 30;
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F;
        System.out.println("sueldo = " + sueldo);
        var esCasado = false;  // se infiere tipo boolean
        esCasado = true;

        // se debe inferir su valor
        // var precio; esto lanza un error, tenemos asignar un valor
        // precio = 10;

        // se debe poder inferir el tipo de dato
        // var apellido = null; no se puede inferir un tipo de dato
    }
}
