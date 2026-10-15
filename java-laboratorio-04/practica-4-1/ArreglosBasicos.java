public class ArreglosBasicos {

    public static void main(String[] args) {
        String[] productos = {"Teclado", "Mouse", "Monitor"};

        System.out.println(productos[0]);
        System.out.println(productos[1]);
        System.out.println(productos[2]);
        System.out.println("Cantidad: " + productos.length);

        // Modificamos el segundo producto (Paso 3)
        productos[1] = "Mouse inalámbrico";
        System.out.println("\nDespués de modificar el índice 1:");
        System.out.println(productos[1]);

        // Arreglo con tamaño definido (Paso 4)
        System.out.println("\nArreglo con tamaño definido:");
        int[] cantidades = new int[4];
        cantidades[0] = 5;
        cantidades[1] = 8;
        cantidades[2] = 2;
        cantidades[3] = 10;

        System.out.println("Elemento en índice 2: " + cantidades[2]);
        System.out.println("Longitud del arreglo: " + cantidades.length);
    }
}