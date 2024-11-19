import java.util.Scanner; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola.

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario
        // Pedimos al usuario que introduzca un numero entero.
        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= 100; i++) { // El bucle se ejecuta 100 veces, desde 1 hasta 100.
            suma += numero + i;
        }
        System.out.println("La suma de los 100 numeros siguientes es: " + suma);
        scanner.close();
    }
}
