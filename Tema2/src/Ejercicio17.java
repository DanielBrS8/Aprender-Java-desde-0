import java.util.Scanner;

public class Ejercicio17 {

    /*Ejercicio 17 : Como ya sabes, una dirección de correo tiene el formato nombre@dominio.
    Realiza un programa que pregunte al usuario su nombre y después su dominio. En caso de que
    el dominio termine en .com o .es, el programa el programa formará una nueva variable
    llamada “correo” a partir de ellos y la mostrará por pantalla. En caso contrario, mostrará un
    mensaje de error “El dominio es incorrecto”. */

    public static void main(String[] args){

        System.out.println("Idique su nombre: ");
        String nombre = new Scanner(System.in).nextLine();

        System.out.println("Idique su dominio");
        String dominio = new Scanner(System.in).nextLine();

        if(dominio.endsWith(".com") || dominio.endsWith(".es")){
            System.out.println("Tu correo electronico: "+nombre+dominio);
        }else{
            System.out.println("No ha introducido correctamente su dominio");
        }
    }

}
