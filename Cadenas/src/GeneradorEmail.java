import java.util.Locale;

public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("--- Generador Email ---");
        var nombre = " Ubaldo Acosta Soto ".strip();
        var nombreNormalizado = nombre.toLowerCase().replace(" ", ".");
        System.out.println("Nombre usuario: " + nombre);
        System.out.println("Nombre usuario normalizado: " + nombreNormalizado);

        // mi version
        var empresa = "Global Mentoring";
        System.out.println("Nombre empresa: " + empresa);
        var empresaNormalizado = empresa.toLowerCase().replace(" ", "");
        var dominio = "com.mx";
        var concatenarCadena = "@" + empresaNormalizado + "." + dominio;
        System.out.println("Dominio de email normalizado = " + concatenarCadena);

        // version video
        // var nombreEmpresa = " Global Mentoring ";
        // System.out.println("\nNombre empresa: " + nombreEmpresa);
        // var extensionDominio = " com.mx ";
        // System.out.println("\nExtension del dominio: " + extensionDominio);
        // Quitamos los espacios en blanco y convertimos a minusculas
        // var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        // var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        // System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        System.out.println("Email final generado: " + nombreNormalizado + concatenarCadena);
    }
}
