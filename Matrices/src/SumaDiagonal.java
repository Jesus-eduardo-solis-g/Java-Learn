import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
        System.out.println("*** Reto: Suma de la Diagonal de una matriz");

        int renglones, columnas;
        var consola = new Scanner(System.in);

        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];

        for(var ren = 0; ren < renglones; ren++){
            for(var col = 0; col < columnas; col++){
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        System.out.println();
        var sumatoria = 0;
        for(var ren = 0; ren < renglones; ren++){
            for(var col = 0; col < columnas; col++){
                if (ren == col){
                    sumatoria += matriz[ren][col];
                }
            }
        }
        System.out.println("La sumatoria diagonal es: " + sumatoria);
    }
}
