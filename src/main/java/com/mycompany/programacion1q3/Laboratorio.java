/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion1q3;

import java.util.Scanner;

        
/**
 *
 * @author osori
 */
public class Laboratorio {
    public static void main(String[] args){
        Scanner lea=new Scanner (System.in);
        
        System.out.println("----Menu----");
         System.out.println("Selecione una Opcion: ");
        System.out.println("1. Cadena");
         System.out.println("2. Notas");
        System.out.println("3. Classes");
         System.out.println("4. Salir");
        
         int opcion;
         opcion=lea.nextInt();
         
          if (opcion==1){
       
          
              
                      
     System.out.println("Ingrese una cadena de texto:");
        String cadena = lea.nextLine();
        

            
        int longitud = cadena.length();
        int maxRepeticiones = 0;
        char caracterMasRepetido = ' ';
        int i = 0;
        
     
        char f = 0;
        while (f < 256) {
            int conteoActual = 0;
            int h = 0;
            
            
            while (h < longitud) {
                if (cadena.charAt(h) == f){
                    conteoActual++;
                }
                h++;
            }
            
            
            if (conteoActual > maxRepeticiones) {
                maxRepeticiones = conteoActual;
                caracterMasRepetido = f;
            }
                 h++;
        }
        
        System.out.println("El carácter que más veces se repite es: " + caracterMasRepetido);
        System.out.println("Número de veces que se repite: " + maxRepeticiones);


          }
   else if(opcion ==2){
       
    int cantidadNotas = 0;
        while (true) {
            System.out.println("Ingrese la cantidad de notas:");
          cantidadNotas = lea.nextInt();
}
            if (cantidadNotas > 0) {
                
            } else {
                System.out.println("Error: La cantidad de notas debe ser un valor positivo.");
            
            }
             double[] notas = new double[cantidadNotas];
        }

       
        for (int i = 0; i < cantidadNotas; i++) {
            while (true) {
                System.out.println("Nota# " + (i + 1) + ":");
                double nota = lea.nextDouble();
                if (nota >= 0 && nota <= 100) {
                    notas[i] = nota;
                    break;
                } else {
                    System.out.println("Error: La nota debe estar dentro del rango de 0 a 100.");
                }
            }
        }

        double suma = 0;
        double notaMayor = notas[0];
        double notaMenor = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
        }

        double promedio = suma / cantidadNotas;

        System.out.printf("Promedio: %.2f%%\n", promedio);
        System.out.printf("Nota mayor: %.2f\n", notaMayor);
        System.out.printf("Nota menor: %.2f\n", notaMenor);

   
         else if(opcion==3){
         
         
         }
         
           else if(opcion==4){
                 
                 System.out.println("saliendo");
                 break
                         }else{
                 
                 System.out.println("Opcion invalida");}
         
         

         
   
   
   }
          
          
          
          
   
          
}
  
        
       
  
   
  
    
    
        
   
      
    }
 
        
        }

         
               
              
           
     
            
       
           
      
      
           
          
            

    
    
    
   
