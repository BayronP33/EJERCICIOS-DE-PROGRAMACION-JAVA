public class Main {
    public static void main(String[] args) {
        long resultado = 1; // Usamos 'long' para evitar desbordamientos debido al tamaño del resultado.

        // Multiplicar los 20 primeros números naturales
        for (int i = 1; i <= 20; i++) {
            resultado *= i; // Multiplicamos el resultado por el número actual.
        }

        // Imprimir el resultado
        System.out.println("La multiplicación de los 20 primeros números naturales es: " + resultado);
    }
}
