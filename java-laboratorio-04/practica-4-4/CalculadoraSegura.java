import java.util.Scanner;

public class CalculadoraSegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;

        do {
            System.out.println("\n=== CALCULADORA SEGURA ===");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());

                if (opcion >= 1 && opcion <= 4) {
                    System.out.print("Ingrese el primer número: ");
                    double num1 = Double.parseDouble(scanner.nextLine());

                    System.out.print("Ingrese el segundo número: ");
                    double num2 = Double.parseDouble(scanner.nextLine());

                    switch (opcion) {
                        case 1 -> System.out.println("Resultado: " + (num1 + num2));
                        case 2 -> System.out.println("Resultado: " + (num1 - num2));
                        case 3 -> System.out.println("Resultado: " + (num1 * num2));
                        case 4 -> {
                            if (num2 == 0) {
                                System.out.println("Error: No se puede dividir entre cero.");
                            } else {
                                System.out.println("Resultado: " + (num1 / num2));
                            }
                        }
                    }
                } else if (opcion != 0) {
                    System.out.println("Opción no existe.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Error: Debe ingresar únicamente valores numéricos.");
            }

        } while (opcion != 0);

        System.out.println("Calculadora finalizada.");
        scanner.close();
    }
}