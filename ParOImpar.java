import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        System.out.println(numero % 2 == 0 ? "El número es par" : "El número es impar");
        scanner.close();
    }
}
