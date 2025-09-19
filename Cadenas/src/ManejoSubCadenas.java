public class ManejoSubCadenas {
    public static void main(String[] args) {
        // tema de subcadenas
        var cadena1 = "Hola Mundo";
        
        // subcadena
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);
        var subcadena2 = cadena1.substring(5);  //substring(5, 10);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
