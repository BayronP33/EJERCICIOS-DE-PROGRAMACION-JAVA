public class Main {
    public static void main(String[] args) {
        int suma = 0;

        // Sumar los cuadrados de los primeros 100 números naturales
        for (int i = 1; i <= 100; i++) {
            suma += i * i; // Sumar el cuadrado de i a la suma
        }

        // Imprimir el resultado
        System.out.println("La suma de los cuadrados de los 100 primeros números naturales es: " + suma);
    }
}