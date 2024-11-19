import java.util.Scanner; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola.

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario
        System.out.println("Calculadora de area de rectangulos");

        // Solicitar datos al usuario
        System.out.println("Ingrese la base en cm del rectangulo: ");
        float base = scanner.nextFloat();

        System.out.println("Ingrese la altura en cm del rectangulo: ");
        float altura = scanner.nextFloat();

        // Calcular el área
        float area = base * altura;

        // Mostrar resultados
        System.out.println("El area del rectangulo es: " + area + " cm^2");

        // Cerrar el scanner
        scanner.close();
    }
}