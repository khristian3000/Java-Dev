/*
Diseñar un algoritmo que me permita ingresar el año actual y me diga cuántos años pasaron desde la independencia argentina (1816).

 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        System.out.println("INGRESE EL AÑO ACTUAL: ");
        int anioActual=sc.nextInt();

        System.out.println("DESDE LA INDEPENDENCIA ARGENTINA PASARON " + (anioActual-181620) + " AÑOS");

    }
}