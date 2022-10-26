/*Diseñar un algoritmo que reciba dos palabras ingresadas por consola, los compare y
me devuelva por consola si es verdadero o falso que sean iguales.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese una palabra:");
        String palabra1 = sc.nextLine();
        System.out.println("Por favor ingrese otra palabra:");
        String palabra2 = sc.nextLine();

        // NO IGNORA LAS MAYUSCULAS
       // if(palabra1.equals(palabra2)) {

        //IGNORA LAS MAYUSCULAS
            if(palabra1.equalsIgnoreCase(palabra2)) {

        System.out.println("LAS PALABRAS SON IGUALES");}
    }
}