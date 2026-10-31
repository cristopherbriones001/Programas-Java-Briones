import java.util.Scanner;
import java.util.Locale;

public class Lab1_E5_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b, suma, resta, producto, residuo;
        double division;
        boolean mayor, menor, igual, condicion1, condicion2;

        System.out.print("Ingrese el valor de A: ");
        a = sc.nextInt();

        System.out.print("Ingrese el valor de B: ");
        b = sc.nextInt();

        suma = a + b;
        resta = a - b;
        producto = a * b;

        System.out.println("\nOPERACIONES ARITMETICAS");
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + producto);

        if (b != 0) {
            division = (double) a / b;
            residuo = a % b;

            System.out.printf("Division real: %.2f%n", division);
            System.out.println("Residuo: " + residuo);
        } else {
            System.out.println("No se puede dividir entre cero");
        }

        mayor = a > b;
        menor = a < b;
        igual = a == b;

        System.out.println("\nOPERACIONES RELACIONALES");
        System.out.println("A > B: " + mayor);
        System.out.println("A < B: " + menor);
        System.out.println("A == B: " + igual);

        condicion1 = a > 0 && b > 0;
        condicion2 = a > 10 || b > 10;

        System.out.println("\nOPERACIONES LOGICAS");
        System.out.println("Ambos son positivos: " + condicion1);
        System.out.println("Alguno es mayor que 10: " + condicion2);

    }
}