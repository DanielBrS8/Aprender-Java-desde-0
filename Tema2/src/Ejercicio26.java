import java.util.Scanner;

public class Ejercicio26 {

    /*Ejercicio 26 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Thread. Realiza
    un programa que pregunte al usuario “¿cuántos segundos quiere esperar?”. El usuario
    escribirá un número entero y el programa hará una pausa de dicha cantidad de segundos.
    Pasado ese tiempo se mostrará el mensaje “Programa finalizado”.
    */

    public static void main(String[] args){

        System.out.println("¿cuántos segundos quiere esperar?");

        int segundos = new Scanner(System.in).nextInt();

        int milisegundos = segundos*1000;

        try {

            Thread.sleep(milisegundos);

            System.out.println("Programa finalizado");
        }catch (InterruptedException error){

            System.out.println(error.getMessage());

        }
    }

}
