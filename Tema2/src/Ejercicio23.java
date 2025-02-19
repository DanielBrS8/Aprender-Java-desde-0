import bpc.daw.objetos.TarjetaCredito;

import java.util.Scanner;

public class Ejercicio23 {

    /*Ejercicio 23 : Haz un programa que cree una tarjeta de crédito con contraseña 2222 y saldo
    1000€. Mostrar la información de la cuenta por pantalla. Ingresar 100 € y volver a mostrar la
    información. Retirar 2800 € de ella y volver a mostrar la información. */

    public static void main(String[] args){

        System.out.println("Introduzca la contraseña de la tarjeta de credito");
        int contraseña = new Scanner(System.in).nextInt();

        System.out.println("Introduzca cuanto dinero queires ingresar");
        int dinero = new Scanner(System.in).nextInt();

        TarjetaCredito t1 = new TarjetaCredito(dinero,contraseña);

        try {
            int dineroActual= t1.getSaldo(contraseña);
            System.out.println("Dinero actual: "+dineroActual);
            t1.ingresarDinero(100);
            dineroActual= t1.getSaldo(contraseña);
            System.out.println("Dinero actual: "+dineroActual);
            if(t1.sacarDinero(2800,contraseña)){

                dineroActual= t1.getSaldo(contraseña);
                System.out.println("Dinero actual: "+dineroActual);

            }else{

                System.out.println("No se puede sacar esa cantidad de dinero, no hay suficiente saldo");

            }


        }catch (java.lang.Exception error){

            System.out.println("Ha ocurrido un error al manejar la targeta");

        }

    }

}
