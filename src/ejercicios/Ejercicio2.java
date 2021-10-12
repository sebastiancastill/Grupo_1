package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int calificacion;

        System.out.println("Ingresa la calificacion");
        calificacion = in.nextInt();

        if (calificacion >= 60)
        {

            System.out.println("Aprobado");

        } else
        {
            System.out.println("Reprobado");
        }
    }

}
