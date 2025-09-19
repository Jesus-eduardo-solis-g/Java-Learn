import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        System.out.println("*** Aplicación de Salud y Fitness ***");
        var consola = new Scanner(System.in);

        // constantes
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04; // valor aproximado, son kilocalorias

        System.out.print("Cual es tu nombre: ");
        var nombreUsuario = consola.nextLine();
        System.out.print("Cuantos pasos has camindo hoy? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        // Verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIO ? "Si :)" : "No :C");

        // calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        // mostramos la informacion
        System.out.printf("""
                %nUsuario: %s
                Paso dados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzada: %s
                -----------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, pasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO);
    }
}
