import java.util.Scanner;

public class CalculadoraMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese número 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese número 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> System.out.println("Resultado: " + (num1 + num2));
            case 2 -> System.out.println("Resultado: " + (num1 - num2));
            case 3 -> System.out.println("Resultado: " + (num1 * num2));
            case 4 -> {
                if (num2 != 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error: No se puede dividir entre cero.");
                }
            }
            default -> System.out.println("Opción inválida.");
        }
        scanner.close();
    }
}
