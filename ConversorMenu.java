import java.util.Scanner;

public class ConversorMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CONVERSOR");
        System.out.println("1. Kilómetros a metros");
        System.out.println("2. Metros a centímetros");
        System.out.println("3. Celsius a Fahrenheit");
        System.out.println("0. Salir");

        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> {
                System.out.print("Ingrese la cantidad en kilómetros: ");
                double km = scanner.nextDouble();
                double metros = km * 1000;
                System.out.println(km + " km equivalen a " + metros + " metros.");
            }
            case 2 -> {
                System.out.print("Ingrese la cantidad en metros: ");
                double metros = scanner.nextDouble();
                double cm = metros * 100;
                System.out.println(metros + " m equivalen a " + cm + " centímetros.");
            }
            case 3 -> {
                System.out.print("Ingrese la temperatura en Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = (celsius * 9 / 5) + 32;
                System.out.println(celsius + " °C equivalen a " + fahrenheit + " °F.");
            }
            case 0 -> System.out.println("Saliendo del programa...");
            default -> System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}