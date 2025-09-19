import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Reto: Promedio de Calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Cuantas Calificaciones deseas agregar? ");
        var totalCalificaciones = Integer.parseInt(consola.nextLine());
        var calificaciones = new int[totalCalificaciones];
        for (var i = 0; i < totalCalificaciones; i++) {
            System.out.print("Calificación[" + i + "] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }
        int suma = 0;
        for (var i = 0; i < totalCalificaciones; i++){
            suma += calificaciones[i];
        }
        int promedio = suma / totalCalificaciones;
        System.out.println("Promedio de las Calificaciones: " + promedio);
    }
}
