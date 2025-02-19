import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;
import java.io.IOException;

public class Ejercicio32 {
    public static void main(String[] args) {
        // Ruta del archivo MP3 en tu disco duro
        String rutaArchivo = "C:\\Users\\danie\\Desktop\\musica.mp3";



            ArchivoMP3 archivo = new ArchivoMP3(rutaArchivo);


            Reproductor reproductor = new Reproductor(archivo, false, true);


            reproductor.play();


            System.out.println("Reproduciendo:");
            System.out.println("Título: " + archivo.getTitulo());
            System.out.println("Autor: " + archivo.getAutor()) ;
            System.out.println("Duración: " + archivo.getDuracion() + " segundos");




    }
}
