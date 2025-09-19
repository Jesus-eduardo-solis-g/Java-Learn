public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparación ***");
        int a = 3, b = 2;
        // igualdad ==
        var resultado = a == b;
        System.out.println("resultado a==b = " + resultado);
        // distinto !=
        resultado = a != b;
        System.out.println("resultado a!=b = " + resultado);
        // mayor que
        resultado = a > b;
        System.out.println("resultado a>b = " + resultado);
        // menor que
        resultado = a < b;
        System.out.println("resultado a<b = " + resultado);
        //mayor o igual que
        resultado = a >= b;
        System.out.println("resultado a>=b = " + resultado);
        // menor o igual que
        resultado = a <= b;
        System.out.println("resultado a<=b = " + resultado);
    }
}
