public class Saludos {

    public static void main(String[] args) {
        saludar("Laura");
        saludar("Andrés");
    }

    static void saludar(String nombre) {
        System.out.println("Hola, " + nombre);
    }
}