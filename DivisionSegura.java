import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numerador: ");
        double numerador = scanner.nextDouble();
        System.out.print("Ingrese el denominador: ");
        double denominador = scanner.nextDouble();

        if (denominador != 0) {
            double resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        scanner.close();
    }
}
