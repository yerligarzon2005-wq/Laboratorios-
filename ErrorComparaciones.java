public class ErrorComparaciones {
    public static void main(String[] args) {
        int edad = 20;
        boolean activo = true;

        // Corrección: Usar == para comparar y && para operador lógico "Y"
        boolean mayorEdad = (edad == 18);
        boolean habilitado = (edad >= 18) && activo;

        System.out.println("Mayor edad exacto 18: " + mayorEdad);
        System.out.println("Habilitado: " + habilitado);
    }
}
