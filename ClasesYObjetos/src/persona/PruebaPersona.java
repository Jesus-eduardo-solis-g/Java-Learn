package persona;

import persona.Persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("*** Reto: Encapsulamiento Clase Persona ***");
        System.out.println("Variable estatica: "
                + Persona.getContadorPersonas());
        var persona1 = new Persona("Juan", "Perez");
        System.out.println(persona1); // automaticamente llama toString()
        System.out.println("Variable estatica: "
                + Persona.getContadorPersonas());
        // segundo objeto
        var persona2 = new Persona("Layla", "Ramirez");
        System.out.println(persona2);
        System.out.println("Variable estatica: "
                + Persona.getContadorPersonas());
    }
}
