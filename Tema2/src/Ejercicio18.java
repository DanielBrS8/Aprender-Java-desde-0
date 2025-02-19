import java.util.Scanner;

public class Ejercicio18 {

    /*Ejercicio 18 : Haz un programa que pregunte al usuario por su dirección de correo y la
    descomponga en su nombre de usuario y su dominio. */

    public static void main(String[] args){

        System.out.println("Porfavor indique su nombre correo electronio");

        String correo = new Scanner(System.in).nextLine();

        int separacion = correo.indexOf("@");
        String dominio = correo.substring(separacion);
        String nombre = correo.substring(0,separacion);

        System.out.println("El nombre es: "+nombre);
        System.out.println("El dominio es: "+dominio);
    }

}
