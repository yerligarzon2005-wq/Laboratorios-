import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaTareas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tareas = new ArrayList<>();

        System.out.println("=== REGISTRO DE TAREAS ===");
        for (int i = 1; i <= 4; i++) {
            System.out.print("Ingrese la tarea " + i + ": ");
            tareas.add(scanner.nextLine());
        }

        System.out.println("\n--- Tareas Registradas ---");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println((i + 1) + ". " + tareas.get(i));
        }

        System.out.println("Total de tareas: " + tareas.size());

        System.out.print("\nBuscar tarea: ");
        String busqueda = scanner.nextLine();
        if (tareas.contains(busqueda)) {
            System.out.println("La tarea '" + busqueda + "' SÍ existe.");
            tareas.remove(busqueda);
            System.out.println("Tarea eliminada.");
        } else {
            System.out.println("La tarea '" + busqueda + "' NO existe.");
        }

        System.out.println("\nLista actualizada: " + tareas);
        scanner.close();
    }
}