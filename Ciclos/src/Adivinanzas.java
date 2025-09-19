import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    public static void main(String[] args) {
        System.out.println("Reto: Adivinar un numero");
        var consola = new Scanner(System.in);
        var random = new Random();

        // generamos un numero aleatorio entre 1 y 50;
        var numeroSecreto = random.nextInt(50) + 1;
        var intentos = 0;
        var adivinanza = 0;
        final var INTENTOS_MAXIMOS = 5;

        while (adivinanza != numeroSecreto && intentos < INTENTOS_MAXIMOS){
            System.out.print("Adivina el número secreto (1-50): ");
            adivinanza = consola.nextInt();

            // agregar ayuda para orientar al jugador
            if(adivinanza < numeroSecreto)
                System.out.println("El número secreto es mayor");
            else if (adivinanza > numeroSecreto) {
                System.out.println("El numero secreto es menor");
            }

            // incrementamos la variable de intentos
            intentos++;
        }

        // conclusion del juego
        if (adivinanza == numeroSecreto){
            System.out.printf("Felicidades, adivinaste el numero secreto en %d intentos%n", intentos);
        } else {
            System.out.printf("Lo siento, haas agotado tus intentos maximos: %d%n", INTENTOS_MAXIMOS);
            System.out.printf("El numero secreto era: %d%n", numeroSecreto);
        }
    }
}
