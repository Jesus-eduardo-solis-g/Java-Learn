public class TiposDatos {
    public static void main(String[] args) {
        // tipos de datos en java
        // Enteros  (su valor por default es 0)
        byte tipoByte = 127; // maximo 127
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort = 32000; // maximo 32000 para convertir (short)320000
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147482647; // hasta 32 bite
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321; // con mas datos se agrega "l" o "L"
        System.out.println("tipoLong = " + tipoLong);

        // Punto Flotante (su valor por default es 0.0)
        float tipoFloat = 3.14F;  // hay que indicar la "f" o "F"
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315;  //opcinal indicar "D" o "d"
        System.out.println("tipoDouble = " + tipoDouble);

        // Caracter (su valor por default es '\u0000')
        char tipoChar = 'A';  //caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;  // valor de la letra en el juego
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        
        // Booleano (su valor por default es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);
        
        // Object (referencia)
        String nombre = null; // valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);

    }
}
