import java.util.Scanner;
import java.util.Locale;

public class Lab1_E3_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero, centenas, decenas, unidades;

        System.out.print("Ingrese un numero de tres cifras: ");
        numero = sc.nextInt();

        if (numero >= 100 && numero <= 999) {

            centenas = numero / 100;
            decenas = (numero % 100) / 10;
            unidades = numero % 10;

            System.out.println("Centenas: " + centenas);
            System.out.println("Decenas: " + decenas);
            System.out.println("Unidades: " + unidades);

        } else {
            System.out.println("Debe ingresar un numero de tres cifras");
        }

    }
}