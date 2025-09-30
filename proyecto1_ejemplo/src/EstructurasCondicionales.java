import java.util.Scanner;

public class EstructurasCondicionales {

    public static String mayorMenor(int edad){
        if(edad > 18){
            return "Eres mayor de edad";
        } else {
            return "Eres menor de edad";
        }
    }

    public static String aprobadoReprobado(int calificacion){
        if (calificacion >= 7){
            return "Alumno aprobado";
        } else {
            return "Alumno reprobado";
        }
    }

    public static String numeroPositivo(int numero){
        if (numero > 0){
            return "El número es positivo";
        } else {
            return "El número es negativo";
        }
    }

    public static String descuento(double montoCompra){
        double descuento;
        double montoFinal;
        if (montoCompra >= 1000) {
            descuento = montoCompra * 0.1;
        } else {
            descuento = montoCompra * 0.05;
        }
        montoFinal = montoCompra - descuento;
        return "Total a pagar con descuento: " + montoFinal;
    }

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

        // mayor o menor de edad
        System.out.print("Cual es tu edad? ");
        int edad = consola.nextInt();
        System.out.println(mayorMenor(edad));

        // aprobado o reprobado
        System.out.print("Cual es tu calificacion? ");
        int calificacion = consola.nextInt();
        System.out.println(aprobadoReprobado(calificacion));

        // numero positivo o negativo
        System.out.print("Introduce un número: ");
        int numero = consola.nextInt();
        System.out.println(numeroPositivo(numero));

        // descuento en una compra
        System.out.print("De cuanto fue el monto de la compra? ");
        int montoCompra = consola.nextInt();
        System.out.println(descuento(montoCompra));
    }
}
