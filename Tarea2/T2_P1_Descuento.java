import java.util.Scanner;

public class T2_P1_Descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PRECIO = 8.50;
        final double IVA = 0.15;
        final double DESCUENTO1 = 0.05;
        final double DESCUENTO2 = 0.10;

        int cantidad;
        double subtotal, descuento, total, impuesto;

        System.out.print("Ingrese la cantidad de sacos: ");
        cantidad = sc.nextInt();

        if (cantidad > 0) {

            subtotal = cantidad * PRECIO;

            if (cantidad <= 20) {
                descuento = 0;
            } else if (cantidad <= 50) {
                descuento = subtotal * DESCUENTO1;
            } else {
                descuento = subtotal * DESCUENTO2;
            }

            impuesto = (subtotal - descuento) * IVA;
            total = subtotal - descuento + impuesto;

            System.out.printf("Subtotal: $%.2f%n", subtotal);
            System.out.printf("Descuento: $%.2f%n", descuento);
            System.out.printf("IVA: $%.2f%n", impuesto);
            System.out.printf("Total: $%.2f%n", total);

        } else {
            System.out.println("Cantidad incorrecta");
        }
    }
}