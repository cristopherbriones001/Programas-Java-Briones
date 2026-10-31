import java.util.Random;
import java.util.Scanner;

public class Lab2_E3_Briones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random azar = new Random();
        int secreto = azar.nextInt(100) + 1;
        int intentos = 0;
        boolean acerto = false;
        do {
            System.out.print("Adivina un numero del 1 al 100: ");
            int respuesta = entrada.nextInt();
            intentos++;
            if (respuesta == secreto) {
                acerto = true;
                System.out.println("Acertaste en " + intentos + " intento(s).");
            } else if (respuesta < secreto) {
                System.out.println("Mas alto.");
            } else {
                System.out.println("Mas bajo.");
            }
        } while (!acerto && intentos < 7);
        if (!acerto) System.out.println("Sin intentos. El numero era: " + secreto);
        entrada.close();
    }
}