import java.util.HashMap;
import java.util.Map;

public class PrimerMapa {

    public static void main(String[] args) {
        Map<String, Double> gastos = new HashMap<>();

        gastos.put("Transporte", 30000.0);
        gastos.put("Alimentación", 45000.0);

        System.out.println("Gasto en Transporte: $" + gastos.get("Transporte"));
        System.out.println("¿Tiene clave 'Salud'?: " + gastos.containsKey("Salud"));

        // Reemplazar valor en 'Transporte'
        gastos.put("Transporte", 50000.0);

        System.out.println("Nuevo gasto en Transporte: $" + gastos.get("Transporte"));
        System.out.println("Cantidad de categorías registradas: " + gastos.size());
    }
}
