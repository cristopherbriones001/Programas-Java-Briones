import java.util.Scanner;

public class T2_P1_HoraSiguiente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hh, mm, ss;

        System.out.print("Ingrese la hora: ");
        hh = sc.nextInt();

        System.out.print("Ingrese los minutos: ");
        mm = sc.nextInt();

        System.out.print("Ingrese los segundos: ");
        ss = sc.nextInt();

        if (hh >= 0 && hh <= 23 &&
            mm >= 0 && mm <= 59 &&
            ss >= 0 && ss <= 59) {

            ss++;

            if (ss == 60) {
                ss = 0;
                mm++;
            }

            if (mm == 60) {
                mm = 0;
                hh++;
            }

            if (hh == 24) {
                hh = 0;
            }

            System.out.printf("%02d:%02d:%02d%n", hh, mm, ss);

        } else {
            System.out.println("Hora incorrecta");
        }
    }
}