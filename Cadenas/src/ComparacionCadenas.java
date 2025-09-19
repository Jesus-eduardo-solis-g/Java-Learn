public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de Cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        // comparacion de cadenas (==) comparan la referencia
        System.out.print("cadena1 es igual en referencia a la cadena2: ");
        System.out.println(cadena1 == cadena2);
        // comparamos cadena1 con cadena3 (referencias)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        // comparar contenido usaremos el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
