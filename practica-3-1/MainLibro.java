public class MainLibro {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.paginas = 417;

        Libro libro2 = new Libro();
        libro2.titulo = "El principito";
        libro2.autor = "Antoine de Saint-Exupéry";
        libro2.paginas = 96;

        libro1.mostrarFicha();
        libro2.mostrarFicha();
    }
}