import java.util.Scanner;

public class MayorEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona no es mayor de edad.");
        }
        
        scanner.close();
    }
}
