import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        String resp;

        do{

            System.out.println("Hello world!");
            System.out.println("INGRESE UN NUMERO: ");
            n=sc.nextInt();
            sc.nextLine();
            System.out.println("INGRESE SU NOMBRE: ");
            String nombre=sc.nextLine();

            System.out.println("sigue el bucle??");
            resp=sc.nextLine();

        }
        while(!resp.equalsIgnoreCase("no"));


    }
}