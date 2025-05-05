import java.util.Scanner;

public class DesgloseBilletes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cantidad en dinero: ");
        int monto = scanner.nextInt();

        int[] billetes = {100, 50, 20, 10, 5, 1};
        for (int billete : billetes) {
            System.out.println("Billetes de " + billete + ": " + monto / billete);
            monto %= billete;
        }

        scanner.close();
    }
}
