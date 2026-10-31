public class Ejer5_P1_Briones {
    public static void main(String[] args) {

        int contador = 0;

        System.out.println("Multiplos de 7 entre 1 y 100:");

        for (int i = 1; i <= 100; i++) {

            if (i % 7 == 0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Cantidad de multiplos: " + contador);
    }
}
