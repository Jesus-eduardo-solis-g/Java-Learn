public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de índices en una cadena
        var cadena1 = "Hola Mundo";
        
        // Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);  //Recuperar h
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el ultimo caracter (en la posicion 9)
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // Ejercicio: recuperar m
        var mCaracter = cadena1.charAt(5);
        System.out.println("mCaracter = " + mCaracter);
    }
}
