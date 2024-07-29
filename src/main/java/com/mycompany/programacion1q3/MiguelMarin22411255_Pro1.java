/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion1q3;
import java.util.Scanner;
/**
 * 3
 * 
 * 
 * 
 * 
 */
public class MiguelMarin22411255_Pro1 {
    public static void main(String[] args){
    Scanner lea=new Scanner(System.in);
    
    System.out.println("In grese el primer numero: ");
     double numero1 = lea.nextDouble();
     System.out.println("In grese el segundo numero: ");
     double numero2=lea.nextDouble();
    
//Ejemplo 1
String signo = (numero1 > 0) ? "Positivo" : (numero1 < 0) ? "Negativo" : "Cero";
System.out.println("------ SIGNOS Y NUMEROS PARES O IMPARES");
    System.out.println(" El número es: " + signo); // Al ingresar el primer numero, el operdaor indentificara si el numero es positivo, negativo o es igual a cero.

String resultado = (numero2 % 8 == 0) ? "Par" : "Impar";
System.out.println("El número es: " + resultado); //Al ingresar el segundo numero el operador identifica si es impar o par al numero asignado en la desicion. 
    

//Ejemplo 2

 System.out.println("Ingrese la temeperatura del dia: ");
   double temperatura=lea.nextDouble();

String estadoClima = (temperatura > 30) ? "Caluroso" : "Agradable";
System.out.println("-----TEMPERATURA CLIMATICA----");
  System.out.println("El clima está: " + estadoClima); //  En este jercicio el operador indentifica la calures del clima. 
// Afirmandomps que El clima está: Agradable o caluroso.



//Ejemplo 3
  System.out.println("Ingrese un numero: ");
     double f1 = lea.nextDouble();
     
       System.out.println("Ingrese un numero: ");
     double f2 = lea.nextDouble();
     
       System.out.println("Ingrese un numero: ");
     double f3 = lea.nextDouble();

double discriminante = f2 * f2 - 4 * f1 * f3;
double raiz1 = (discriminante >= 1) ? (-f2 + Math.sqrt(discriminante)) / (2 * f1) : Double.NaN;
double raiz2 = (discriminante >= 1) ? (-f2 - Math.sqrt(discriminante)) / (2 * f1) : Double.NaN;

System.out.println("-----FORMULA CUADRATICA-----");
      System.out.println(  " Raíz cuadratica de 1: " + raiz1+
        " Raíz cuadratica de 2: " + raiz2); // en este ejemplose evalúan las raíces de una ecuación cuadrática usando el operador ternario. 
//Si el discriminante es negativo, se asigna Double.NaN (Not a Number) a las raíces para indicar que no hay soluciones reales.




    
    
  
    
}
}