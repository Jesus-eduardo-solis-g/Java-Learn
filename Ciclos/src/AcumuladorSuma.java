public class AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Acumulador Suma ***");
        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // iterar los valores
        var numero = 1;
        while(numero <= MAXIMO){
            // imprimir lo que se va a sumar
            System.out.println("(acumuladorSuma + numero) -> " + acumuladorSuma + " + " + numero);

            // realizar la suma acumulativa
            acumuladorSuma += numero++; // acumuladorSuma = acumuladorSuma + numero

            // imprimir suma parcial acumulada
            System.out.println("Suma parcial acumulada: " + acumuladorSuma + "\n");
        }
        System.out.println("Suma de los primeros " + MAXIMO + " numeros: " + acumuladorSuma);
    }
}
