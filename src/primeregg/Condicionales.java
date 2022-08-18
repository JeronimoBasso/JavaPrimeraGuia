/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeregg;

import java.util.Scanner;

/**
 *
 * @author Jerónimo
 */
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opinion;
        Scanner leer = new Scanner(System.in);
        opinion = leer.nextInt();
        
        if (opinion >=1 && opinion <=5){
            switch (opinion) {
                case 1:
                case 2:
                    System.out.println("Has calificado la película como mala."); 
                    break;
                case 3:
                    System.out.println("Has calificado la película como buéna.");
                    break;
                case 4:
                    System.out.println("Has calificado la pelicula como muy buena");
                    break;
                case 5: 
                    System.out.println("Has calificado la película como excelente.");
                    break;
            }
            
        }else if (opinion <= 0){
            System.out.println("Esta calificacion es mas baja que la mínima.");
        }else if (opinion > 5) {
            System.out.println("Esta calificacion es mas alta que la maxima.");
            
        }
        
       
        
    }
    
}
