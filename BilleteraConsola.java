import java.util.Scanner;

public class BilleteraConsola {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre del titular: ");
        String titular = scanner.nextLine();

        double saldo = 0;
        int cantidadIngresos = 0;
        double totalIngresado = 0;
        int cantidadGastos = 0;
        double totalGastado = 0;

        int opcion;

        do {
            mostrarMenu();

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    double saldoAnterior = saldo;
                    saldo = registrarIngreso(scanner, saldo);
                    if (saldo > saldoAnterior) {
                        double ingreso = saldo - saldoAnterior;
                        totalIngresado += ingreso;
                        cantidadIngresos++;
                    }
                }
                case 2 -> {
                    double saldoAnterior = saldo;
                    saldo = registrarGasto(scanner, saldo);
                    if (saldo < saldoAnterior) {
                        double gasto = saldoAnterior - saldo;
                        totalGastado += gasto;
                        cantidadGastos++;
                    }
                }
                case 3 -> mostrarSaldo(saldo);
                case 4 -> mostrarResumen(titular, saldo, cantidadIngresos, totalIngresado, cantidadGastos, totalGastado);
                case 0 -> System.out.println("Programa finalizado.");
                default -> System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("=========================");
        System.out.println("       MI BILLETERA");
        System.out.println("=========================");
        System.out.println("1. Registrar ingreso");
        System.out.println("2. Registrar gasto");
        System.out.println("3. Consultar saldo");
        System.out.println("4. Mostrar resumen");
        System.out.println("0. Salir");
    }

    static double registrarIngreso(Scanner scanner, double saldoActual) {
        System.out.print("Valor del ingreso: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("Ingreso registrado exitosamente.");
            return saldoActual + valor;
        } else {
            System.out.println("Error: El ingreso debe ser mayor a cero.");
            return saldoActual;
        }
    }

    static double registrarGasto(Scanner scanner, double saldoActual) {
        System.out.print("Valor del gasto: ");
        double valor = scanner.nextDouble();

        if (valor <= 0) {
            System.out.println("Error: El gasto debe ser mayor a cero.");
            return saldoActual;
        } else if (valor > saldoActual) {
            System.out.println("Error: Saldo insuficiente.");
            return saldoActual;
        } else {
            System.out.println("Gasto registrado exitosamente.");
            return saldoActual - valor;
        }
    }

    static void mostrarSaldo(double saldo) {
        System.out.println("Saldo actual: $" + saldo);
    }

    static void mostrarResumen(String titular, double saldo, int cantIngresos, double totalIngresado, int cantGastos, double totalGastado) {
        System.out.println("\n=========================");
        System.out.println("   RESUMEN DE BILLETERA");
        System.out.println("=========================");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("Cantidad de ingresos: " + cantIngresos);
        System.out.println("Total ingresado: $" + totalIngresado);
        System.out.println("Cantidad de gastos: " + cantGastos);
        System.out.println("Total gastado: $" + totalGastado);
    }
}