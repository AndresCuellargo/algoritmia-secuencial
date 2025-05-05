import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número no es positivo.");
        }
        
        scanner.close();
    }
}
