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
            System.out.println("CUANTAS FICHAS QUIERE APOSTAR?");
            int apuesta=sc.nextInt();

            double numAzar = Math.round(random()*36);

            if (numAzar == apuesta){

                fichas+= 35;
            }

            else {

                fichas-=apuesta;
            }

            System.out.println(numAzar);
            System.out.println("DESEA SEGUIR JUGANDO??(SI/NO)");
            respuesta=sc.nextLine();



        }


    }
}