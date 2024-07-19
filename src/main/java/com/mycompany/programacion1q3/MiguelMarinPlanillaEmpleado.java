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
public class MiguelMarinPlanillaEmpleado {
    
      public static void Main(String [] args){
   
   Scanner Lea = new Scanner (System.in); 
   
   System.out.print(" Ingresar el nombre completo del empleado: ");
   String nombreEmpleado = Lea.nextLine();
   
     System.out.print("Ingrese las horas trabajadas en el mes: ");
        double horasMensuales =Lea.nextDouble();

        System.out.print("Ingrese la tarifa por hora (Lps.): ");
        double tarifaPorHora =Lea.nextDouble();
        
            
             double salarioSemanal = horasMensuales * tarifaPorHora;
        
   System.out.println("----- Boletta de Empleado ------");
     System.out.println("Nombre del Empleado: " + nombreEmpleado);
        System.out.println("Horas de Trabajo Mensual: " + horasMensuales);
        System.out.println("Tarifa por Hora : Lps. " + String.format("%.2f", tarifaPorHora));
        System.out.println("Salario del Empleado Semanal: Lps. " + String.format("%.2f", salarioSemanal));
        
        
        
   }

   
   
   
    
}
