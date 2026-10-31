import java.util.Scanner;
import java.util.Locale;

public class Tar1_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, x1, x2;

        System.out.print("Ingrese a: ");
        a = sc.nextDouble();
        System.out.print("Ingrese b: ");
        b = sc.nextDouble();
        System.out.print("Ingrese c: ");
        c = sc.nextDouble();

        d = b * b - 4 * a * c;

        if (a != 0 && d > 0) {
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);
        } else {
            System.out.println("No se cumplen las condiciones");
        }

    }
}