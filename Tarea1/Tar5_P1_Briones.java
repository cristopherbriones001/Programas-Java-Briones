import java.util.Scanner;
import java.util.Locale;

public class Tar5_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int opcion;
        double valor, resultado;

        System.out.println("1. Metros a pies");
        System.out.println("2. Kilogramos a libras");
        System.out.println("3. Celsius a Fahrenheit");

        System.out.print("Seleccione: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Metros: ");
                valor = sc.nextDouble();
                resultado = valor * 3.28084;
                System.out.printf("%.2f pies%n", resultado);
                break;

            case 2:
                System.out.print("Kilogramos: ");
                valor = sc.nextDouble();
                resultado = valor * 2.20462;
                System.out.printf("%.2f libras%n", resultado);
                break;

            case 3:
                System.out.print("Celsius: ");
                valor = sc.nextDouble();
                resultado = valor * 9 / 5 + 32;
                System.out.printf("%.2f Fahrenheit%n", resultado);
                break;

            default:
                System.out.println("Opcion incorrecta");
        }

    }
}