import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.PlayList;
import bpc.daw.reproductor.Reproductor;

import java.io.IOException;

public class Ejercicio33 {

    /*Ejercicio 33 : Haz un programa que cree una lista de reproducción titulada “Lista de Ejemplo” y
    añádele tres canciones a ellas. El programa deberá guardar dicha lista en el disco duro (puedes
    inventar el nombre del archivo) y luego reproducir las tres canciones de forma síncrona. */

    public static void main(String[] args){

        PlayList p1 = new PlayList();

        p1.setTitulo("Lista de ejemplo");

        ArchivoMP3 a1 = new ArchivoMP3("C:\\Users\\danie\\Desktop\\musica.mp3");
        ArchivoMP3 a2 = new ArchivoMP3("C:\\Users\\danie\\Desktop\\musica2.mp3");
        ArchivoMP3 a3 = new ArchivoMP3("C:\\Users\\danie\\Desktop\\musica4.mp3");

        p1.añadir(a1);
        p1.añadir(a2);
        p1.añadir(a3);

        try {

            p1.guardar("C:\\Users\\danie\\Desktop\\prueba\\playList.txt");

        }catch (IOException error){

            System.out.println("Error al guardar la playList");
        }

        Reproductor r1 = new Reproductor(p1,true,true);

        r1.play();

    }

}
