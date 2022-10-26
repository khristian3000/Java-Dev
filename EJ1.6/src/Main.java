/*
a) Diseñar un algoritmo que me pregunte si tengo alergias y si fumo y que me permita responder "Sí" o "No".
Si una de las dos respuestas o ambas son "Sí", quiero que me diga "Autorizado para intervención: NO".
 Sólo si ambas respuestas son "No", quiero que me diga "Autorizado para intervención: Sí".
b) Modificar el algoritmo anterior para invertir el resultado: si una o ambas respuestas son "Sí",
quiero que me diga "Autorizado para intervención: Sí". Si no, que NO. Exactamente al revés que el anterior.

 */

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String respuesta = "si";
        System.out.println("RESPONDA SI O NO");
        System.out.println("TIENE ALERGIAS??");
        String resp= sc.nextLine();
        System.out.println("FUMA??");
        String resp2= sc.nextLine();

        if (resp.equalsIgnoreCase(respuesta )|| resp2.equalsIgnoreCase(respuesta  ) ) {
            ;
            System.out.println("Autorizado para intervención: NO");
        }
        else {
            System.out.println("Autorizado para intervención: SI");

        }



    }
}