import java.util.List;

public class PruebaBilleteras {

    public static void main(String[] args) {
        System.out.println("--- PRUEBA 1: Independencia de Billeteras ---");
        Billetera b1 = new Billetera("Laura");
        Billetera b2 = new Billetera("Carlos");

        b1.registrarIngreso(500000, "Salario");
        b1.registrarGasto(50000, "Transporte");

        b2.registrarIngreso(200000, "Freelance");

        System.out.println("Billetera 1 (" + b1.getTitular() + ") Movimientos: " + b1.getMovimientos().size());
        System.out.println("Billetera 2 (" + b2.getTitular() + ") Movimientos: " + b2.getMovimientos().size());

        System.out.println("\n--- PRUEBA 2: Copia Defensiva ---");
        List<Movimiento> copia = b1.getMovimientos();
        copia.clear(); // Intentamos borrar la lista desde afuera

        System.out.println("Tamaño de la copia tras clear(): " + copia.size());
        System.out.println("Tamaño real del historial interno: " + b1.getMovimientos().size());
    }
}