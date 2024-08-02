/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preogramacion1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ap339
 */
public class Lab3_Miguel_Marin {
  @SuppressWarnings("empty-statement")
  public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        Random pal=new Random();
        int opcion=0;
     while(opcion!=4){ 
        System.out.println("----****MENU***-----");
        System.out.println("1>JUEGO DE PIERDRA,PAPEL 0 TIJERAS");
        System.out.println("2>EJERCICIO SUMA");
         System.out.println("3>PATRON NUMERICO");
        System.out.println("4>SALIR");
        System.out.print("Elija una de las opciones: ");
        opcion=lea.nextInt();
    
        
        if(opcion==1){
            System.out.println("Bienvenido al juego de piedra papel o tijeras!!");
            
        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {
            // Solicitar y validar la entrada del usuario
            String eleccionUsuario = "";
            while (!eleccionUsuario.equals("piedra") && !eleccionUsuario.equals("papel") && !eleccionUsuario.equals("tijera")) {
                System.out.print("Ingrese su elección (piedra, papel, tijera): ");
                eleccionUsuario = lea.nextLine().toLowerCase();
            }

            // Generar la elección de la computadora sin usar arrays
            int numeroAleatorio = pal.nextInt(3);
            String eleccionComputadora = "";
            if (numeroAleatorio != 0) if (numeroAleatorio == 1) {
                eleccionComputadora = "papel";
            } else if (numeroAleatorio == 2) {
                eleccionComputadora = "tijera";
            } else {
                eleccionComputadora = "piedra";
                }

            System.out.println("La computadora eligio: " + eleccionComputadora);

            // Determinar el ganador
            if (eleccionUsuario.equals(eleccionComputadora)) {
                System.out.println("¡Es un empate!");
            } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                       (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                       (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("¡Perdiste!");
            }

            // Preguntar si el usuario quiere jugar de nuevo
            System.out.print("¿Quieres jugar de nuevo? (sí/no): ");
            String respuesta = lea.nextLine().toLowerCase();
            if (respuesta.equals("no")) {
                jugarDeNuevo = false;
                System.out.println("Gracias por jugar. ¡Hasta luego!");
            }
        }

       
    }
        else if(opcion==2){
          System.out.println("Ingrese un numero entero no negativo:");

        // Leer el número entero ingresado por el usuario y Validar que el número sea no negativo
        int numero = lea.nextInt();

        if (numero < 0) {
            System.out.println("El numero debe ser no negativo.");
            return;
        }

        // Variables para la suma y para construir el resultado en formato de cadena
        int suma=0 ;
        StringBuilder resultado = new StringBuilder();

       
        int numeroTemp = numero;

        // Procesar cada dígito del número
        while (numeroTemp > 0) {
            int digito = numeroTemp % 10; 

            // Agregar el dígito al resultado en formato
            if (resultado.length() > 0) {
                resultado.insert(0, " + ");
            }
            resultado.insert(0, digito); 

            numeroTemp /= 10; 
        }

        // Imprimir el resultado
        System.out.println("Suma de los digitos:");
        System.out.println(resultado + " = " + suma);
            
        }
        else if(opcion==3){
                   int filas = 5;  // Número de filas del patrón

        for (int i = filas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
  
        }
          else{
            System.out.println(" Saliendo el programa, Gracias por jugar!!!");
        }
        
}       
} 

}       
    