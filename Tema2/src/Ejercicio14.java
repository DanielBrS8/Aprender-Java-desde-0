import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args){

        System.out.println("Porfavor escriba una clase:");
        String frase = new Scanner(System.in).nextLine();

        String fraseSinEspacios = frase.trim();
        int contarFrase = (fraseSinEspacios.length())/2;

        System.out.println("El caracter en el medio de la frcase es: "+fraseSinEspacios.charAt(contarFrase));



    }

}
