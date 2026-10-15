import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("    INICIO DE SESIÓN BILLETERA");
        System.out.println("================================");
        System.out.print("Nombre del titular: ");
        String titular = scanner.nextLine().trim();

        while (titular.isEmpty()) {
            System.out.print("El nombre es obligatorio. Intenta nuevamente: ");
            titular = scanner.nextLine().trim();
        }

        Billetera billetera = new Billetera(titular);
        int opcion;

        do {
            mostrarMenu(billetera);
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese valor a ingresar: ");
                    double ingreso = scanner.nextDouble();
                    if (billetera.registrarIngreso(ingreso)) {
                        System.out.println(">>> Ingreso registrado con éxito.");
                    } else {
                        System.out.println(">>> Error: El valor ingresado debe ser mayor a cero.");
                    }
                }
                case 2 -> {
                    System.out.print("Ingrese valor a gastar: ");
                    double gasto = scanner.nextDouble();
                    if (billetera.registrarGasto(gasto)) {
                        System.out.println(">>> Gasto registrado con éxito.");
                    } else {
                        System.out.println(">>> Error: Valor inválido o saldo insuficiente.");
                    }
                }
                case 3 -> {
                    System.out.println(">>> Saldo actual: $" + billetera.getSaldo());
                }
                case 4 -> mostrarResumen(billetera);
                case 0 -> System.out.println("Programa finalizado. ¡Hasta luego!");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    static void mostrarMenu(Billetera billetera) {
        System.out.println();
        System.out.println("================================");
        System.out.println("        MI BILLETERA JAVA");
        System.out.println("================================");
        System.out.println("Titular: " + billetera.getTitular());
        System.out.println("Saldo disponible: $" + billetera.getSaldo());
        System.out.println();
        System.out.println("1. Registrar ingreso");
        System.out.println("2. Registrar gasto");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Mostrar resumen");
        System.out.println("0. Salir");
    }

    static void mostrarResumen(Billetera billetera) {
        System.out.println();
        System.out.println("================================");
        System.out.println("      RESUMEN DE BILLETERA");
        System.out.println("================================");
        System.out.println("Titular: " + billetera.getTitular());
        System.out.println("Saldo actual: $" + billetera.getSaldo());
        System.out.println("Ingresos realizados: " + billetera.getCantidadIngresos());
        System.out.println("Total ingresado: $" + billetera.getTotalIngresos());
        System.out.println("Gastos realizados: " + billetera.getCantidadGastos());
        System.out.println("Total gastado: $" + billetera.getTotalGastos());
        System.out.println("Balance total de operaciones: $" + billetera.getBalanceOperaciones());
    }
}
