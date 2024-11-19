import java.util.Scanner; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario

        System.out.print("Ingrese la cantidad de euros en decimal: ");
        float numero = scanner.nextFloat(); // Lee la entrada del usuario como un numero decimal
        float tipocambio = (float) 1.10; 
        float resultado = numero * tipocambio; // se crea la variable resultado donde se multiplica el valor ingresado en euros por el tipo de cambio en este caso dolares

        System.out.println("La cantidad de euros en dolares es: " + resultado);
        scanner.close();
    }
}
