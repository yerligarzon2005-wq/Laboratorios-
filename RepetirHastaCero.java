import java.util.Scanner;

public class RepetirHastaCero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número (0 para terminar): ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            System.out.println("Número ingresado: " + numero);
            System.out.print("Ingrese otro número (0 para terminar): ");
            numero = scanner.nextInt();
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}