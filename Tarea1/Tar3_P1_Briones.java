import java.util.Scanner;
import java.util.Locale;

public class Tar3_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horas;
        double pago;

        System.out.print("Ingrese las horas: ");
        horas = sc.nextInt();

        if (horas <= 0) {
            System.out.println("Horas no validas");
        } else {
            if (horas == 1) {
                pago = 1.00;
            } else {
                pago = 1.00 + (horas - 1) * 0.50;
            }

            if (pago > 6.00) {
                pago = 6.00;
            }

            System.out.printf("Total: $%.2f%n", pago);
        }

    }
}