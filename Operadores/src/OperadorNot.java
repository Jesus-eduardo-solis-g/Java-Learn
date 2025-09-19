public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("*** Operador NOT ***");
        boolean a = false, b = true;
        // operador not ! (invertir el valor logico)
        var resultado = !a;
        System.out.println("resultado = " + resultado);
        resultado = !b;
        System.out.println("resultado = " + resultado);
    }
}
