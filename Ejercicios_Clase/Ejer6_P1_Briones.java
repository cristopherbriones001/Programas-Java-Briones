public class Ejer6_P1_Briones {
    public static void main(String[] args) {

        int bacterias = 100;
        int horas = 0;

        while (bacterias <= 1000000) {

            bacterias *= 2;
            horas++;

            System.out.println("Hora " + horas + ": " + bacterias + " bacterias");
        }

        System.out.println("Horas necesarias: " + horas);
        System.out.println("Poblacion final: " + bacterias);
    }
}
