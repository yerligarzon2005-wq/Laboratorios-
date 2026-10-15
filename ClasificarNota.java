public class ClasificarNota {
    public static void main(String[] args) {
        double nota = 4.2;

        if (nota >= 4.5) {
            System.out.println("Desempeño sobresaliente");
        } else if (nota >= 4.0) {
            System.out.println("Desempeño alto");
        } else if (nota >= 3.0) {
            System.out.println("Desempeño aprobatorio");
        } else {
            System.out.println("No aprobado");
        }
    }
}
