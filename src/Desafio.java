import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "corriente";
        double saldo = 1599.99;
        int opcion = 0;

        System.out.println("***********************************");
        System.out.println("\nNombre: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo: " + saldo); 
        System.out.println("\n**********************************\n");

        String menu = """
        *** Escriba el numero de la opción deseada ***
        1. Consultar saldo
        2. Retirar dinero
        3. Depositar dinero
        9. Salir
            
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
        }

}
}