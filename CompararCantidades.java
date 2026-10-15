public class CompararCantidades {
    public static void main(String[] args) {
        int inventario = 12;
        int cantidadSolicitada = 8;

        boolean haySuficiente = inventario >= cantidadSolicitada;
        boolean esIgual = cantidadSolicitada == inventario;
        boolean superaInventario = cantidadSolicitada > inventario;

        System.out.println("¿Hay inventario suficiente?: " + haySuficiente);
        System.out.println("¿Es exactamente igual?: " + esIgual);
        System.out.println("¿Supera el inventario?: " + superaInventario);
    }
}
