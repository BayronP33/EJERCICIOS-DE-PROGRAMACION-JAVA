import java.util.*; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola.

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario
        System.out.println("Escribe algo (presiona CTRL-D para terminar en Unix/Linux o CTRL-Z en Windows):");

        while (scanner.hasNext()) {
            String linea = scanner.nextLine();
            System.out.println("Leido: " + linea);
        }

        System.out.println("Fin del archivo alcanzado.");
        scanner.close();
    }
}