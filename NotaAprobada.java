import java.util.Scanner;

public class NotaAprobada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 10) {
            System.out.println("La nota es aprobada.");
        } else {
            System.out.println("La nota no es aprobada.");
        }
        
        scanner.close();
    }
}
