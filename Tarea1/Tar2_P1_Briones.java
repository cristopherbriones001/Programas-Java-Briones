import java.util.Scanner;
import java.util.Locale;

public class Tar2_P1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int anio;

        System.out.print("Ingrese el anio: ");
        anio = sc.nextInt();

        if (anio > 0) {
            if (anio % 400 == 0) {
                System.out.println("Es bisiesto");
            } else if (anio % 100 == 0) {
                System.out.println("No es bisiesto");
            } else if (anio % 4 == 0) {
                System.out.println("Es bisiesto");
            } else {
                System.out.println("No es bisiesto");
            }
        } else {
            System.out.println("Anio no valido");
        }

    }
}