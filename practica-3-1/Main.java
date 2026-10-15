public class Main {

    public static void main(String[] args) {
        // Objeto 1
        Producto producto = new Producto();
        producto.nombre = "Teclado";
        producto.precio = 85000;
        producto.cantidad = 3;

        // Objeto 2
        Producto segundo = new Producto();
        segundo.nombre = "Mouse";
        segundo.precio = 45000;
        segundo.cantidad = 7;

        // Objeto 3 (Reto del catálogo)
        Producto tercero = new Producto();
        tercero.nombre = "Monitor";
        tercero.precio = 650000;
        tercero.cantidad = 2;

        System.out.println("--- PRODUCTO 1 ---");
        producto.mostrarDetalle();
        System.out.println("Subtotal: $" + producto.calcularSubtotal());

        System.out.println("\n--- PRODUCTO 2 ---");
        segundo.mostrarDetalle();
        System.out.println("Subtotal: $" + segundo.calcularSubtotal());

        System.out.println("\n--- PRODUCTO 3 ---");
        tercero.mostrarDetalle();
        System.out.println("Subtotal: $" + tercero.calcularSubtotal());

        double totalGeneral = producto.calcularSubtotal() + segundo.calcularSubtotal() + tercero.calcularSubtotal();
        System.out.println("\n==================================");
        System.out.println("VALOR TOTAL DEL CATÁLOGO: $" + totalGeneral);
    }
}