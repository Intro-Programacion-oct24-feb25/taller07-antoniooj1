/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double numero1= 1;      
      double numero2 =3;      
      double cont =1;  
      double resultado= numero1 + numero2;  
      
        System.out.print("1");
         while(numero2 <= 15){
             
            if (cont % 2 != 0) {
                
                System.out.print(" - 1/" + numero2); 
                
                
            } else {
                
                System.out.print(" + 1/" + numero2);  
            }
 
            cont= cont +1;
            numero2 +=2;
            
       }
   }
    
}
