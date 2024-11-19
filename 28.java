import java.util.*; // Se importa la clase Scanner del paquete java.util para leer las entradas del usuario desde la consola.

public class Main {
    public static void main(String[] args) { // Se establece el punto de partida para la ejecucion del programa.
        Random random = new Random(); // Se crea un objeto de la clase Random, que es parte del paquete java.util y permite generar numeros aleatorios.
        int fortuna = random.nextInt(4) + 1; // se define el rando aleatorio entre 1 a 4 

        System.out.println("Tu numero de la fortuna es: " + fortuna);

        // Evaluar el numero de la fortuna con un switch
        switch (fortuna) {
            case 1:
                System.out.println("Hoy es tu dia de suerte. Aprovecha las oportunidades que se presenten.");
                break;
            case 2:
                System.out.println("Alguien especial te dara una buena noticia pronto.");
                break;
            case 3:
                System.out.println("Confia en tus ideas; una de ellas puede ser un exito.");
                break;
            case 4:
                System.out.println("La paciencia sera tu mejor aliada hoy. Ten fe.");
                break;
            default:
                System.out.println("Algo inesperado sucedera, preparate para lo mejor.");
                break;
        }
    }
}