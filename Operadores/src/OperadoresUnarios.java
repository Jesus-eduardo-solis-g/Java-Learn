public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;
        // operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);
        // operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // operadores unarios incremento / decremento
        // pre-incremento
        a = 3;
        resultado = ++a;  // primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        // post-incremento
        a = 3;
        resultado = a++; // primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa = " + a);
        // pre-drecemento
        b = -2;
        resultado = --b;
        System.out.println("resultado --b = " + resultado);
        // post-drecemento
        b = -2;
        resultado = b--;
        System.out.println("resultado b-- = " + resultado);
    }
}
