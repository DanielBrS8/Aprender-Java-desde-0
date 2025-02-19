import java.util.Scanner;

public class Ejercicio15 {

    /*Ejercicio 15 : Haz un programa en el que haya una variable String llamada “clave” con el texto
    que tú quieras. A continuación, el programa pedirá que introduzcas una contraseña por
    teclado. El ordenador mostrará si la variable “clave” coincide con la contraseña introducida. */

    public static void  main(String[] args){

        String clave ="contraseña";

        System.out.println("Porfavor proporcione la clave: ");
        String claveUsuario = new Scanner(System.in).nextLine();

        if(clave.equals(claveUsuario)){

            System.out.println("La contarseña es correcta");

        }else{
            System.out.println("La contraseña introducida no es correcta");
        }
    }

}
