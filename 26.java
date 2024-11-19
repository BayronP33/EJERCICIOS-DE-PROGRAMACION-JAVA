import java.util.Scanner; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola. 

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario

        // Solicitar tres números enteros positivos al usuario
        System.out.println("Ingrese el primer número entero positivo:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero positivo:");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número entero positivo:");
        int num3 = scanner.nextInt();

        // Validar que los números sean positivos
        if (num1 <= 0 || num2 <= 0 || num3 <= 0) { // si alguna de las tres variables (num1, num2, num3) es menor o igual a cero se imprime el mensaje.
            System.out.println("Por favor, ingrese solo números enteros positivos.");
        } else {
            // Se utilizan los metodos min y max de la clase Math para determinar el numero mayor y menor entre las variables num1 y num2.
            int menor = Math.min(num1, Math.min(num2, num3));
            int mayor = Math.max(num1, Math.max(num2, num3));

            // Imprimir el resultado
            System.out.println("El menor número es: " + menor);
            System.out.println("El mayor número es: " + mayor);
        }
        scanner.close();
    }
}