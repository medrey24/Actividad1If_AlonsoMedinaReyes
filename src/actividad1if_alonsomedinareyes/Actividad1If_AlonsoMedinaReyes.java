/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad1if_alonsomedinareyes;

/**
 *
 * @author acs
 */
import java.util.Scanner;
public class Actividad1If_AlonsoMedinaReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner datos = new Scanner(System.in);
       
       System.out.println("Introduzca un año: ");
       int años = datos.nextInt();
       int P_año = 0;
       
       if (años < 2021){
           P_año = 2021 - años;
           System.out.println("Han pasado " + P_año + " años");
           
       } else if (años > 2021){ 
           
           P_año = años - 2021;
           System.out.println("Faltan " + P_año + " años");
           
       } else{
           System.out.println("¡Estamos en el mismo año!");
       }
       
    }
         
}
    
