public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Uso de Break y Continue en Java ***");

        // break corta el ciclo de golpe en su primera iteración
        // ejemplo break, imprimir solo el primer numero par
        System.out.println("\nPalabra break: ");
        for(var numero = 1; numero < 10; numero++){
            if(numero % 2 == 0){
                System.out.print(numero  + " ");
                break; // solo imprimio el numero 2
            }
        }

        // continue, salta a la siguiente iteracion del ciclo actual
        // ejemplo con continue, imprimir solo numero pares e ignorar impares
        System.out.println("\nPalabra continue: ");
        for (var numero = 1; numero < 10; numero++){
            if(numero % 2 == 1){
                continue;
            }
            System.out.print(numero + " ");
        }
    }
}
