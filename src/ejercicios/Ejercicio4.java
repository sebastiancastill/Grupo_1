package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int x, y;

        System.out.print("Ingresa el valor de x: ");
        x = in.nextInt();

        System.out.print("Ingresa el valor de y: ");
        y = in.nextInt();

        if (x > 5)

        {
            if (y > 5)

            {
                System.out.println("x e y son > 5");
            } else
            {
                System.out.println("x es <= 5");
            }
        }

    }

}
