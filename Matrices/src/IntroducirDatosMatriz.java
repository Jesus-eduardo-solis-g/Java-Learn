import java.util.Scanner;

public class IntroducirDatosMatriz {
    public static void main(String[] args) {
        // introducimos valores a una matriz
        int renglones, columnas;
        var consola = new Scanner(System.in);
        // definir la matriz
        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];
        // solicitar los valores
        for(var ren = 0; ren < renglones; ren++){
            for(var col = 0; col < columnas; col++){
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        // iterar los valores de la matriz
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = "
                        + matriz[ren][col]);
            }
        }
    }
}
