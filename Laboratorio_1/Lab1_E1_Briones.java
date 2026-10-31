import java.util.Scanner;
import java.util.Locale;

public class Lab1_E1_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit, kelvin;

        System.out.print("Ingrese la temperatura en Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9.0 / 5.0) + 32;
        kelvin = celsius + 273.15;

        if (kelvin < 0) {
            System.out.println("Temperatura no valida");
        } else {
            System.out.printf("Fahrenheit: %.2f F%n", fahrenheit);
            System.out.printf("Kelvin: %.2f K%n", kelvin);
        }

    }
}