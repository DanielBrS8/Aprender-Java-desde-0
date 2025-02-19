import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[] args) {


        System.out.println("Escriba la primera frase:");
        String frase1 = new Scanner(System.in).nextLine();


        System.out.println("Escriba la segunda frase:");
        String frase2 = new Scanner(System.in).nextLine();

        if (frase1.contains(frase2)) {
            System.out.println("La segunda frase está incluida en la primera.");
        } else {
            System.out.println("La segunda frase NO está incluida en la primera.");
        }
    }
}
