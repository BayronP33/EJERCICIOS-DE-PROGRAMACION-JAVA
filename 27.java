import java.util.Scanner;  // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola. 

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario.
        double fahrenheit; // Se un objeto de tipo primitivo llamado fahrenheit para usarlo mas adelante para guardar datos de tipo decimal.
        
        System.out.println("Conversor de temperaturas (Fahrenheit a Celsius).");
        System.out.println("Introduce 999 para salir.");
        
        while (true) {
            System.out.print("Introduce la temperatura en Fahrenheit: ");
            fahrenheit = scanner.nextDouble(); // Se lee el valor ingresado por el usuario como un numero decimal (tipo 'double') y se almacena en la variable 'fahrenheit'.
            
            if (fahrenheit == 999) { // si elo valor ingresado es igual a 999 se imprime el mensaje y se rompe la condicional
                System.out.println("Programa finalizado.");
                break;
            }
            
            double celsius = 5.0 / 9.0 * (fahrenheit - 32); 
             // Se crea la variable 'celsius' para calcular la temperatura en Celsius, a partir de la temperatura en Fahrenheit, usando la fórmula: (Fahrenheit - 32) * 5/9. El valor se guarda como un número de tipo 'double'.
            System.out.println("La temperatura en Celsius es: " + celsius + "°C");
        
        scanner.close();
    }
}
