/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

/**
 *
 * @author admin
 */
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadenaReporte = "";
        String cadenaEdad = "";
        String nombreJugador;
        String posicionCampo;
        int edad = 0;
        boolean bandera = true;
        String salir;
       
        int sumaEdades = 0;
        double sumaEstaturas = 0;


        int contadorIteraciones = 0;
        double promedioEdad;
        double promedioEstatura;
        double estatura;
        cadenaReporte = "Listado de Jugadores\n";

        while(bandera){
            System.out.println("Ingrese el nombre del Jugador: ");
            nombreJugador = entrada.nextLine();
            System.out.println("Ingrese su posicion en el campo: ");
            posicionCampo = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador: ");
            edad = entrada.nextInt();
            System.out.println("Ingrese estatura del jugador: ");
            estatura = entrada.nextDouble();

            contadorIteraciones = contadorIteraciones + 1; 
            sumaEdades =sumaEdades + edad;
            sumaEstaturas = sumaEstaturas + estatura;
            cadenaEdad += edad+ "\n";

            


            
            cadenaReporte = String.format("%s%d. %s - %s, %d anios, %.2f metros"
                    ,
                    cadenaReporte,
                    contadorIteraciones,
                    nombreJugador,
                    posicionCampo,
                    edad,
                    estatura);
            
         

                  
            entrada.nextLine();
            System.out.println("Desea salir del ciclo; digite: si");
            salir = entrada.nextLine();
            if(salir.equals("si")){
                bandera = false;
            }
        }
         cadenaReporte = String.format("%s\nLista de edades: \n%s",
                 cadenaReporte,
                 cadenaEdad);


          if (contadorIteraciones > 0) {
            promedioEdad = (double) sumaEdades / contadorIteraciones;
            promedioEstatura = sumaEstaturas / contadorIteraciones;

            cadenaReporte = String.format("%sPromedio de edades: "
                    + "%.2f años\nPromedio de estaturas: %.2f metros\n",
                    cadenaReporte,
                    promedioEdad,
                    promedioEstatura);
        } else {
            cadenaReporte = String.format("%sNo se ingresaron jugadores.\n"
                    , cadenaReporte);
        }

        System.out.printf("%s\n", cadenaReporte);
    }
}

    
    

