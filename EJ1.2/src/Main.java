/*
Diseñar un algoritmo que me permita ingresar un número por consola y me devuelva
si es verdadero o falso que sea divisible por cinco.


 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("INGRESE UN NUMERO: ");

        int  numero = sc.nextInt();

        if (numero%5==0){
            System.out.println("Es divisible por 5");
        }
        else {
            System.out.println("No Es Divisible por 5");
        }






    }
}