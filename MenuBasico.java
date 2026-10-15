import java.util.Scanner;

public class MenuBasico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Consultar");
        System.out.println("2. Registrar");
        System.out.println("3. Eliminar");

        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Seleccionó consultar.");
            case 2 -> System.out.println("Seleccionó registrar.");
            case 3 -> System.out.println("Seleccionó eliminar.");
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
