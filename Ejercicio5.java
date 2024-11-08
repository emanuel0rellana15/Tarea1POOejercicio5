/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio5 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        String[][] datos = new String[2][4]; // Arreglo para 3 personas con 4 atributos: nombre, apellido, carrera, lugar de trabajo
        // Guardar los datos en el arreglo
        for (int i = 0; i < datos.length; i++) {
            System.out.println("Ingresa los datos para la persona #" + (i + 1) + ":");
            System.out.print("Nombre: ");
            datos[i][0] = scanner.nextLine();
            System.out.print("Apellido: ");
            datos[i][1] = scanner.nextLine();
            System.out.print("Carrera: ");
            datos[i][2] = scanner.nextLine();
            System.out.print("Lugar de Trabajo: ");
            datos[i][3] = scanner.nextLine();
        }

//        #PERSONA - NOMBRE - APELLIDO - CARRERA - LUGAR TRABAJO
//          1        Emanuel    Orellana    ingenieria        Fertiagro   
//          2        Bayron    Martinez    ingenieria        Fertiagro   
//          3        Daniel    Claros    ingenieria         none
//Como salia desordenado, google como ordenarlo y copie ese codigo de %-[numero-distancia]-s        
        
        // Imprimir los datos almacenados
        System.out.println("\nDatos ingresados:");
        System.out.printf("%-10s %-15s %-15s %-20s %-20s%n", "#PERSONA", "NOMBRE", "APELLIDO", "CARRERA", "LUGAR TRABAJO");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < datos.length; i++) {
            System.out.printf("%-10d %-15s %-15s %-20s %-20s%n", (i + 1), datos[i][0], datos[i][1], datos[i][2], datos[i][3]);
        }
    }
}
