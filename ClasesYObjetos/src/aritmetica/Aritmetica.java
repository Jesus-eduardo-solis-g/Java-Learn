package aritmetica;

public class Aritmetica {
    private int operando1, operando2;

    // constructor vacio
    public Aritmetica(){}

    // constructor con dos argumentos
    public Aritmetica(int op1, int op2){ // constructor no tiene string, var, int, etc.
        operando1 = op1;
        operando2 = op2;
    }

    public void sumar() {
        var resultado = operando1 + operando2;
        System.out.println("Resultado Suma: " + resultado);
    }

     public void restar() {
        var resultado = operando1 - operando2;
        System.out.println("Resultado Resta: " + resultado);
    }

    public int getOperando1() {
        return this.operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return this.operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }
}
