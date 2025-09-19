import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("Reto: Sistema de Autenticación");
        var consola = new Scanner(System.in);
        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";

        System.out.print("Ingresa el usuario: ");
        var usuario = consola.nextLine().strip();
        System.out.print("Ingresa el password: ");
        var password = consola.nextLine().strip();

        var mensajeAutenticacion = switch (usuario){
            case USUARIO_VALIDO -> {
                if (PASSWORD_VALIDO.equals(password))
                    yield "Bienvenido al Sistema!";
                else
                    yield "Password incorrecto, favor de corregirlo!";
            }
            default -> {
                if (PASSWORD_VALIDO.equals(password))
                    yield "Usuario incorrecto, favor de corregirlo!";
                else
                    yield "Usuario y Password incorrectos, favor de corregirlos!";
            }
        };
        System.out.println(mensajeAutenticacion);
    }
}
