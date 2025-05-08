/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.espoch.edu.controltemperaturasdiarias;

import java.util.Scanner;

/**
 *
 * @author KARLA
 */
public class ControlTemperaturasDiarias {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double [] temperaturas = new double[7];
       double suma=0;
       
        for (int i = 0; i < 7; i++) {
            double temp;
            do{
                System.out.println("ingrese la temperatura del dia"+"(-30a 50 gradosC)");
                temp=
            scanner.nextDouble();
                if(temp <-30  temp>50) {
                    System.out.println("Temperatura fuera de rango. Intente nuevamente.");
                    
                }
                 }while  (temp< -30 );
           boolean name = temp >   50;
             
            temperaturas[i]= temp;
            suma+= temp;
            
            }
        
        double promedio = suma/7;
        System.out.println("Promedio semanal de temperatura:"+ promedio+"gradosC");
        
        int diasEncimaPromedio=0;
        for (double temp: temperaturas)
       {
           if (temp > promedio){
               diasEncimaPromedio++;
               
           }
            
        }
        System.out.println(" Dias con temperaturas por encima del promedio:"+ diasEncimaPromedio);
        
        int diasFrio=0;
        for(double temp: temperaturas)
            {
                if(temp< 10){
                    diasFrio++;
                    
                }
            }
        System.out.println("Dias con temperatura inferior a 10gradosC:"+ diasFrio);
        
        double sumaPrimerosTres= temperaturas[0]+temperaturas[1]+temperaturas[2];
        double sumaUltimosTres= temperaturas[4]+temperaturas[5]+temperaturas[6];
        System.out.println("Suma de temperatura de los primeros tres dias:"+ sumaPrimerosTres+"gradosC");
        System.out.println("Suma de temperatura de los ultimos tres dias:"+ sumaUltimosTres+"gradosC");
        
        scanner.close();
       
    }
}
