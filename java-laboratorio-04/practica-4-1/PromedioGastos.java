public class PromedioGastos {

    public static void main(String[] args) {
        double[] gastos = {30000, 45000, 20000, 10000};

        double suma = 0;
        int mayores25k = 0;

        // Recorrido acumulador con for-each
        for (double gasto : gastos) {
            suma += gasto;
            if (gasto > 25000) {
                mayores25k++;
            }
        }

        double promedio = suma / gastos.length;

        System.out.println("Total: " + suma);
        System.out.println("Cantidad: " + gastos.length);
        System.out.println("Promedio: " + promedio);
        System.out.println("Mayores que 25000: " + mayores25k);
    }
}