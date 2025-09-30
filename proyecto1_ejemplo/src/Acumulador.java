import java.util.Scanner;

public class Acumulador {
    static int cuentaBancaria, cantidad;
    static String respuesta;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inJ = new Scanner(System.in);
        cuentaBancaria = 0;
        respuesta = "si";
        while (respuesta.equals("si")){
            System.out.println("Introduce una cantidad de deposito");
            cantidad = in.nextInt();
            cuentaBancaria = cuentaBancaria + cantidad;

            System.out.println("para seguir introduce \"si\" para salir \"no\" ");
            respuesta = inJ.nextLine();
        }
        System.out.println("El total en tu cuenta es: " + cuentaBancaria);
    }
}
