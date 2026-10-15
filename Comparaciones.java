public class Comparaciones {

    public static void main(String[] args) {
        // Código del Paso 1
        int edad = 20;

        System.out.println(edad > 18);
        System.out.println(edad < 18);
        System.out.println(edad >= 20);
        System.out.println(edad == 20);
        System.out.println(edad != 20);

        System.out.println("--- Paso 2 ---");

        // Código del Paso 2
        double saldo = 120000;
        double compra = 150000;

        boolean puedeComprar = saldo >= compra;

        System.out.println(puedeComprar);
    }
}