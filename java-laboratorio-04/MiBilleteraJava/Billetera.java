import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Billetera {

    private final String titular;
    private double saldo;
    private int contadorIngresos;
    private double totalIngresos;
    private int contadorGastos;
    private double totalGastos;
    private final List<Movimiento> movimientos;

    public Billetera(String titular) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("El titular es obligatorio.");
        }
        this.titular = titular.trim();
        this.saldo = 0.0;
        this.contadorIngresos = 0;
        this.totalIngresos = 0.0;
        this.contadorGastos = 0;
        this.totalGastos = 0.0;
        this.movimientos = new ArrayList<>();
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getContadorIngresos() {
        return contadorIngresos;
    }

    public double getTotalIngresos() {
        return totalIngresos;
    }

    public int getContadorGastos() {
        return contadorGastos;
    }

    public double getTotalGastos() {
        return totalGastos;
    }

    public boolean registrarIngreso(double valor, String categoria) {
        if (!Double.isFinite(valor) || valor <= 0) {
            return false;
        }
        if (categoria == null || categoria.isBlank()) {
            return false;
        }

        Movimiento movimiento = new Movimiento("INGRESO", categoria, valor);
        this.saldo += valor;
        this.totalIngresos += valor;
        this.contadorIngresos++;
        this.movimientos.add(movimiento);
        return true;
    }

    public boolean registrarGasto(double valor, String categoria) {
        if (!Double.isFinite(valor) || valor <= 0) {
            return false;
        }
        if (categoria == null || categoria.isBlank()) {
            return false;
        }
        if (valor > this.saldo) {
            return false;
        }

        Movimiento movimiento = new Movimiento("GASTO", categoria, valor);
        this.saldo -= valor;
        this.totalGastos += valor;
        this.contadorGastos++;
        this.movimientos.add(movimiento);
        return true;
    }

    // Copia defensiva del historial
    public List<Movimiento> getMovimientos() {
        return new ArrayList<>(this.movimientos);
    }

    // Buscar por tipo
    public List<Movimiento> buscarPorTipo(String tipo) {
        List<Movimiento> encontrados = new ArrayList<>();
        for (Movimiento m : this.movimientos) {
            if (m.getTipo().equalsIgnoreCase(tipo)) {
                encontrados.add(m);
            }
        }
        return encontrados;
    }

    // Categorías utilizadas sin duplicados
    public Set<String> obtenerCategorias() {
        Set<String> categorias = new HashSet<>();
        for (Movimiento m : this.movimientos) {
            categorias.add(m.getCategoria());
        }
        return categorias;
    }

    // Gastos agrupados por categoría
    public Map<String, Double> gastosPorCategoria() {
        Map<String, Double> reporte = new HashMap<>();
        for (Movimiento m : this.movimientos) {
            if (m.getTipo().equals("GASTO")) {
                double acumulado = reporte.getOrDefault(m.getCategoria(), 0.0);
                reporte.put(m.getCategoria(), acumulado + m.getValor());
            }
        }
        return reporte;
    }
}