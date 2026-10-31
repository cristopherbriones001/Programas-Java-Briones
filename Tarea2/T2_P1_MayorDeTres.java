import java.util.Scanner;

public class T2_P1_MayorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Ingrese el primer numero: ");
        a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        c = sc.nextInt();

        if (a != b && a != c && b != c) {

            if (a > b && b > c) {
                System.out.println(a + " " + b + " " + c);

            } else if (a > c && c > b) {
                System.out.println(a + " " + c + " " + b);

            } else if (b > a && a > c) {
                System.out.println(b + " " + a + " " + c);

            } else if (b > c && c > a) {
                System.out.println(b + " " + c + " " + a);

            } else if (c > a && a > b) {
                System.out.println(c + " " + a + " " + b);

            } else {
                System.out.println(c + " " + b + " " + a);
            }

        } else {
            System.out.println("Los numeros deben ser diferentes");
        }
    }
}