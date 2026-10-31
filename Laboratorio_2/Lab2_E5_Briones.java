import java.util.Locale;
import java.util.Scanner;

public class Lab2_E5_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        double saldo = 500.0;
        int opcion;
        do {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("0. Salir");
            System.out.print("Opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf("Saldo: $%.2f%n", saldo);
                    break;
                case 2:
                    System.out.print("Monto a depositar: ");
                    double deposito = entrada.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Deposito aceptado.");
                    } else {
                        System.out.println("Monto invalido.");
                    }
                    break;
                case 3:
                    System.out.print("Monto a retirar: ");
                    double retiro = entrada.nextDouble();
                    if (retiro <= 0) {
                        System.out.println("Monto invalido.");
                    } else if (retiro > saldo) {
                        System.out.println("Fondos insuficientes.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Retiro aceptado.");
                    }
                    break;
                case 0:
                    System.out.println("Fin del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
        entrada.close();
    }
}
