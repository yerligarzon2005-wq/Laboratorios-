import java.util.HashSet;
import java.util.Set;

public class CategoriasUnicas {

    public static void main(String[] args) {
        Set<String> categorias = new HashSet<>();

        categorias.add("Transporte");
        categorias.add("Alimentación");
        categorias.add("Transporte"); // Duplicado, HashSet lo ignora
        categorias.add("Salud");

        System.out.println("Cantidad de categorías únicas: " + categorias.size());
        System.out.println("¿Existe 'Transporte'?: " + categorias.contains("Transporte"));

        System.out.println("\n--- Lista de categorías ---");
        for (String categoria : categorias) {
            System.out.println(categoria);
        }
    }
}