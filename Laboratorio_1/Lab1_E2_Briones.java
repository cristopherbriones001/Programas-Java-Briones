import java.util.Scanner;
import java.util.Locale;

public class Lab1_E2_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tiempo, horas, minutos, segundos, residuo;

        System.out.print("Ingrese el tiempo en segundos: ");
        tiempo = sc.nextInt();

        if (tiempo >= 0) {

            horas = tiempo / 3600;
            residuo = tiempo % 3600;
            minutos = residuo / 60;
            segundos = residuo % 60;

            System.out.println("Horas: " + horas);
            System.out.println("Minutos: " + minutos);
            System.out.println("Segundos: " + segundos);

        } else {
            System.out.println("Tiempo no valido");
        }

    }
}