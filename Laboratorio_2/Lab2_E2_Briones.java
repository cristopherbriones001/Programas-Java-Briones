import java.util.Locale;
import java.util.Scanner;

public class Lab2_E2_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);
        int cantidad = 0;
        double suma = 0, minimo = 0, maximo = 0;
        System.out.print("Temperatura (negativa para terminar): ");
        double lectura = entrada.nextDouble();
        while (lectura >= 0) {
            if (cantidad == 0) {
                minimo = lectura;
                maximo = lectura;
            } else {
                if (lectura < minimo) minimo = lectura;
                if (lectura > maximo) maximo = lectura;
            }
            suma += lectura;
            cantidad++;
            System.out.print("Temperatura (negativa para terminar): ");
            lectura = entrada.nextDouble();
        }
        if (cantidad == 0) {
            System.out.println("No hubo lecturas validas.");
        } else {
            System.out.printf("Lecturas: %d Promedio: %.2f Max: %.2f Min: %.2f%n",
                    cantidad, suma / cantidad, maximo, minimo);
        }
        entrada.close();
    }
}