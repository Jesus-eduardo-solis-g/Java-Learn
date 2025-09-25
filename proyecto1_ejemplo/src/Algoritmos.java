import java.util.Scanner;

public class Algoritmos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // algoritmo de suma
        System.out.print("Introduce el primer numero: ");
        int numeroA = consola.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numeroB = consola.nextInt();
        int resultado = numeroA + numeroB;
        System.out.println("suma = " + resultado);

        // calcular el area de un cuadrado
        System.out.print("Introduce el tamaño de un lado de un cuadrado: ");
        int lado = consola.nextInt();
        int area = lado * lado;
        System.out.println("area = " + area);

        // area de un triangulo
        System.out.print("Introduce la base del triangulo: ");
        int base = consola.nextInt();
        System.out.print("Introduce la altura del triangulo: ");
        int altura = consola.nextInt();
        int areaT = (base * altura)/2;
        System.out.println("area del triangulo = " + areaT);

        // calcular el cuadrado de un número
        System.out.print("Introduce el numero para elevarlo al cuadrado: ");
        int numero1 = consola.nextInt();
        int cuadrado = numero1 * numero1;
        System.out.print("El cuadrado de " + numero1 + " es " + cuadrado);

        System.out.println();
        // sacar promedio con 3 calificaciones
        System.out.print("Calificacion 1: ");
        int calificacion1 = consola.nextInt();
        System.out.print("Calificacion 2: ");
        int calificacion2 = consola.nextInt();
        System.out.print("Calificacion 3: ");
        int calificacion3 = consola.nextInt();
        int sumaCal = calificacion1+calificacion2+calificacion3;
        int promedio = sumaCal/3;
        System.out.println("Promedio de calificaciones: " + promedio);

        // calcular el salario de un empleado dadas sus horas trabajadas al mes y la tarifa por hora
        System.out.print("Cuantas horas trabajaste al mes? ");
        int horasT = consola.nextInt();
        System.out.print("Tarifa por hora? ");
        int tarifaT = consola.nextInt();
        System.out.print("Tu salario de este mes es: " + horasT*tarifaT);

        // calcular la distancia recorrida en metros por un carro
        // que tiene una velocidad constante durante un tiempo en segundos
        // me aburri de estar usando scanner
        int velocidad = 10;
        int tiempo = 8;
        int distancia = velocidad * tiempo;
        System.out.println("distancia = " + distancia);

        consola.close();
    }
}
