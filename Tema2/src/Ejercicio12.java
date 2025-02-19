import bpc.daw.objetos.MarcadorBaloncesto;
public class Ejercicio12 {

    /*Ejercicio 12 : En la librería ObjetosSencillos.jar se encuentra la clase MarcadorBaloncesto. Haz
un programa en el que se cree un partido de baloncesto para el partido que van a jugar el
Estudiantes y el CB Granada. Registra las siguientes canastas y muestra el nombre de los
equipos, los puntos que tiene cada uno, el nombre del equipo que va ganando y el que va
perdiendo. */

    public static void main(String[] args) {

        MarcadorBaloncesto partido = new MarcadorBaloncesto("estudiantes", "granada");

        partido.anotarCanasta('L', 2);
        partido.anotarCanasta('V', 3);
        partido.anotarCanasta('L', 2);
        partido.anotarCanasta('V', 2);
        partido.anotarCanasta('V', 3);
        partido.anotarCanasta('L', 1);
        partido.anotarCanasta('L', 1);
        partido.anotarCanasta('V', 2);

        String local =partido.getNombreLocal();
        String visitante =partido.getNombreVisitante();

        int puntosLocal = partido.getPuntosLocal();
        int puntosVisitante = partido.getPuntosVisitante();

        String ganador = partido.getNombreEquipoGanador();

        System.out.println("El equipo local es: "+local);
        System.out.println("El equipo visitante es: "+visitante);
        System.out.println("El equipo local tiene: "+puntosLocal+" puntos");
        System.out.println("El equipo visitante tiene: "+puntosVisitante+" puntos");
        System.out.println("El equipo Que va ganando es: "+ganador);





    }
}
