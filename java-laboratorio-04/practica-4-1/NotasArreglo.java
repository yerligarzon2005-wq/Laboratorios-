import java.util.Scanner;

public class NotasArreglo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];

        System.out.println("=== REGISTRO DE NOTAS ===");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double suma = 0;
        double notaMayor = notas[0];
        double notaMenor = notas[0];
        int aprobadas = 0;

        System.out.println("\n--- Resumen de Notas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posición [" + i + "]: " + notas[i]);
            suma += notas[i];

            if (notas[i] > notaMayor) notaMayor = notas[i];
            if (notas[i] < notaMenor) notaMenor = notas[i];
            if (notas[i] >= 3.0) aprobadas++;
        }

        double promedio = suma / notas.length;

        System.out.println("\nPromedio: " + promedio);
        System.out.println("Nota mayor: " + notaMayor);
        System.out.println("Nota menor: " + notaMenor);
        System.out.println("Aprobadas (>= 3.0): " + aprobadas);

        scanner.close();
    }
}