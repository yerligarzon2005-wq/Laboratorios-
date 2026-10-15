import java.util.Scanner;

public class AcumuladorInteractivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int acumulado = 0;
        int valor;

        do {
            System.out.print("Valor: ");
            valor = scanner.nextInt();

            if (valor != 0) {
                acumulado += valor;
                System.out.println("Acumulado: " + acumulado + "\n");
            }
        } while (valor != 0);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}