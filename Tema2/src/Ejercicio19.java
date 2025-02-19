import java.io.File;
import java.util.Scanner;

public class Ejercicio19 {

    /*Ejercicio 19 : Consulta el pdf de la librería “java io” y encuentra la clase File. Realiza un
    programa que pregunte al usuario por teclado la ruta de un archivo. El programa deberá decir
    cuántos bytes y cuántos megabytes ocupa en el disco duro. */

    public static void main(String[] args){

        System.out.println("Porfavor indique la ruta del archivo: ");
        String rutaArchivo = new Scanner(System.in).nextLine();

        File archivo = new File(rutaArchivo);

        if(archivo.isFile()) {

            long bytesArchivo = archivo.length();
            double megabytesArchivo = (archivo.length()) / 1000000.0;

            System.out.println(bytesArchivo);
            System.out.println(megabytesArchivo);
        }else{
            System.out.println("La ruta proporcionada no es valida");
        }
    }

}
