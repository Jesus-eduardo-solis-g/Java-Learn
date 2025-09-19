import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Reto: Sistema de Autenticación ***");
        var consola = new Scanner(System.in);

        // valores correctos
        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";

        // datos del usuario
        System.out.print("Cual es tu usuario? ");
        var usuario = consola.nextLine();
        System.out.print("Cual es tu password? ");
        var password = consola.nextLine();

        // usuario correcto
        var usuarioIgual = ((usuario.equals(USUARIO_VALIDO)) && (password.equals(PASSWORD_VALIDO)));
        System.out.println("Datos son correctos? " + usuarioIgual);
    }
}
