public class Ejer3_P1_Briones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero entero: ");
        int n = sc.nextInt();

        long numero = Math.abs((long) n);

        int cifras = 0;
        int suma = 0;

        if (numero == 0) {
            cifras = 1;
        }

        while (numero > 0) {
            int digito = (int) (numero % 10);

            suma += digito;
            cifras++;

            numero /= 10;
        }

        System.out.println("Cantidad de cifras: " + cifras);
        System.out.println("Suma de cifras: " + suma);

        sc.close();
    }
}
