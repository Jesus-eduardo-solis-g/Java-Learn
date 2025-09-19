import java.util.Scanner;

public class EstancionYearMejorado {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el valor numerico del mes: ");
        var mes = Integer.parseInt(consola.nextLine());
        switch (mes){
            case 1, 2, 12 -> System.out.println("Invierno");
            case 3, 4, 5 -> System.out.println("Primavera");
            case 6, 7, 8 -> System.out.println("Verano");
            case 9, 10, 11 -> System.out.println("Otoño");
            default -> System.out.println("Mes invalido: " + mes);
        }
    }
}
