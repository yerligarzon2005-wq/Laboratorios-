/** Java passes every argument by value, including reference values. */
public class MemoryDemo {
    static final class Pet {
        String name;

        Pet(String name) {
            this.name = name;
        }
    }

    static void change(Pet local) {
        local.name = "Sol"; // Mismo objeto, cambio visible en el llamador
        local = new Pet("Otra"); // Solo cambia la referencia del parámetro local
        System.out.println("Dentro: " + local.name);
    }

    public static void main(String[] args) {
        Pet original = new Pet("Luna");
        change(original);
        System.out.println("Fuera: " + original.name);
        if (!original.name.equals("Sol")) throw new AssertionError("Paso por valor");
    }
}