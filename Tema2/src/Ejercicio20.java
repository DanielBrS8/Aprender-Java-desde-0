import java.io.File;
import java.util.Scanner;

public class Ejercicio20 {

    /*Ejercicio 20 : Realiza un programa que pregunte al usuario por la ruta de un archivo del disco
    duro. Si dicho archivo existe y es directorio, el programa dirá "La ruta introducida corresponde
    a un directorio" y terminará sin hacer nada más. En caso de que sea un archivo, el programa
    mostrará "La ruta introducida es un archivo de tamaño ... bytes. ¿Desea borrarlo (si/no)?". Si el
    usuario introduce la palabra "si", el archivo se borrará y el ordenador mostrará si se ha
    borrado correctamente o se ha producido un error al borrar. En caso de que el usuario escriba
    cualquier otra cosa el programa responderá "Borrado cancelado" y finalizará.
    */

    public static void main(String[] args){

        System.out.println("Porfavor indique la ruta del archivo: ");
        String rutaArchivo = new Scanner(System.in).nextLine();

        File archivo = new File(rutaArchivo);

        if(archivo.exists()) {

            if(archivo.isFile()) {

                long bytesArchivo = archivo.length();

                System.out.println("La ruta introducida es un archivo de tamaño "+bytesArchivo+" bytes ¿Desea borrarlo(si/no)?");
                String borrar = new Scanner(System.in).nextLine();

                if(borrar.equalsIgnoreCase("si")){

                    boolean error = archivo.delete();

                    if(error==true){

                        System.out.println("El archivo se ha borrado correctamente");

                    }else{

                        System.out.println("El archivo no se ha podido borrar");

                    }
                }else{

                    System.out.println("Borrado cancelado");

                }
            }else{

                System.out.println("La ruta introducida corresponde a un directorio");

            }
        }else{
            System.out.println("La ruta proporcionada no es valida");
        }

    }

}
