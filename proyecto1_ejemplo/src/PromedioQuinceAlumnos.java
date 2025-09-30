import java.util.Scanner;

public class PromedioQuinceAlumnos {
    static int contador;
    static double acumulador, promedio, calificacion;

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        contador = 0;
        acumulador = 0;
        while(contador < 15) {
            contador += 1;
            System.out.println("Introduce la calificación del alumno " + contador);
            calificacion = consola.nextDouble();
            acumulador = acumulador + calificacion;
        }
        promedio = acumulador/15;
        System.out.println("El promedio del grupo es: " + promedio);
    }
}
