import java.util.Scanner;

public class TemperaturaAdecuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 15) {
            System.out.println("Hace frío.");
        } else if (temperatura >= 15 && temperatura <= 30) {
            System.out.println("La temperatura es normal.");
        } else {
            System.out.println("Hace calor.");
        }

        scanner.close();
    }
}
