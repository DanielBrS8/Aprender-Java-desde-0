import bpc.daw.objetos.Caja;

public class Ejercicio11 {

    /*Ejercicio 11 : Haz otro programa que cree dos cajas, cada una con un mensaje diferente. Hacer
un programa que intercambie los mensajes de las dos cajas. */

    public static void main(String[] args){

        Caja caja1 =new Caja("Me gustan los perros");
        Caja caja2 =new Caja("Me gustan los gatos");

        System.out.println(caja1);
        System.out.println(caja2);


        caja1.cambiarMensaje("Me gustan los gatos");
        caja2.cambiarMensaje("Me gustan los perros");

        System.out.println(caja1);
        System.out.println(caja2);

    }

}
