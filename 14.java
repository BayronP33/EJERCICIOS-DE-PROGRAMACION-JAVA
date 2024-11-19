public class Main {
    public static void main(String[]args){
        String palabra = "Hola, ";
        for (int i=1 ; i <= 200 ; i++) {
            String Cantidad = palabra.repeat(i);
            System.out.print(Cantidad);
        }
    }
}