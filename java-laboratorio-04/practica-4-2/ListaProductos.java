import java.util.ArrayList;
import java.util.List;

public class ListaProductos {

    public static void main(String[] args) {
        List<String> productos = new ArrayList<>();

        productos.add("Teclado");
        productos.add("Mouse");
        productos.add("Monitor");

        System.out.println(productos);
        System.out.println("Cantidad: " + productos.size());

        // Operaciones fundamentales
        productos.set(1, "Mouse inalámbrico");

        System.out.println("Primero: " + productos.get(0));
        System.out.println("¿Hay monitor? " + productos.contains("Monitor"));

        productos.remove("Monitor");

        System.out.println("Después: " + productos);
    }
}