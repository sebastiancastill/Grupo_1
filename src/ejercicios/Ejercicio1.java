package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String args[]) {

        int calificacion;
        Scanner in = new Scanner(System.in);

        System.out.print("Ingresa tu calificación: ");
        calificacion = in.nextInt();

        if (calificacion >= 60)
        {

            System.out.println("Aprobado");

        }
    }

}
