public class ReservaDeHoteles {
    public static void main(String[] args) {
        System.out.println("--- Reservación de Hoteles ---");
        var nombreCliente = "Jesus Solis";
        System.out.println("nombreCliente = " + nombreCliente);
        var diasEstancia = 3;
        System.out.println("diasEstancia = " + diasEstancia);
        var tarifaDiaria = 300.50;
        System.out.println("tarifaDiaira = " + tarifaDiaria);
        var cuartoMar = true;
        System.out.println("cuartoMar = " + cuartoMar);

        // modificacion de datos
        nombreCliente = "Dante Gonzalez";
        System.out.println("nombreCliente = " + nombreCliente);
        diasEstancia = 4;
        System.out.println("diasEstancia = " + diasEstancia);
        tarifaDiaria = 400.60;
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        cuartoMar = false;
        System.out.println("cuartoMar = " + cuartoMar);

    }
}
