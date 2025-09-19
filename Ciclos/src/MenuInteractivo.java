import java.util.Scanner;

public class MenuInteractivo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        // iteracion del menu
        while(!salir){
            System.out.print("""
                    *** Sistema de Adminitración de Cuenta ***
                    Menu:
                    1. Crear Cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoje una opción:\s""");
            var opcion = consola.nextInt();
            // evaluar cada opcion
            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Sayonara!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida...\n");
            }
        }
        System.out.println("Fin del sistema de administracion de cuenta");
    }
}
