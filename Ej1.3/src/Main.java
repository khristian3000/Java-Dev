/*
Diseñar un algoritmo que me permita ingresar un número de mes y me devuelva
por consola cuántos meses faltan para fin de año.


 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        int diciembre = 12;
        System.out.println("INGRESE UN NUMERO DE MES: ");
        int mes= sc.nextInt();


        System.out.println("FALTAN " +(diciembre-mes)+ " MESES PARA FIN DE AÑO ");




    }

}