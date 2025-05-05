import java.util.Scanner;

public class NotaAcademica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la nota: ");
        int nota = scanner.nextInt();

        if (nota < 10) {
            System.out.println("Desaprobado.");
        } else if (nota >= 10 && nota <= 13) {
            System.out.println("Regular.");
        } else if (nota >= 14 && nota <= 17) {
            System.out.println("Bueno.");
        } else if (nota >= 18 && nota <= 20) {
            System.out.println("Excelente.");
        } else {
            System.out.println("Nota fuera de rango.");
        }

        scanner.close();
    }
}
