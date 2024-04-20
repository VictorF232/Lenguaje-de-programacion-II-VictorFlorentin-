/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clasificaredades;

import java.util.Scanner;

public class ClasificarEdades{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
         int sumaMenorEdad = 0;
        int sumaMayorEdad = 0;
        int contadorMayor = 0;
        int contadorMenor = 0;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese la edad de la persona " + i + ": ");
            int edad = scanner.nextInt();
            if(edad >= 18){
            sumaMayorEdad += edad;
            contadorMayor++;
    } 
            else{
            sumaMenorEdad += edad;
            contadorMenor++;
     }
    }
    double promedioMenores = contadorMenor > 0 ? (double) sumaMenorEdad / contadorMenor : 0;
    double promedioMayores = contadorMayor > 0 ? (double) sumaMayorEdad / contadorMayor : 0;
        
    System.out.println("Promedio de edades de menores de edad: " + promedioMenores);
        
    System.out.println("Promedio de edades de mayores de edad: " + promedioMayores);
    scanner.close();
    }
}
