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
        // TODO code application logic here
       double num = 1;
       double resta = 0;
       double suma = 0;




       while(num < 15){
           num += 2;
           resta = 1 - 1/num;
           suma += resta;
           System.out.printf("1 -"+" 1/"+num+ " %.2f\n",
                   suma);
       }
    }
}


       
   
                
          
    
    

