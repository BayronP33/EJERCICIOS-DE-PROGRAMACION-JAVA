import java.util.Scanner; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola.

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario
        
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        
        int gcd = calcularGCD(num1, num2);
        System.out.println("El maximo comun divisor (GCD) de " + num1 + " y " + num2 + " es: " + gcd);
    }

    // Metodo para calcular el GCD utilizando el algoritmo de Euclides
    public static int calcularGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
