import java.util.*; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola.

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Scanner scanner = new Scanner(System.in); // Se crea el objeto scanner con la instancia System.in para reconocer las entradas de datos del usuario
        System.out.println("Calculadora de posicion numerica");
        System.out.println("Ingrese el numero1:");     
        Double numero1 = scanner.nextDouble();        
        System.out.println("Ingrese el numero2:");
        Double numero2 = scanner.nextDouble();   
        if (numero1 > numero2) {
            System.out.println("El numero mayor es" + numero1);
            System.out.println("El numero menor es" + numero2);            
        } else if (numero1 < numero2) {
            System.out.println("El numero mayor es" + numero2);
            System.out.println("El numero menor es" + numero1);             
        } else {
            System.out.println("los numeros son iguales");  
        }
        scanner.close();
    }
}