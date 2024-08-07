package preogramacion1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class TrabajoC_Miguel_Marin {
    public static void main(String [] args) {

        Scanner Leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("_-_-_-_MENU_-_-_-_");
            System.out.println("1> AREA De Un TRIANGULO");
            System.out.println("2> MAXIMO y MINIMO De Un NUMERO");
            System.out.println("3> NUMERO PERFECTO");
            System.out.println("4> SALIR");
            System.out.print("Elige una opcion: ");

            opcion = getIntInput(Leer);

            switch (opcion) {
                case 1:
                    calculateTriangleAreas(Leer);
                    break;
                case 2:
                    calculateMCMyMCD(Leer);
                    break;
                case 3:
                    checkPerfectNumber(Leer);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no válida. Por favor, elige una opcion entre 1 y 4.");
                    break;
            }
        } while (opcion != 4);
    }

    private static int getIntInput(Scanner Leer) {
        try {
            return Integer.parseInt(Leer.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada no valida. Por favor, introduce un número entero.");
            return -1;
        }
    }

    private static void calculateTriangleAreas(Scanner scanner) {
        double maxArea = 0;
        int triangleIndex = 0;

        for (int i = 1; i <= 8; i++) {
            try {
                System.out.print("Introduce la base del triangulo " + i + ": ");
                double base = Double.parseDouble(scanner.nextLine());

                System.out.print("Introduce la altura del triangulo " + i + ": ");
                double height = Double.parseDouble(scanner.nextLine());

                double area = 0.5 * base * height;
                if (area > maxArea) {
                    maxArea = area;
                    triangleIndex = i;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no valida. Por favor, introduce numeros validos para la base y la altura.");
                i--; // Repetir el ciclo para el mismo triángulo
            }
        }

        System.out.println("La mayor area es " + maxArea + " y fue encontrada en el triangulo " + triangleIndex);
    }

    private static void calculateMCMyMCD(Scanner scanner) {
        try {
            System.out.print("Introduce el primer numero: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Introduce el segundo numero: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            int gcd = findGCD(num1, num2);
            int lcm = findLCM(num1, num2, gcd);

            System.out.println("El Maximo Comun Divisor (MCD) de " + num1 + " y " + num2 + " es: " + gcd);
            System.out.println("El Minimo Comun Multiplo (MCM) de " + num1 + " y " + num2 + " es: " + lcm);
        } catch (NumberFormatException e) {
            System.out.println("Entrada no valida. Por favor, introduce números enteros.");
        }
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int findLCM(int a, int b, int gcd) {
        return (a * b) / gcd;
    }

    private static void checkPerfectNumber(Scanner scanner) {
        try {
            System.out.print("Introduce un numero: ");
            int number = Integer.parseInt(scanner.nextLine());

            if (isPerfectNumber(number)) {
                System.out.println(number + " es un numero perfecto.");
            } else {
                System.out.println(number + " no es un numero perfecto.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada no valida. Por favor, introduce un numero entero.");
        }
    }

    private static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
}