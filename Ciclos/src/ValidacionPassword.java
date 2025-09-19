import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        System.out.println("Reto: Creación y Validación de Password");
        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu nueva contraseña (de al menos 6 caracteres): ");
        String password = consola.nextLine();

        // validar el password
        while (password.length() < 6){
            System.out.println("El password no tiene minimo 6 caracteres.");
            System.out.print("Ingresa un nuevo password: ");
            password = consola.nextLine();
        }
        System.out.println("El password es valido: " + password);
    }
}
