import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = scanner.nextDouble();

        if (totalCompra > 100) {
            totalCompra *= 0.9; // Aplicar descuento del 10%
            System.out.println("Se ha aplicado un descuento del 10%. Total final: $" + totalCompra);
        } else {
            System.out.println("No se aplica descuento. Total a pagar: $" + totalCompra);
        }

        scanner.close();
    }
}
