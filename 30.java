import java.util.Scanner; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola.

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario

        System.out.print("Ingresa el rango maximo para buscar numeros primos: ");
        int rango = scanner.nextInt(); // Lee el numero entero ingresado por el usuario y lo almacena en la variable 'rango'.

        System.out.println("Numeros primos del 1 al " + rango + ":");

        // Un bucle for que itera desde 2 hasta el numero ingresado (rango) para verificar si cada numero es primo.
        for (int num = 2; num <= rango; num++) {
            boolean esPrimo = true;

            for (int divisor = 2; divisor <= num / 2; divisor++) {
                if (num % divisor == 0) { // Verifica si el número 'num' es divisible por 'divisor' sin dejar residuo para saber si es primo o no 
                    esPrimo = false; 
                    break; // Salimos del bucle interno
                }
            }
            if (esPrimo) {
                System.out.print(num + " ");
            }
        }
        scanner.close(); 
    }
}
