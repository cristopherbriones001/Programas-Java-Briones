import java.util.Scanner;

public class Ejer4_P1_Briones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temperatura;
        double mayor = 0;
        double menor = 0;
        double suma = 0;
        int contador = 0;

        System.out.print("Ingrese una temperatura (-999 para terminar): ");
        temperatura = sc.nextDouble();

        while (temperatura != -999) {

            if (contador == 0) {
                mayor = temperatura;
                menor = temperatura;
            }

            if (temperatura > mayor) {
                mayor = temperatura;
            }

            if (temperatura < menor) {
                menor = temperatura;
            }

            suma += temperatura;
            contador++;

            System.out.print("Ingrese otra temperatura (-999 para terminar): ");
            temperatura = sc.nextDouble();
        }

        if (contador > 0) {
            double promedio = suma / contador;

            System.out.println("Temperatura mayor: " + mayor);
            System.out.println("Temperatura menor: " + menor);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron temperaturas.");
        }

        sc.close();
    }
}
