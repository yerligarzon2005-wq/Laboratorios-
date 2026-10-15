public class Main {

    public static void main(String[] args) {
        System.out.println("--- BILLETERA ENCAPSULADA ---");
        Billetera laura = new Billetera("Laura");

        System.out.println("Ingreso 100000: " + laura.registrarIngreso(100000));
        System.out.println("Ingreso -5000: " + laura.registrarIngreso(-5000));
        System.out.println("Gasto 30000: " + laura.registrarGasto(30000));
        System.out.println("Gasto 90000: " + laura.registrarGasto(90000));

        System.out.println("\nTitular: " + laura.getTitular());
        System.out.println("Saldo final: $" + laura.getSaldo());
        System.out.println("Cantidad de ingresos: " + laura.getCantidadIngresos());
        System.out.println("Cantidad de gastos: " + laura.getCantidadGastos());

        System.out.println("\n--- INDEPENDENCIA DE OBJETOS ---");
        Billetera diego = new Billetera("Diego");
        diego.registrarIngreso(70000);

        System.out.println("Saldo Laura: $" + laura.getSaldo());
        System.out.println("Saldo Diego: $" + diego.getSaldo());

        System.out.println("\n--- CUENTA DE PUNTOS ---");
        CuentaPuntos puntos = new CuentaPuntos("Ana");
        puntos.sumarPuntos(80);
        System.out.println("Canjear 30: " + puntos.canjearPuntos(30));
        System.out.println("Canjear 100: " + puntos.canjearPuntos(100));
        System.out.println("Puntos finales de " + puntos.getTitular() + ": " + puntos.getPuntos());
    }
}