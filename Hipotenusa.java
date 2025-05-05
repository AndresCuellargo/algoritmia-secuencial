import java.util.Scanner;

public class Hipotenusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer cateto: ");
        double cateto1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo cateto: ");
        double cateto2 = scanner.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("La hipotenusa es: " + hipotenusa);
        scanner.close();
    }
}
