import bpc.daw.objetos.Caja;

public class Ejercicio10 {

    /*Ejercicio 10 : Haz otro programa que cree una caja con un mensaje cualquiera. Abrir la caja,
consultar el mensaje y mostrarlo por pantalla. Sustituir el mensaje por otro. Volver a
consultarlo y mostrar el resultado. */

    public static void main(String[] args){

        Caja caja1 =new Caja("Hola buenos dias");
        caja1.abrirCaja();
        String mensaje = caja1.getMensaje();
        System.out.println(mensaje);
        caja1.cambiarMensaje("Hola buenas tardes");
        mensaje = caja1.getMensaje();
        System.out.println(mensaje);


    }

}
