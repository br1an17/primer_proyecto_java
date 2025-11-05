import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre = "juan";
        String cuenta = "ahorro";
        double saldo = 1500.0;
         int opcion = 0;


        Scanner scanner = new Scanner(System.in);
        String menu = """
                Bienvenido, %s. Seleccione una opción:
                1. Consultar saldo
                2. Retirar dinero
                3. Depositar dinero
                4. Salir
                """.formatted(nombre);

        while (opcion != 4) {
            System.out.println(menu);
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> System.out.printf("Su saldo actual es: %.2f%n", saldo);
                case 2 -> {
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro <= saldo) {
                        saldo -= retiro;
                        System.out.printf("Retiro exitoso. Nuevo saldo: %.2f%n", saldo);
                    } else {
                        System.out.println("Fondos insuficientes.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.printf("Depósito exitoso. Nuevo saldo: %.2f%n", saldo);
                }
                case 4 -> System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                default -> System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
        scanner.close();

    }
}
