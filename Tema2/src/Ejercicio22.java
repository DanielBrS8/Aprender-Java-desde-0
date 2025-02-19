import bpc.daw.objetos.TarjetaCredito;

import java.util.Scanner;


public class Ejercicio22 {

            /*Ejercicio 22 : En la librería ObjetosSencillos.jar se encuentra la clase TarjetaCrédito. Haz un
            programa que cree una tarjeta de crédito con contraseña 1111 y saldo 5000€. Mostrar la
            información de la cuenta por pantalla. Sacar 2000 € y volver a mostrar la información. */

    public static void main(String[] args){

        int saldo =0;

        System.out.println("Introduzca la contraseña de la tarjeta de credito");
        int contraseña = new Scanner(System.in).nextInt();

        System.out.println("Introduzca cuanto dinero queires ingresar");
        int dinero = new Scanner(System.in).nextInt();

        TarjetaCredito t1 = new TarjetaCredito(dinero,contraseña);

        System.out.println("Introduzca la contraseña de la tarjeta de credito");
        contraseña = new Scanner(System.in).nextInt();

        try {
            saldo = t1.getSaldo(contraseña);

            System.out.println("El saldo de la targeta es: "+saldo);

            System.out.println("Cuanto dinero queires sacar?");

            int dineroSacar = new Scanner(System.in).nextInt();

            t1.sacarDinero(dineroSacar,contraseña);

            saldo = t1.getSaldo(contraseña);

            System.out.println("El saldo de la targeta es: "+saldo);

        }catch (java.lang.Exception error){

            System.out.println("Ha ocurrido un error al utilizar la targeta");

        }



    }

}
