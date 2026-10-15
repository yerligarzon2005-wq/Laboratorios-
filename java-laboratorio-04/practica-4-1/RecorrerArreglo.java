public class RecorrerArreglo {

    public static void main(String[] args) {
        String[] categorias = {"Transporte", "Alimentación", "Salud"};

        System.out.println("--- Recorrido con for tradicional ---");
        for (int i = 0; i < categorias.length; i++) {
            System.out.println(i + " -> " + categorias[i]);
        }

        System.out.println("\n--- Recorrido con for-each ---");
        for (String categoria : categorias) {
            System.out.println(categoria);
        }
    }
}