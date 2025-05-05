import java.util.Scanner;

public class AccesoSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioPredefinido = "admin";
        String contraseñaPredefinida = "1234";

        System.out.print("Ingrese el usuario: ");
        String usuario = scanner.next();
        System.out.print("Ingrese la contraseña: ");
        String contraseña = scanner.next();

        if (usuario.equals(usuarioPredefinido) && contraseña.equals(contraseñaPredefinida)) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        scanner.close();
    }
}
