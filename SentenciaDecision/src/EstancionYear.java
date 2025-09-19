import java.util.Scanner;

public class EstancionYear {
    public static void main(String[] args) {
        System.out.println("Reto: Identifica la Estación del Año");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el valor numerico del mes: ");
        var mes = Integer.parseInt(consola.nextLine());

        if (mes == 1 || mes == 2 || mes ==12){
            System.out.println("La estación del año es Invierno");
        } else if (mes == 3 || mes == 4 || mes ==5) {
            System.out.println("La estación del año es Primavera");
        } else if (mes == 6 || mes == 7 || mes ==8) {
            System.out.println("La estación del año es Verano");
        } else if (mes == 9 || mes == 10 || mes ==11) {
            System.out.println("La estación del año es Otoño");
        } else {
            System.out.println("No existen mas meses del año xD");
        }
    }
}
