import java.util.Scanner;

public class T2_P1_Resistencias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r1, r2, equivalente;
        char tipo;

        System.out.print("Ingrese la primera resistencia: ");
        r1 = sc.nextDouble();

        System.out.print("Ingrese la segunda resistencia: ");
        r2 = sc.nextDouble();

        if (r1 > 0 && r2 > 0) {

            System.out.print("Tipo de conexion (S/P): ");
            tipo = sc.next().toUpperCase().charAt(0);

            switch (tipo) {
                case 'S':
                    equivalente = r1 + r2;
                    System.out.println("Resistencia equivalente: "
                            + equivalente + " ohmios");
                    break;

                case 'P':
                    equivalente = (r1 * r2) / (r1 + r2);
                    System.out.println("Resistencia equivalente: "
                            + equivalente + " ohmios");
                    break;

                default:
                    System.out.println("Tipo de conexion incorrecto");
            }

        } else {
            System.out.println("Las resistencias deben ser positivas");
        }
    }
}