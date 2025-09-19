public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Aritmeticos ***");
        int a = 5, b = 3, resultado;  // var no esta permitido para varias variables
        // suma +
        resultado = a + b;
        System.out.println("resultado suma = " + resultado);
        // resta -
        resultado = a -b;
        System.out.println("resultado resta = " + resultado);
        // multiplicacion
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        // division
        resultado = a / b;
        System.out.println("Resultado division = " + resultado);
        // modulo (residuo division) %
        resultado = a % b;
        System.out.println("Resultado modulo = " + resultado);
    }
}
