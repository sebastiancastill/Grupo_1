package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int calificacion;

        System.out.print("Ingresa tu calificacion: ");
        calificacion = in.nextInt();

        if (calificacion >= 90)
        {
            System.out.println("A");

        } else if (calificacion >= 80)
        {
            System.out.println("B");

        } else if (calificacion >= 70)
        {
            System.out.println("C");

        } else if (calificacion >= 60)
        {
            System.out.println("D");

        } else
        {
            System.out.println("F");
        }
    }

}
