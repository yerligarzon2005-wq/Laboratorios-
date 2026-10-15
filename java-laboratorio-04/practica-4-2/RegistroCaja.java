import java.util.ArrayList;
import java.util.List;

public class RegistroCaja {

    public static void main(String[] args) {
        List<Movimiento> caja = new ArrayList<>();

        caja.add(new Movimiento("INGRESO", "Venta inicial", 500000));
        caja.add(new Movimiento("GASTO", "Insumos", 120000));
        caja.add(new Movimiento("INGRESO", "Venta cliente", 80000));
        caja.add(new Movimiento("GASTO", "Mantenimiento", 45000));

        System.out.println("=== MOVIMIENTOS DE CAJA ===");
        double totalIngresos = 0;
        double totalGastos = 0;

        for (int i = 0; i < caja.size(); i++) {
            Movimiento m = caja.get(i);
            System.out.println((i + 1) + ". " + m.getTipo() + " - " + m.getCategoria() + ": $" + m.getValor());

            if (m.getTipo().equals("INGRESO")) {
                totalIngresos += m.getValor();
            } else if (m.getTipo().equals("GASTO")) {
                totalGastos += m.getValor();
            }
        }

        System.out.println("\n--- RESUMEN ---");
        System.out.println("Total Ingresos: $" + totalIngresos);
        System.out.println("Total Gastos: $" + totalGastos);
        System.out.println("Total Movimientos: " + caja.size());
    }
}