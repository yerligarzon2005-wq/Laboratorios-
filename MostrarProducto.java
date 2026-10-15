public class MostrarProducto {

    public static void main(String[] args) {
        mostrarProducto("Teclado Mecánico", 150000.0);
        mostrarProducto("Mouse Inalámbrico", 85000.0);
        mostrarProducto("Monitor 24 pulg", 620000.0);
    }

    static void mostrarProducto(String nombre, double precio) {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}