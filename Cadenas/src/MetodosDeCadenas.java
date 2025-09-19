public class MetodosDeCadenas {
    public static void main(String[] args) {
        // metodo de cadenas
        var cadena1 = "Hola Mundo";
        
        // obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);
        
        // reemplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        // convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // convertir a minusculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        // eliminar espacios al inicio y al final
        var cadena2 = " Leo Reyes     ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
    }
}
