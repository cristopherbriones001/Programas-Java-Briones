import java.util.Scanner;
import java.util.Locale;

public class Lab1_E4_Briones {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String producto;
        int cantidad;
        double precio, subtotal, iva, total;

        System.out.print("Ingrese el nombre del producto: ");
        producto = sc.nextLine();

        System.out.print("Ingrese la cantidad: ");
        cantidad = sc.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        precio = sc.nextDouble();

        if (cantidad > 0 && precio >= 0) {

            subtotal = cantidad * precio;
            iva = subtotal * 0.15;
            total = subtotal + iva;

            System.out.println("\nFACTURA");
            System.out.println("Producto: " + producto);
            System.out.println("Cantidad: " + cantidad);
            System.out.printf("Precio unitario: $%.2f%n", precio);
            System.out.printf("Subtotal: $%.2f%n", subtotal);
            System.out.printf("IVA (15%%): $%.2f%n", iva);
            System.out.printf("Total: $%.2f%n", total);

        } else {
            System.out.println("Datos no validos");
        }

    }
}