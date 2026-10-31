import java.util.Scanner;
import java.util.Locale;

public class Tar4_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.print("Lado A: ");
        a = sc.nextDouble();
        System.out.print("Lado B: ");
        b = sc.nextDouble();
        System.out.print("Lado C: ");
        c = sc.nextDouble();

        if (a > 0 && b > 0 && c > 0 &&
            a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Equilatero");
            } else if (a == b || a == c || b == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Escaleno");
            }
        } else {
            System.out.println("No forma un triangulo");
        }

        sc.close();
    }
}