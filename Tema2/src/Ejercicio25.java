import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio25 {

    /*Ejercicio 25 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Scanner. Realiza
    un programa que abra el archivo “d:/frase.txt” que has creado en el ejercicio anterior y nos
    muestre por pantalla las dos frases que hay guardadas en él.
    */

    public static void main(String[] args){

        String ruta= "C:\\Users\\danie\\Desktop\\frases.txt";


        try {
            File archivo = new File(ruta);
            Scanner s1 = new Scanner(archivo);
            String frase = s1.nextLine();
            System.out.println(frase);
            s1.close();

        }catch (FileNotFoundException error){

        System.out.println("No se ha podido leer el archivo");

        }
    }

}
