import java.util.Scanner;

/*
Trabajo en una escuela, tengo a cargo profesores y necesito que ellos me puedan cargar la nota de sus alumnos para las
materias Lengua y Matemática. Para eso, quiero que puedan ingresar: cuántos alumnos tienen, nombre de cada alumno y la
nota de Lengua y de Matemáica de cada uno de ellos. Quiero que el bucle tome la cantidad de alumnos que tiene el
profesor y, en base a eso, le permita ingresar la información para cada uno de ellos, hasta el último alumno. Así,
cada vez que se termine de ingresar la información de un alumno, quiero por último que me la devuelva por pantalla con:
el orden en que fue ingresado (si fue el primero, acá dirá 1; si fue el segundo, dirá 2), nombre del alumno, nota que
sacó en Lengua y nota que sacó en Matemática. La numeración va a corresponder al orden en que fue ingresado el alumno
(si hay 3 alumnos, el primero ingresado va a decir “1:”, el segundo va a decir “2:” y el tercero va a decir “3:”).


Ejemplo: la salida podría quedar como “1: José Rodríguez, nota Lengua: 10, nota Matemática: 9”.

OPCIONES PARA RESOLVER ESTE PROBLEMA: ELEGI LA OPCION B

a) Trabajar con un array de objetos, en su caso personas, cada uno con su nombre y edad.

b) trabajar con 2 arrays separados de tipos distintos, uno para nombres y otro para las edades.

b) Usar un único array de Strings y recuperar los valores de las edades por posterior conversión a tipo entero.

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("INGRESE LA CANTIDAD DE ALUMNOS:");
        int alumnos= sc.nextInt();
        sc.nextLine();


        String [] nombres = new String[alumnos];

        int [] nota1 = new int [alumnos];
        int [] nota2 = new int [alumnos];


        for (int i=0;i<alumnos;i++) {
            System.out.println("INGRESE EL NOMBRE Y APELLIDO DEL ALUMNO");
            nombres[i] = sc.nextLine();
            System.out.println("INGRESE LA NOTA DE LENGUA");
            nota1[i] = sc.nextInt();
            System.out.println("INGRESE LA NOTA DE MATEMATICA");
            nota2[i] = sc.nextInt();
            sc.nextLine();

        }

        for (int i=0;i<alumnos;i++) {

            System.out.println(i+1+ ") " + nombres[i] + " NOTA DE LENGUA: " + nota1[i] + " NOTA DE MATEMATICAS: " + nota2[i] );
            //1: José Rodríguez, nota Lengua: 10, nota Matemática: 9
        }
    }
}