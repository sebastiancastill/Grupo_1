
package proyectouno;

import java.util.Scanner;
public class ProyectoUno {
    
    public static void main(String args[]){
        
        
        Scanner in = new Scanner(System.in);
        int matematicas = 0;
        int fisica = 0;
        int quimica = 0;
        int promedio = 0;
        
        System.out.print("Escribe la calificacion de matematicas: ");
        matematicas = in.nextInt();
        
        System.out.print("Escribe la calificacion de fisica: ");
        fisica = in.nextInt();
        
        System.out.print("Escribe la calificacion de quimica: ");
        quimica = in.nextInt();
        
        promedio = (matematicas + fisica + quimica) / 3;
        
        if(promedio >= 6){
            
            System.out.println("Aprobaste con un promedio de: " + promedio);
            
        } else {
            
            System.out.println("Reprobaste con un promedio de: " + promedio);
            
        }
    }
    
    
    
}
