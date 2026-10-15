import java.util.Scanner;

public class PromedioNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de notas: ");
        int cantidad = scanner.nextInt();

        double suma = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Nota " + i + ": ");
            double nota = scanner.nextDouble();
            suma += nota;
        }

        double promedio = suma / cantidad;
        System.out.println("Promedio: " + promedio);

        scanner.close();
    }
}