import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CUENTA DE PUNTOS ---");
        System.out.print("Titular: ");
        String nombre = scanner.nextLine();

        CuentaPuntos cuenta = new CuentaPuntos(nombre);
        System.out.println("Puntos iniciales: " + cuenta.getPuntos());

        System.out.print("Primera cantidad de puntos a registrar: ");
        int cant1 = scanner.nextInt();
        if (cuenta.sumarPuntos(cant1)) {
            System.out.println("Operación 1 registrada.");
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }

        System.out.print("Segunda cantidad de puntos a registrar: ");
        int cant2 = scanner.nextInt();
        if (cuenta.sumarPuntos(cant2)) {
            System.out.println("Operación 2 registrada.");
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Puntos finales: " + cuenta.getPuntos());

        System.out.println("\n--- PRUEBA CALCULADORA ---");
        System.out.print("Ingrese número 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese número 2: ");
        double num2 = scanner.nextDouble();

        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.sumar(num1, num2));
        System.out.println("Resta: " + calc.restar(num1, num2));
        System.out.println("Multiplicación: " + calc.multiplicar(num1, num2));

        scanner.close();
    }
}