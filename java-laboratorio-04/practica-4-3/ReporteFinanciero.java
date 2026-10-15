import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ReporteFinanciero {

    public static void main(String[] args) {
        List<Movimiento> movimientos = new ArrayList<>();

        movimientos.add(new Movimiento("INGRESO", "Salario", 1500000));
        movimientos.add(new Movimiento("INGRESO", "Freelance", 300000));
        movimientos.add(new Movimiento("GASTO", "Transporte", 30000));
        movimientos.add(new Movimiento("GASTO", "Alimentación", 45000));
        movimientos.add(new Movimiento("GASTO", "Transporte", 20000));
        movimientos.add(new Movimiento("GASTO", "Salud", 40000));

        Set<String> todasLasCategorias = new HashSet<>();
        Set<String> categoriasGastos = new HashSet<>();
        Map<String, Double> totalGastosCategoria = new HashMap<>();

        for (Movimiento m : movimientos) {
            todasLasCategorias.add(m.getCategoria());

            if (m.getTipo().equals("GASTO")) {
                categoriasGastos.add(m.getCategoria());
                double actual = totalGastosCategoria.getOrDefault(m.getCategoria(), 0.0);
                totalGastosCategoria.put(m.getCategoria(), actual + m.getValor());
            }
        }

        System.out.println("=== REPORTE FINANCIERO ===");
        System.out.println("Todas las categorías (" + todasLasCategorias.size() + "): " + todasLasCategorias);
        System.out.println("Categorías de gastos (" + categoriasGastos.size() + "): " + categoriasGastos);

        System.out.println("\n--- Importe Total de Gastos por Categoría ---");
        for (Map.Entry<String, Double> entry : totalGastosCategoria.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }
    }
}