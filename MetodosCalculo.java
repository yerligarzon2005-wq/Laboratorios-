public class MetodosCalculo {

    public static void main(String[] args) {
        double total = calcularTotal(85000, 3);
        System.out.println("Total: $" + total);

        double subtotal = 200000;
        double descuento = calcularDescuento(subtotal, 0.10);
        System.out.println("Descuento (10%): $" + descuento);
    }

    static double calcularTotal(double precio, int cantidad) {
        return precio * cantidad;
    }

    static double calcularDescuento(double subtotal, double porcentaje) {
        return subtotal * porcentaje;
    }
}