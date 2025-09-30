public class SumaNumerosPares {
    static int contador, acumulador;
    public static void main(String[] args) {
        contador = 0;
        acumulador = 0;
        while(contador < 100){
            contador = contador + 2;
            acumulador = acumulador + contador;
        }
        System.out.println("La suma de los numeros pares es: " + acumulador);
    }
}
