import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();
        System.out.print("Ingrese la tarifa por hora: ");
        double tarifaHora = scanner.nextDouble();

        double salario = (horasTrabajadas > 40) 
                         ? (40 * tarifaHora) + ((horasTrabajadas - 40) * tarifaHora * 1.5) 
                         : (horasTrabajadas * tarifaHora);
                         
        System.out.println("El salario total es: " + salario);
        scanner.close();
    }
}
