public class Contador {

    int valor;

    public Contador() {
        this.valor = 0;
    }

    void aumentar() {
        valor++;
    }

    void mostrar() {
        System.out.println("Valor: " + valor);
    }
}