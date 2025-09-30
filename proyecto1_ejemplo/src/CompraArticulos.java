import java.util.Scanner;

public class CompraArticulos {
    static String respuesta;
    static double totalBruto, cantidad, totalNeto;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        respuesta = "si";
        totalBruto = 0;
        totalNeto = 0;

        while(respuesta.equals("si")){
            System.out.print("Introduzca el precio del producto: ");
            cantidad = in.nextInt();
            totalBruto += cantidad;

            System.out.print("Hay otro producto? Introduce \"si\" para salir \"no\" ");
            respuesta = in1.nextLine();
        }

        totalBruto = totalBruto + (totalBruto*.15);
        System.out.println("El total de la compra es " + totalBruto);

        if(totalBruto > 1000){
            totalNeto = totalBruto - (totalBruto*0.05);
            System.out.println("El total de la compra menos descuento es: " + totalNeto);
        }
    }
}
