public class ArgumentosVariables {
    public static void main(String[] args) {
        //imprimirNumero(1, 2, 3, 4, 5); // var args
        variosParametros("Karla", 10, 20, 30);
    }

    static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre: " + nombre);
        imprimirNumero(numeros);
    }

    static void imprimirNumero(int... numeros) {
        for (var i = 0; i < numeros.length; i++)
            System.out.print(numeros[i] + " ");
    }
}
