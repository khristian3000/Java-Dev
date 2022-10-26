import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int fichas=1000;
        String resp;

        System.out.println("************BIENVENIDO A LA RULETA ELECTRONICA*************") ;


        do{


            System.out.println("INGRESE UN NUMERO");
            int num = Integer.parseInt(sc.nextLine());
            while (!(num>0&&num<36)){
                System.out.println("RANGO DE NUMERO INCORRECTO");
                System.out.println("INGRESE UN NUMERO");
                num = Integer.parseInt(sc.nextLine());


            }

            System.out.println("CUANTAS FICHAS QUIERE APOSTAR?");

            int apuesta = Integer.parseInt(sc.nextLine());


            int numAzar = (int) (Math.random() * 37);

            System.out.println("SALIO EL " + numAzar);


            if (numAzar == apuesta){
                System.out.println("GANASTE!!!");

                fichas+= 35;

                System.out.println("AHORA TENES " + fichas + " FICHAS");


            }

            else {

                fichas-=apuesta;
                System.out.println("PERDISTE!!!");



                System.out.println("AHORA TENES " + fichas + " FICHAS");

            }


            System.out.println("DESEA SEGUIR JUGANDO??(SI/NO)");
            resp=sc.nextLine();




        }while (!resp.equalsIgnoreCase("NO"));

        System.out.println("TERMINASTE CON " + fichas + " FICHAS");
    }
}