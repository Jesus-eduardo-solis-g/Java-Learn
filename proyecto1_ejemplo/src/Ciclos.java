import java.util.Scanner;

public class Ciclos {
    static String respuesta;

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        respuesta = "si";
        while(respuesta.equals("si")){
            System.out.println("Hola, estas dentro del ciclo");
            System.out.print("\nPara seguir, introduce \"si\", para salir \"no\" ");
            respuesta = consola.nextLine();
        }
        System.out.println("Fin del ciclo");
    }
}
