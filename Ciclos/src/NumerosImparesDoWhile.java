public class NumerosImparesDoWhile {
    public static void main(String[] args) {
        System.out.println("Reto: Numeros Impares con Do While");
        var contador = 0;
        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
            contador ++;
        } while (contador <= 20);
    }
}
