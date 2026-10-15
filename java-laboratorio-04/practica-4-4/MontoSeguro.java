import java.util.Scanner;

public class MontoSeguro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double monto = 0;
        boolean valido = false;

        do {
            System.out.print("Ingrese un monto numérico positivo: ");
            String entrada = scanner.nextLine();

            try {
                monto = Double.parseDouble(entrada);

                if (!Double.isFinite(monto) || monto <= 0) {
                    System.out.println("Debes escribir un monto positivo y finito (no NaN ni Infinity).");
                } else {
                    System.out.println("Monto aceptado correctamente: $" + monto);
                    valido = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Debes escribir un valor numérico válido.");
            }

        } while (!valido);

        scanner.close();
    }
}