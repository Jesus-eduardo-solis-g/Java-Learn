public class MatrizSimplificada {
    public static void main(String[] args) {
        // definimos una matriz
        var matriz = new int[][]{{100, 200, 300},{400, 500, 600}};

        // recorrer la matriz con un ciclo
        for (var ren = 0; ren < matriz.length; ren++){
            for(var col = 0; col < matriz[ren].length; col++){
                System.out.println("Valor[" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
