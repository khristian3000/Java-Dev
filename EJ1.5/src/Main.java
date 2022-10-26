/*
Diseñar un algoritmo que reciba por consola mi año de nacimiento, luego haga un cálculo y me devuelva si es verdadero
o falso que yo soy mayor de edad (no importa el mes y día: usamos el año cumplido).

 */

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calendar fecha = new GregorianCalendar();
        Scanner sc=new Scanner(System.in);

        int anio = fecha.get(Calendar.YEAR);
        System.out.println("INGRESE SU AÑO DE NACIMIENTO: ");
        int nac=sc.nextInt();

        if (anio-nac>=18){

            System.out.println("ES MAYOR DE EDAD ");
            System.out.println("USTED TIENE " +(anio-nac) + " AÑOS");
    }
        else {
            System.out.println("NO ES MAYOR DE EDAD: ");
            System.out.println("USTED TIENE " +(anio-nac) + " AÑOS");
        }
    }
}