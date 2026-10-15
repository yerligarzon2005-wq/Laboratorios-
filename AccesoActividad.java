public class AccesoActividad {
    public static void main(String[] args) {
        int edad = 20;
        boolean inscripcionActiva = true;
        boolean documentoPresentado = true;

        boolean esMayorEdad = edad >= 18;
        boolean cumpleInscripcionYDocumento = inscripcionActiva && documentoPresentado;
        boolean cumpleTodosRequisitos = esMayorEdad && inscripcionActiva && documentoPresentado;

        System.out.println("¿Es mayor de edad?: " + esMayorEdad);
        System.out.println("¿Inscripción y documento válidos?: " + cumpleInscripcionYDocumento);
        System.out.println("¿Cumple todos los requisitos?: " + cumpleTodosRequisitos);
    }
}
