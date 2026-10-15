import java.util.Scanner;

public class MenuSeguro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n--- MENÚ SEGURO ---");
            System.out.println("1. Consultar");
            System.out.println("2. Registrar");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            String entrada = scanner.nextLine();

            try {
                opcion = Integer.parseInt(entrada);

                switch (opcion) {
                    case 1 -> System.out.println("-> Ejecutando consulta...");
                    case 2 -> System.out.println("-> Ejecutando registro...");
                    case 0 -> System.out.println("-> Saliendo del programa...");
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: La opción debe ser un número entero.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}