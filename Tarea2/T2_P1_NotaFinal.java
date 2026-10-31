import java.util.Scanner;

public class T2_P1_NotaFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, promedio;

        System.out.print("Ingrese la primera nota: ");
        n1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        n2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        n3 = sc.nextDouble();

        if (n1 >= 0 && n1 <= 20 &&
            n2 >= 0 && n2 <= 20 &&
            n3 >= 0 && n3 <= 20) {

            promedio = (n1 + n2 + n3) / 3;

            System.out.printf("Promedio: %.2f%n", promedio);

            if (promedio >= 14) {
                System.out.println("Aprobado");
            } else if (promedio >= 9) {
                System.out.println("Supletorio");
            } else {
                System.out.println("Reprobado");
            }

        } else {
            System.out.println("Las notas deben estar entre 0 y 20");
        }
    }
}