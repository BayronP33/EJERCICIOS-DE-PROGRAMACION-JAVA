import java.util.Scanner; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola.

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario
        
        // Se le pide al usuario que ingrese los coeficientes de la ecuacion de segundo grado y se genera un salto de linea con el metodo println.
        System.out.println("Ingrese el coeficiente a: "); 
        double a = scanner.nextDouble(); // Lee el valor ingresado en a como un decimal

        System.out.println("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble(); // Lee el valor ingresado en b como un decimal

        System.out.println("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble(); // Lee el valor ingresado en c como un decimal

        // Se crea la constante de la ecuacion del discrimiante (b)^ - 4(a)(c)
        final double discriminante = b * b - 4 * a * c;

        if (a == 0) { 
            // Si a es igual a 0, no es una ecuacion cuadratica
            System.out.println("Esto no es una ecuacion cuadratica.");
        } else if (discriminante > 0) {
            // Dos soluciones reales
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a); // Se crea la variable x1 en donde se utiliza el metodo sqrt de la clase Math para determinar la raíz cuadrada del discriminante
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a); // Se crea la variable x2 en donde se utiliza el metodo sqrt de la clase Math para determinar la raíz cuadrada del discriminante
            System.out.println("La ecuacion tiene dos soluciones reales:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solucion real
            double x = -b / (2 * a);
            System.out.println("La ecuacion tiene una solucion real:");
            System.out.println("x = " + x);
        } else {
            // No tiene soluciones reales
            System.out.println("La ecuacion no tiene soluciones reales.");
        }
    }
}
