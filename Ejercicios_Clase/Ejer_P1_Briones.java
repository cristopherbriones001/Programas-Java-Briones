import java.util.Scanner;

public class Ejer_P1_Briones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero natural: ");
        int n = sc.nextInt();

        int suma = 0;

        for (int i = 1; i <= n; i++) {
            suma += i;
        }

        int formula = n * (n + 1) / 2;

        System.out.println("Suma con for: " + suma);
        System.out.println("Suma con formula: " + formula);
        System.out.println("Son iguales: " + (suma == formula));

        sc.close();
    }
}