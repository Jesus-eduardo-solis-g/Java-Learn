import java.util.Scanner;

public class AreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("Reto: Cálculo Área y Perímetro de un Rectángulo");
        var consola = new Scanner(System.in);

        //pedir base y altura al usuario
        System.out.print("Cual es la altura del rectangulo? ");
        var altura = Integer.parseInt(consola.nextLine());
        System.out.print("Cual es la base del rectangulo? ");
        var base = Integer.parseInt(consola.nextLine());

        // calculos
        var area = base * altura;
        var perimetro = 2 * (base + altura);
        System.out.printf("La base del rectangulo es %s y la altura es %s", base, altura);
        System.out.printf("\nEl área es %s y el perimetro es %s", area, perimetro);
    }
}
