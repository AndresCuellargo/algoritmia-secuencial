import java.util.Scanner;

public class TemperaturaAlta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Celsius: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 30) {
            System.out.println("La temperatura es alta.");
        } else {
            System.out.println("La temperatura no es alta.");
        }
        
        scanner.close();
    }
}
