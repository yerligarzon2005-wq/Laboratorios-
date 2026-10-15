import java.util.ArrayList;
import java.util.List;

public class HistorialSimple {

    public static void main(String[] args) {
        List<Movimiento> movimientos = new ArrayList<>();

        movimientos.add(new Movimiento("INGRESO", "Salario", 1500000));
        movimientos.add(new Movimiento("GASTO", "Transporte", 30000));
        movimientos.add(new Movimiento("GASTO", "Alimentación", 45000));

        System.out.println("--- HISTORIAL DE MOVIMIENTOS ---");
        for (Movimiento movimiento : movimientos) {
            System.out.println(
                movimiento.getTipo() + " | "
                + movimiento.getCategoria() + " | $"
                + movimiento.getValor()
            );
        }

        System.out.println("Cantidad de movimientos: " + movimientos.size());

        // Ejercicio: Total de gastos
        double totalGastos = 0;
        for (Movimiento m : movimientos) {
            if (m.getTipo().equals("GASTO")) {
                totalGastos += m.getValor();
            }
        }
        System.out.println("Total de gastos: $" + totalGastos);

        // Ejercicio: Copia del historial
        List<Movimiento> copia = new ArrayList<>(movimientos);
        copia.remove(0);

        System.out.println("\n--- Prueba de Copia ---");
        System.out.println("Cantidad en lista original: " + movimientos.size());
        System.out.println("Cantidad en copia modificada: " + copia.size());
    }
}