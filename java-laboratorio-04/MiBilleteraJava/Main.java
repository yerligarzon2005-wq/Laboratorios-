import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Billetera billetera = new Billetera("Laura");
        int opcion = -1;

        do {
            System.out.println("\n==================================");
            System.out.println("       MI BILLETERA JAVA 2.0");
            System.out.println("==================================");
            System.out.println("Titular: " + billetera.getTitular());
            System.out.println("Saldo disponible: $" + billetera.getSaldo());
            System.out.println("1. Registrar ingreso");
            System.out.println("2. Registrar gasto");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Mostrar movimientos");
            System.out.println("5. Consultar movimientos por tipo");
            System.out.println("6. Consultar categorías utilizadas");
            System.out.println("7. Resumen financiero");
            System.out.println("0. Salir");
            System.out.print("Opción: ");

            String entradaOpcion = scanner.nextLine();

            try {
                opcion = Integer.parseInt(entradaOpcion.trim());

                switch (opcion) {
                    case 1 -> {
                        System.out.print("Categoría: ");
                        String cat = scanner.nextLine();
                        System.out.print("Valor: ");
                        double val = Double.parseDouble(scanner.nextLine().trim());
                        if (billetera.registrarIngreso(val, cat)) {
                            System.out.println("-> Ingreso registrado exitosamente.");
                        } else {
                            System.out.println("-> Error: Datos de ingreso inválidos.");
                        }
                    }
                    case 2 -> {
                        System.out.print("Categoría: ");
                        String cat = scanner.nextLine();
                        System.out.print("Valor: ");
                        double val = Double.parseDouble(scanner.nextLine().trim());
                        if (billetera.registrarGasto(val, cat)) {
                            System.out.println("-> Gasto registrado exitosamente.");
                        } else {
                            System.out.println("-> Error: Gasto inválido o saldo insuficiente.");
                        }
                    }
                    case 3 -> System.out.println("-> Saldo actual: $" + billetera.getSaldo());
                    case 4 -> {
                        List<Movimiento> historial = billetera.getMovimientos();
                        System.out.println("\n==================================");
                        System.out.println("           HISTORIAL");
                        System.out.println("==================================");
                        if (historial.isEmpty()) {
                            System.out.println("El historial está vacío.");
                        } else {
                            for (int i = 0; i < historial.size(); i++) {
                                Movimiento m = historial.get(i);
                                System.out.println((i + 1) + ". " + m.getTipo() + " | " + m.getCategoria() + " | $" + m.getValor());
                            }
                        }
                    }
                    case 5 -> {
                        System.out.print("Tipo a buscar (INGRESO/GASTO): ");
                        String tipo = scanner.nextLine().trim();
                        List<Movimiento> filtrados = billetera.buscarPorTipo(tipo);
                        System.out.println("\n--- Movimientos tipo " + tipo.toUpperCase() + " ---");
                        if (filtrados.isEmpty()) {
                            System.out.println("No se encontraron registros.");
                        } else {
                            for (Movimiento m : filtrados) {
                                System.out.println(m.getTipo() + " | " + m.getCategoria() + " | $" + m.getValor());
                            }
                        }
                    }
                    case 6 -> {
                        Set<String> categorias = billetera.obtenerCategorias();
                        System.out.println("\n--- Categorías Utilizadas ---");
                        if (categorias.isEmpty()) {
                            System.out.println("No hay categorías registradas.");
                        } else {
                            for (String c : categorias) {
                                System.out.println("- " + c);
                            }
                        }
                    }
                    case 7 -> {
                        System.out.println("\n==================================");
                        System.out.println("       RESUMEN FINANCIERO");
                        System.out.println("==================================");
                        System.out.println("Titular: " + billetera.getTitular());
                        System.out.println("Saldo: $" + billetera.getSaldo());
                        System.out.println("Ingresos realizados: " + billetera.getContadorIngresos());
                        System.out.println("Total ingresado: $" + billetera.getTotalIngresos());
                        System.out.println("Gastos realizados: " + billetera.getContadorGastos());
                        System.out.println("Total gastado: $" + billetera.getTotalGastos());
                        System.out.println("\nGastos por categoría:");
                        Map<String, Double> reporteGastos = billetera.gastosPorCategoria();
                        if (reporteGastos.isEmpty()) {
                            System.out.println("Sin gastos registrados.");
                        } else {
                            for (Map.Entry<String, Double> entry : reporteGastos.entrySet()) {
                                System.out.println(entry.getKey() + ": $" + entry.getValue());
                            }
                        }
                    }
                    case 0 -> System.out.println("Saliendo de Mi Billetera Java...");
                    default -> System.out.println("Opción desconocida. Intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número numérico válido.");
            }

        } while (opcion != 0);

        scanner.close();
    }
}