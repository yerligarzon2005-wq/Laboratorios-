public class PruebaProducto {

    public static void main(String[] args) {
        try {
            System.out.println("Intentando crear producto inválido...");
            ProductoValidado producto = new ProductoValidado("Teclado", -500);
            System.out.println(producto.getNombre());
        } catch (IllegalArgumentException e) {
            System.out.println("No se pudo crear el producto: " + e.getMessage());
        }

        try {
            System.out.println("\nIntentando crear producto válido...");
            ProductoValidado p2 = new ProductoValidado("Mouse", 45000);
            System.out.println("Creado con éxito: " + p2.getNombre() + " - $" + p2.getPrecio());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}