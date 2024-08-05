/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preogramacion1;
import java.util.Scanner;
/**
 *
 * @author ap339
 */
public class EjercicioMarin_Miguel_22411255 {
    public static void main(String[] args) {
       
    Scanner Lea = new Scanner(System.in);
         int opcion;

        do {
            System.out.println("____MENU____:");
            System.out.println("1. Ingresar una palabra e imprimir de manera diagonal");
            System.out.println("2. Imprimir piramide de numeros");
            System.out.println("3. Listado de Palindromo y No Palindromo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = Lea.nextInt();
            Lea.nextLine(); // Le damos un espacio a cada ejercicio clasificando y poniendo el codigo en un Static void.
            

            if (opcion == 1) {
                imprimirDiagonal(Lea);
                
                
            } else if (opcion == 2) {
                imprimirPiramide(Lea);
                
                
                
            } else if (opcion == 3) {
                listarPalindromos(Lea);
                
                
            } else if (opcion == 4) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("Opcion no vslida, intente de nuevo.");
            }
        } while (opcion != 4);
}
    //El codigo del primer ejercicio
     static void imprimirDiagonal(Scanner scanner) {
        
           System.out.print("Ingrese una palabra: ");
            String palabra = scanner.nextLine();
    
        // Imprimir la palabra diagonalmente en su forma original
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(Character.toUpperCase(palabra.charAt(i)));
        }
        
        // Imprimir la palabra diagonalmente en su forma inversa 
        for (int i = palabra.length() - 1; i >= 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(Character.toUpperCase(palabra.charAt(i)));
            
                    
         
        }
    }
     
     //El Segundo ejercicio
       static void imprimirPiramide(Scanner scanner) {
        System.out.print("Ingrese el número de filas para la pirámide: ");
        int filas = scanner.nextInt();

        int i = filas;// En este ejercicio hice que el codigo me permita poner cuantas filas quiera  ala piramide.
        while (i >= 1) {
            int j = filas;
            while (j > i) {
                System.out.print(" ");
                j--;
            }
            int k = 1;
            while (k <= (2 * i - 1)) {
                System.out.print(k);
                k++;
            }
            System.out.println();
            i--;
        }
    }
       
       //Tercer Ejercicio 
    static void listarPalindromos(Scanner scanner) {
        System.out.print("Ingrese palabras separadas por comas: ");
        String input = scanner.nextLine();

        int start = 0;
        int end = input.indexOf(',');

        System.out.println("Palindromos:");
        while (end != -1) {
            String palabra = input.substring(start, end).trim();
            if (esPalindromo(palabra) == 1) {
                System.out.println(palabra);
            }
            start = end + 1;
            end = input.indexOf(',', start);
        }

        String ultimaPalabra = input.substring(start).trim();
        if (esPalindromo(ultimaPalabra) == 1) {
            System.out.println(ultimaPalabra);
        }

        System.out.println("No Palindromos:");
        start = 0;
        end = input.indexOf(',');
        while (end != -1) {
            String palabra = input.substring(start, end).trim();
            if (esPalindromo(palabra) == 0) {
                System.out.println(palabra);
            }
            start = end + 1;
            end = input.indexOf(',', start);
        }

        ultimaPalabra = input.substring(start).trim();
        if (esPalindromo(ultimaPalabra) == 0) {
            System.out.println(ultimaPalabra);
        }
    }

    static int esPalindromo(String palabra) {
        int n = palabra.length();
        int i = 0;
        while (i < n / 2) {
            if (palabra.charAt(i) != palabra.charAt(n - 1 - i)) {
                return 0;
            }
            i++;
        }
        return 1;
    }
}


      
     

