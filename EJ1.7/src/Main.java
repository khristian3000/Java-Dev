/*
Diseñar un algoritmo que me haga las tres siguientes preguntas:
1. Si tengo fiebre;
2. Si estoy resfriado;
3. Si tengo dolores de espalda;
4. Si tengo dolor de garganta.
Que me permita responder “Sí” o “No” a cada pregunta.
Si todas mis respuestas son que “No”,
quiero que me diga "¿Paciente sano? Sí".
Si alguna es verdadera, "¿Paciente sano? No".


 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String negativo= "no";
        System.out.println("TIENE FIEBRE?");
        String r1=sc.nextLine();
        System.out.println("ESTA RESFRIADO?");
        String r2=sc.nextLine();
        System.out.println("TIENE DOLOR DE ESPALDA?");
        String r3=sc.nextLine();
        System.out.println("TIENE DOLOR DE GARGANTA?");
        String r4=sc.nextLine();

        if (r1.equalsIgnoreCase(negativo) && r2.equalsIgnoreCase(negativo) && r3.equalsIgnoreCase(negativo)&&r4.equalsIgnoreCase(negativo) ){
            System.out.println("¿Paciente sano? Sí");
        }
        else {
            System.out.println("¿Paciente sano? NO");

        }
    }
}