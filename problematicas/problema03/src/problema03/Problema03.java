/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author admin
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 1;
        int numero = 2;
        int diferencia = 1;
        while(numero < 37){
            diferencia += 2;
            numero = numero + diferencia;
            contador = contador + 1;

            System.out.println(numero);
    }
    }
}
