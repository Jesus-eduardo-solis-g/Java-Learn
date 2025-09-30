public class Palindromo {
    public static void main(String[] args) {
        String frase = "anita lava la tina";
        String limpio = frase.replaceAll("\\s+", "").toLowerCase();
        String invertido = new StringBuilder(limpio).reverse().toString();
        if(limpio.equals(invertido)){
            System.out.println("Es un palíndromo");
            System.out.println(frase + " / " + invertido);
        } else {
            System.out.println("No es un palíndromo");
            System.out.println(frase + " / " + invertido);
        }
    }
}
