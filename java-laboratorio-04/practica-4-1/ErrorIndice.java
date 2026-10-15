public class ErrorIndice {

    public static void main(String[] args) {
        int[] valores = {10, 20, 30};

        // Corrección: La última posición válida es 2 (valores.length - 1)
        System.out.println("Última posición válida (índice 2): " + valores[2]);

        // Nota: Si intentas valores[3] o i <= valores.length,
        // Java lanza ArrayIndexOutOfBoundsException porque el índice 3 no existe.
    }
}