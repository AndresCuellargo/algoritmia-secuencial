import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("El primer número es mayor.");
        } else if (num2 > num1) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        scanner.close();
    }
}
