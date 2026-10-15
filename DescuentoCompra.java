import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        double porcentaje = 0.0;

        if (valorCompra >= 500000) {
            porcentaje = 0.15;
        } else if (valorCompra >= 250000) {
            porcentaje = 0.10;
        } else if (valorCompra >= 100000) {
            porcentaje = 0.05;
        } else {
            porcentaje = 0.0;
        }

        double descuento = valorCompra * porcentaje;
        double totalFinal = valorCompra - descuento;

        System.out.println("\n--- RESUMEN ---");
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor original: $" + valorCompra);
        System.out.println("Porcentaje aplicado: " + (int)(porcentaje * 100) + "%");
        System.out.println("Valor descuento: $" + descuento);
        System.out.println("Total final: $" + totalFinal);

        scanner.close();
    }
}
