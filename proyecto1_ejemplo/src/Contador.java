public class Contador {
    static int contador;

    public static void main(String[] args) {
        contador = 0;
        while (contador < 10){
            System.out.println("Hola, estas dentro de un ciclo?");
            System.out.println("Contador " + contador);
            contador += 1;
        }
        System.out.println("Fin del ciclo");
    }
}
