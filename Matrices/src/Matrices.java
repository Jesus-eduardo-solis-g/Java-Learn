public class Matrices {
    public static void main(String[] args) {
        // definimos una matriz
        // int[][] matriz = new int[2][3];
        var matriz = new int[2][3];  //unicamente estamos reservando espacio de memoria
        // modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // accedemos a algunos valores
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 3 [0][2] = " + matriz[0][2]);
        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);



        // recorrer una matriz
        final var RENGLONES = 2;
        final var COLUMNAS = 3;
        var matriZ = new int[RENGLONES][COLUMNAS];
        matriZ[0][0] = 100;
        matriZ[0][1] = 200;
        matriZ[0][2] = 300;
        matriZ[1][0] = 400;
        matriZ[1][1] = 500;
        matriZ[1][2] = 600;
        // recorrer una matriZ
        // 1. Ciclo mas externo, recorrer los renglones
        for(var ren = 0; ren < RENGLONES; ren++){
            // 2.Ciclo interno, recorrer los columnas
            for (var col = 0; col < COLUMNAS; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriZ[ren][col]);
            }
        }
    }
}
