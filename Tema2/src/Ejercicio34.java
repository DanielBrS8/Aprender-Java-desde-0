import bpc.daw.reproductor.PlayList;
import bpc.daw.reproductor.Reproductor;

import java.io.IOException;

public class Ejercicio34 {

    public static void main(String[] args){



        try{

            PlayList p1 = new PlayList("C:\\Users\\danie\\Desktop\\prueba\\playList.txt");

            Reproductor r1 = new Reproductor(p1,true,true);

            r1.play();

        } catch (IOException e) {
            System.out.println("Error al cargar la lista");
        }



    }

}
