public class Main {

    public static void main(String[] args) {
        System.out.println("--- PRODUCTOS ---");
        Producto primero = new Producto("Teclado", 85000, 3);
        Producto segundo = new Producto("Mouse", 45000, 7);

        primero.mostrarDetalle();
        System.out.println("Subtotal: $" + primero.calcularSubtotal());

        System.out.println();
        segundo.mostrarDetalle();
        System.out.println("Subtotal: $" + segundo.calcularSubtotal());

        System.out.println("\n--- CONTADOR ---");
        Contador visitas = new Contador();
        visitas.aumentar();
        visitas.aumentar();
        visitas.mostrar();

        System.out.println("\n--- TERMÓMETRO ---");
        Termometro t1 = new Termometro(0);
        Termometro t2 = new Termometro(25);

        System.out.println("0 °C -> " + t1.convertirAFahrenheit() + " °F");
        System.out.println("25 °C -> " + t2.convertirAFahrenheit() + " °F");

        System.out.println("\n--- ESTUDIANTES ---");
        Estudiante e1 = new Estudiante("Carlos", "2834921", 2, 2.8);
        Estudiante e2 = new Estudiante("Ana", "2834921", 2, 4.1);

        e1.mostrarPerfil();
        System.out.println("¿Aprobó?: " + e1.aprobo());

        System.out.println();
        e2.mostrarPerfil();
        System.out.println("¿Aprobó?: " + e2.aprobo());
    }
}