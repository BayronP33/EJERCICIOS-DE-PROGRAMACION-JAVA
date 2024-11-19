import java.util.Scanner; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola. 

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        System.out.println("CALCULADORA DE FACTORIAL Y FUNCION ACKERMAN"); 

        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario

        // Solicitar y leer valores del usuario
        System.out.println("Ingrese el valor de x como número entero:");
        int numerox = scanner.nextInt();
        System.out.println("Ingrese el valor de y como número entero:");
        int numeroy = scanner.nextInt();
        System.out.println("Ingrese el valor de n como número entero:");
        int numero_n = scanner.nextInt();

        // Calcular el factorial
        System.out.println("Factorial de " + numero_n + " es: " + factorial(numero_n));

        // Calcular la función de Ackermann
        System.out.println("Ackermann(" + numerox + ", " + numeroy + ") es: " + ackermann(numerox, numeroy));

        scanner.close(); // Despues de calcular la función de Ackermann se cierra el scanner.
    }

    // Método para calcular el factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) { // Si el valor de n es 0 o 1, se devuelve 1 directamente.
            return 1; // Caso base
        }
        return n * factorial(n - 1); // Llamada recursiva
    }

    // Método para calcular la función de Ackermann
    public static int ackermann(int x, int y) {
        if (x == 0) {
            return y + 1; // Caso base 1
        } else if (y == 0) {
            return ackermann(x - 1, 1); // Caso base 2
        } else {
            return ackermann(x - 1, ackermann(x, y - 1)); // Caso recursivo
        }
    }
}
