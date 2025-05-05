import java.util.Scanner;

public class IntercambioValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer valor (A): ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo valor (B): ");
        int b = scanner.nextInt();

        // Intercambio sin variable auxiliar
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Después del intercambio: A = " + a + ", B = " + b);
        scanner.close();
    }
}
