import bpc.daw.musica.*;

public class Ejercicio31 {

    /*Ejercicio 31 : En la librería Música se encuentran clases para reproducir una sencilla partitura
    en un instrumento musical. Haz un programa que reproduzca en un piano la siguiente
    canción. Modifica el programa para que al finalizar, se vuelva a reproducir con una guitarra.
    */

    public static void main(String[] args){

        NotaMusical nota1= new NotaMusical(0,2);
        NotaMusical nota2= new NotaMusical(0,2);
        NotaMusical nota3= new NotaMusical(4,2);
        NotaMusical nota4= new NotaMusical(4,2);
        NotaMusical nota5= new NotaMusical(5,2);
        NotaMusical nota6= new NotaMusical(5,2);
        NotaMusical nota7= new NotaMusical(4,1);
        NotaMusical nota8= new NotaMusical(3,3);
        NotaMusical nota9= new NotaMusical(3,3);
        NotaMusical nota10= new NotaMusical(2,3);
        NotaMusical nota11= new NotaMusical(2,3);
        NotaMusical nota12= new NotaMusical(1,4);
        NotaMusical nota13= new NotaMusical(2,4);
        NotaMusical nota14= new NotaMusical(3,4);
        NotaMusical nota15= new NotaMusical(1,4);
        NotaMusical nota16= new NotaMusical(1,2);


        Cancion cancion1= new Cancion("Cancion1");

        cancion1.añadir(nota1);
        cancion1.añadir(nota2);
        cancion1.añadir(nota3);
        cancion1.añadir(nota4);
        cancion1.añadir(nota5);
        cancion1.añadir(nota6);
        cancion1.añadir(nota7);
        cancion1.añadir(nota8);
        cancion1.añadir(nota9);
        cancion1.añadir(nota10);
        cancion1.añadir(nota11);
        cancion1.añadir(nota12);
        cancion1.añadir(nota13);
        cancion1.añadir(nota14);
        cancion1.añadir(nota15);
        cancion1.añadir(nota16);

        System.out.println("Primero reproducimos la cancion en piano");

        Piano piano = new Piano();
        piano.reproducir(cancion1);

        System.out.println("Ahora reproducimos la cancion en guitarra");

        Guitarra guitarra = new Guitarra();
        guitarra.reproducir(cancion1);





    }

}
