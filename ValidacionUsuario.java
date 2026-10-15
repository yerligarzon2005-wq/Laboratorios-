public class ValidacionUsuario {
    public static void main(String[] args) {
        String usuarioRegistrado = "aprendiz";
        String usuarioIngresado = "Aprendiz";

        System.out.println("Usando.equals(): " + usuarioRegistrado.equals(usuarioIngresado));
        System.out.println("Usando.equalsIgnoreCase(): " + usuarioRegistrado.equalsIgnoreCase(usuarioIngresado));
    }
}
