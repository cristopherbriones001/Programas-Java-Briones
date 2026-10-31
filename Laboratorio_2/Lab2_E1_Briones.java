import java.util.Locale;

public class Lab2_E1_Briones {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        for (int fila = 1; fila <= 10; fila++) {
            for (int columna = 1; columna <= 10; columna++) {
                System.out.printf("%4d", fila * columna);
            }
            System.out.println();
        }
    }
}
