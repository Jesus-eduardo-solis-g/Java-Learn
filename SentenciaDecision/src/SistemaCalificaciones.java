import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("Reto: Sistema de Calificaciones");
        var consola = new Scanner(System.in);

        System.out.print("Introduce tu calificacion: ");
        var calificacion = Double.parseDouble(consola.nextLine());
        
        if (calificacion >= 9 && calificacion <= 10){
            System.out.println("Tu calificacion es A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Tu calificacion es B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("Tu calificacion es C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("Tu calificacion es D");
        } else if (calificacion >= 0 && calificacion < 6){
            System.out.println("Tu calificacion es F");
        } else {
            System.out.println("Valor desconocido");
        }
    }
}
