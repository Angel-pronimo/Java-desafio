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
        System.out.println("\n**********************************");

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
        

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es: " + saldo + "$");            
                    break;
                case 2:
                    System.out.println("¿Cuanto dinero desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo > valorARetirar) {
                        saldo -= valorARetirar;
                        System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldo + "$");
                    } else {
                        System.out.println("No tiene suficiente saldo para retirar esa cantidad.");
                        
                    }
                    break;
                case 3:
                    System.out.println("¿Cuanto dinero desea depositar?");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Depósito exitoso. Su nuevo saldo es: " + saldo + "$");
                    break;
                case 9:
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    break;
            }

        }
    }
}