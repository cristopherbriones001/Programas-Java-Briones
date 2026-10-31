import java.util.Scanner;

public class Ejer2_P1_Briones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Ingrese un numero mayor o igual a 0: ");
            n = sc.nextInt();

        } while (n < 0);

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);

        sc.close();
    }
}
