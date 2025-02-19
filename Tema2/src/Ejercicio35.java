import bpc.daw.reproductor.ArchivoMP3;
import bpc.daw.reproductor.Reproductor;

public class Ejercicio35 {

    /*Ejercicio 35 : Realiza las siguientes tareas y responde las preguntas que se indican:
    a) Crea dos objetos diferentes ArchivoMP3, pero que usen la misma ruta de archivo.
    a. Compáralos con el signo == como si fuesen tipos básicos. ¿Qué sucede?

    No funciona porque == solo es para comparar tipos basicos

    b. Compáralos con el método equals. ¿Qué sucede?

    Ahora si funciona

    c. Muestra los hashCode de dichos objetos. ¿Coinciden?

    SI

    b) Crea un objeto Reproductor y muestra por pantalla la salida de su método toString.
    ¿Qué aparece?

    bpc.daw.reproductor.Reproductor@133314b

    c) Crea un objeto ArchivoMP3 y muestra por pantalla la salida de su método toString.
    ¿Qué aparece? ¿Tiene el mismo formato que la salida de toString de Reproductor? ¿a
    qué crees que puede ser debido? */

    public static void main(String[] args){

        ArchivoMP3 a1 = new ArchivoMP3("C:\\\\Users\\\\danie\\\\Desktop\\\\musica.mp3");
        ArchivoMP3 a2 = new ArchivoMP3("C:\\\\Users\\\\danie\\\\Desktop\\\\musica.mp3");

        Boolean comprobar = a1==a2;

        System.out.println("Comprobacion con ==: "+comprobar);

        comprobar = a1.equals(a2);

        System.out.println("Comprobacion con equals: "+comprobar);

        System.out.println("Hashcode 1: "+a1.hashCode());
        System.out.println("Hashcode 2: "+a2.hashCode());

        Reproductor r1 = new Reproductor(a1,true,true);

        ArchivoMP3 a3 = new ArchivoMP3("C:\\\\Users\\\\danie\\\\Desktop\\\\musica.mp3");

        System.out.println(r1.toString());
        System.out.println(a3.toString());
    }

}
