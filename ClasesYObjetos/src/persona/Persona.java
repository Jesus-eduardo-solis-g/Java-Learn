package persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idPersona;
    private String nombre, apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;

        // incrementar el atributo static
        // Persona.contadorPersonas++;
        // asignamos el id unico con ayuda de la variable estatica
        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return "id: " + this.idPersona
                + ", Nombre: " + this.nombre
                + ", Apellido: " + this.apellido;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }
}
