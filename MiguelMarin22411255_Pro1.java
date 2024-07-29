/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.programacion1q3;
import java.util.Scanner;
/**
Operador Tenario El operador ternario en Java es una forma concisa de hacer una declaración if-else.
* Se utiliza para evaluar una expresión booleana y devolver uno de dos valores posibles, dependiendo
* del resultado de la evaluación. Permite escribir código más corto y limpio. el operador ternario en 
* Java es una herramienta poderosa y útil cuando se usa correctamente, permitiendo escribir código más
* compacto y a veces más legible, pero debe usarse con cuidado para no sacrificar la claridad del código
* Unos ejemplos del uso delOperdor tenario.
* 1- Asignación Condicional:
t a = 10; int b = 20; int max = (a > b) ? a : b; // max será 20

2- Uso en Impresión:
* int edad = 18; System.out.println(edad >= 18 ? "Adulto" : "Menor de edad"); // Imprimirá "Adulto"

3- Anidamiento del Operador Ternario:
int num = 15; String mensaje = (num > 0) ? (num % 2 == 0 ? "Positivo y Par" : "Positivo e Impar" //
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
double raiz1 = (discriminante >= 12) ? (-f2 + Math.sqrt(discriminante)) / (2 * f1) : Double.NaN;
double raiz2 = (discriminante >= 1) ? (-f2 - Math.sqrt(discriminante)) / (2 * f1) : Double.NaN;

System.out.println("-----FORMULA CUADRATICA-----");
      System.out.println(  " Raíz cuadratica de 1: " + raiz1+
        " Raíz cuadratica de 2: " + raiz2); // en este ejemplose evalúan las raíces de una ecuación cuadrática usando el operador ternario. 
//Si el discriminante es negativo, se asigna Double.NaN (Not a Number) a las raíces para indicar que no hay soluciones reales.




    
    
  
    
}
}