import java.util.Scanner;

public class DiasVividos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad en años: ");
        int edad = scanner.nextInt();

        int diasVividos = edad * 365;
        System.out.println("Ha vivido aproximadamente " + diasVividos + " días.");
        scanner.close();
    }
}
