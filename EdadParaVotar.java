import java.util.Scanner;

public class EdadParaVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Puede votar.");
        } else {
            System.out.println("No puede votar.");
        }
        
        scanner.close();
    }
}
