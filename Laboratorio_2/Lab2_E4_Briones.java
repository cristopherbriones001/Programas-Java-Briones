import java.util.Scanner;

public class Lab2_E4_Briones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamano;
        do {
            System.out.print("Ingrese un numero impar positivo: ");
            tamano = entrada.nextInt();
            if (tamano <= 0 || tamano % 2 == 0) {
                System.out.println("Tamano invalido. Intente otra vez.");
            }
        } while (tamano <= 0 || tamano % 2 == 0);
        int mitad = tamano / 2;
        for (int fila = 0; fila < tamano; fila++) {
            int nivel = fila <= mitad ? fila : tamano - 1 - fila;
            for (int espacio = 0; espacio < mitad - nivel; espacio++) {
                System.out.print(" ");
            }
            for (int estrella = 0; estrella < 2 * nivel + 1; estrella++) {
                System.out.print("*");
            }
            System.out.println();
        }
        entrada.close();
    }
}