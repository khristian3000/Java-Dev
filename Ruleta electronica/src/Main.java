import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int fichas=1000;
        String respuesta;

        System.out.println("************BIENVENIDO A LA RULETA ELECTRONICA*************") ;
        System.out.println("DESEA JUGAR?? (SI/NO)");
        respuesta=sc.nextLine();


        while (!respuesta.equalsIgnoreCase("NO")){


            System.out.println("INGRESE UN NUMERO");
            int num=sc.nextInt();
            sc.nextLine();
            double numAzar = Math.round(random()*36);


            System.out.println(numAzar);
            System.out.println("DESEA SEGUIR JUGANDO??(SI/NO)");
            respuesta=sc.nextLine();



        }


    }
}