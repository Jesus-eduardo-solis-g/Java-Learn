import java.util.Scanner;

public class OperadoresLogicos {

    public static String tresCifras(int numero){
        if(numero>=100 && numero<1000){
            return "EL número tiene 3 cifras";
        } else {
            return "El número no tiene 3 cifras";
        }
    }

    public static String parImpar(int numero1){
        int resultado = numero1 % 2;
        if(resultado == 0){
            return "El número es par";
        } else {
            return "El número no es par";
        }
    }

    // rustic version
    public static String mayorTres(int numeroA, int numeroB, int numeroC){
        if(numeroA > numeroB && numeroA > numeroC){
            return "El número mayor es A: " + numeroA;
        } else if (numeroB > numeroA && numeroB > numeroC) {
            return "El número mayor es B: " + numeroB;
        } else if (numeroC > numeroA && numeroC > numeroB) {
            return "El número mayor es C: " + numeroC;
        } else {
            return "Los números son iguales";
        }
    }

    public static String ordenMayorMenor(int numeroA, int numeroB, int numeroC){
        int mayor, medio, menor;
        if(numeroA > numeroB && numeroB > numeroC){
            mayor = numeroA;
            if(numeroB >= numeroC){
                medio = numeroB;
                menor = numeroC;
            } else {
                medio = numeroC;
                menor = numeroB;
            }
        } else if (numeroB >  numeroA && numeroB > numeroC) {
            mayor = numeroB;
            if(numeroA >= numeroC){
                medio = numeroA;
                menor = numeroC;
            } else {
                medio = numeroC;
                menor = numeroA;
            }
        } else {
            mayor = numeroC;
            if(numeroA >= numeroB){
                medio = numeroA;
                menor = numeroB;
            } else {
                medio = numeroB;
                menor = numeroA;
            }
        }
        return "Orden de mayor a menor: " + mayor + ", " + medio + ", " + menor;
    }

    public static void main(String[] args) {
        // numero de tres cifras
        Scanner consola = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int numero = consola.nextInt();
        System.out.println(tresCifras(numero));

        // determinar si es par o impar
        System.out.print("Introduce un número para ver si es par o impar: ");
        int numero1 = consola.nextInt();
        System.out.println(parImpar(numero1));

        // determinar el numero mayor de los 3
        System.out.print("Introduce el número A: ");
        int numeroA = consola.nextInt();
        System.out.print("Introduce el número B: ");
        int numeroB = consola.nextInt();
        System.out.print("Introduce el número C: ");
        int numeroC = consola.nextInt();
        System.out.println(mayorTres(numeroA, numeroB, numeroC));

        // determinar el orden de los 3 números
        System.out.println(ordenMayorMenor(numeroA, numeroB, numeroC));

        consola.close();
    }

}
