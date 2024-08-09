/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.util.Random;


 //Este ejercicio
 //incluye opciones de menú para invertir palabras verificar números perfectos,
  //enerar números aleatorios y verificar si son primos, y gestionar votaciones.
 
public class Miguel_Marin_Prueba_1 {
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        // Contadores para las veces que se ingresa a cada opcion
        int contadorPalabra = 0, contadorPerfecto = 0, contadorPrimos = 0, contadorVotadores = 0;
        int opcion;
        
        do {
            System.out.println("_______MENU PRINCIPAL_______");
            System.out.println("[1] PALABRA AL REVES");
            System.out.println("[2] NUMERO PERFECTO");
            System.out.println("[3] PRIMOS");
            System.out.println("[4] VOTADORES");
            System.out.println("[5] SALIR");
            System.out.print("Seleccione una opcion: ");
            
            opcion = Leer.nextInt();
            Leer.nextLine();  
            
            switch (opcion) {
                case 1: // Opcion 1: Invertir palabra
                    contadorPalabra++;
                    
                    String palabra;
                    String palabraInvertida;

                    do {
                        System.out.print("Ingrese una palabra (o 'salir' para volver al menu): ");
                        palabra = Leer.nextLine();
                        
                        if (!palabra.equalsIgnoreCase("salir")) {
                            palabraInvertida = "";
                            //  Esta funcion nvertira la palabra 
                            for (int i = palabra.length() - 1; i >= 0; i--) {
                                palabraInvertida += palabra.charAt(i);
                            }
                            System.out.println("Palabra invertida: " + palabraInvertida);
                        }
                    } while (!palabra.equalsIgnoreCase("salir"));
                    break;
                    
                case 2: // Opcion 2: Verificar numero perfecto
                    contadorPerfecto++;
                    
                    System.out.print("Ingrese un numero para verificar si es perfecto: ");
                    int numero = Leer.nextInt();
                    int suma = 0;

                    // Calcular la suma de los divisores propios del numero
                    for (int i = 1; i <= numero / 2; i++) {
                        if (numero % i == 0) {
                            suma += i;
                        }
                    }

                    // Determinar si el numero es perfecto
                    if (suma == numero) {
                        System.out.println(numero + " es un numero perfecto.");
                    } else {
                        System.out.println(numero + " no es un numero perfecto.");
                    }
                    break;
                
                case 3: // Opcion 3: Generar numero aleatorio y verificar si es primo
                    contadorPrimos++;
                    
                    Random random = new Random();
                    int numeroAleatorio = random.nextInt(100) + 1;  // Generar un numero entre 1 y 100
                    System.out.println("Numero generado: " + numeroAleatorio);
                    
                    int divisores = 0;
                    String listaDivisores = "";

                    // Calcular los divisores del numero y contar cuantos son
                    for (int i = 1; i <= numeroAleatorio; i++) {
                        if (numeroAleatorio % i == 0) {
                            divisores++;
                            listaDivisores += i + " ";
                        }
                    }

                    // Determinar si el numero es primo
                    if (divisores == 2) {
                        System.out.println("Primo: " + numeroAleatorio + " porque solo tiene dos divisores.");
                    } else {
                        System.out.println(numeroAleatorio + " no es primo.");
                    }

                    // Mostrar la lista de divisores
                    System.out.println("Divisores de " + numeroAleatorio + " son: " + listaDivisores.trim().replace(" ", " y "));
                    break;
                
                case 4: // Opción 4: Manejar votaciones
                    contadorVotadores++;
                    
                    System.out.print("Ingrese el numero de votantes: ");
                    int numVotantes = Leer.nextInt();
                    Leer.nextLine();  // Consumir la nueva línea
                    
                    if (numVotantes <= 0) {
                        System.out.println("Numero de votantes debe ser mayor que cero.");
                        break;
                    }

                    // Contadores para cada planilla y votos nulos
                    int votosAzul = 0;
                    int votosRojo = 0;
                    int votosNegro = 0;
                    int votosAmarillo = 0;
                    int votosNulos = 0;

                    for (int i = 1; i <= numVotantes; i++) {
                        System.out.print("Ingrese el voto #" + i + " (AZUL, ROJO, NEGRO, AMARILLO): ");
                        String voto = Leer.nextLine().toUpperCase();
                        
                        // Registrar el voto segun la opcion seleccionada
                        if (voto.equals("AZUL")) {
                            votosAzul++;
                        } else if (voto.equals("ROJO")) {
                            votosRojo++;
                        } else if (voto.equals("NEGRO")) {
                            votosNegro++;
                        } else if (voto.equals("AMARILLO")) {
                            votosAmarillo++;
                        } else {
                            votosNulos++;
                        }
                    }
                    
                    // Calcular el porcentaje de votos validos
                    int votosValidos = votosAzul + votosRojo + votosNegro + votosAmarillo;
                    double porcentajeVotosValidos = (double) votosValidos / numVotantes * 100;

                    // Verificar si la votación es valida
                    if (porcentajeVotosValidos < 60) {
                        System.out.println("VOTACION FALLIDA");
                    } else {
                        // Mostrar la cantidad de votos para cada color y votos nulos
                        System.out.println("Votos AZUL: " + votosAzul);
                        System.out.println("Votos ROJO: " + votosRojo);
                        System.out.println("Votos NEGRO: " + votosNegro);
                        System.out.println("Votos AMARILLO: " + votosAmarillo);
                        System.out.println("Votos NULOS: " + votosNulos);

                        // Determinar el ganador de la votacion
                        String ganador;
                        if (votosAzul > votosRojo && votosAzul > votosNegro && votosAzul > votosAmarillo) {
                            ganador = "AZUL";
                        } else if (votosRojo > votosAzul && votosRojo > votosNegro && votosRojo > votosAmarillo) {
                            ganador = "ROJO";
                        } else if (votosNegro > votosAzul && votosNegro > votosRojo && votosNegro > votosAmarillo) {
                            ganador = "NEGRO";
                        } else {
                            ganador = "AMARILLO";
                        }
                        System.out.println("La planilla ganadora es: " + ganador);
                    }
                    break;
                
                case 5: // Opcion 5: Salir
                    // Mostrar las veces que se ingreso a cada opcion antes de salir
                    System.out.println("Saliendo del sistema...");
                    System.out.println("Estadisticas de uso del menu:");
                    System.out.println("[1] PALABRA AL REVES fue seleccionada " + contadorPalabra + " veces.");
                    System.out.println("[2] NUMERO PERFECTO fue seleccionada " + contadorPerfecto + " veces.");
                    System.out.println("[3] PRIMOS fue seleccionada " + contadorPrimos + " veces.");
                    System.out.println("[4] VOTADORES fue seleccionada " + contadorVotadores + " veces.");
                    break;
                
                default:
                    System.out.println("Opcion no valida, por favor intente de nuevo.");
                    break;
            }

        } while (opcion != 5);

        Leer.close();
    }
}
