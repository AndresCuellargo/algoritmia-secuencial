import java.util.Scanner;

public class SalarioAlto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su salario mensual: ");
        double salario = scanner.nextDouble();

        if (salario > 3000) {
            System.out.println("Su salario es alto.");
        } else {
            System.out.println("Su salario no es alto.");
        }
        
        scanner.close();
    }
}
