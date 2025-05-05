import java.util.Scanner;

public class NombreLargo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        if (nombre.length() > 8) {
            System.out.println("Su nombre es largo.");
        } else {
            System.out.println("Su nombre no es largo.");
        }
        
        scanner.close();
    }
}
