import java.util.Scanner;

public class DibujarRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un Rectángulo ***");
        var consola = new Scanner(System.in);
        System.out.print("Proporciona el número de filas para el triangulo: ");
        var numeroFilas = consola.nextInt();

        // iteramos sobre cada fila del triangulo
        for(var fila = 1; fila <= numeroFilas; fila ++){
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}
