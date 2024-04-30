/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menu;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class Menu {
private RegistroAutomovil registro;
private Scanner scanner;

    
public Menu() {
this.registro = new RegistroAutomovil();
this.scanner = new Scanner(System.in);
}

public void mostrarMenu() {
int opcion;
do {
System.out.println("\nMenu Principal:");
System.out.println("1-Crear un registro de automovil");
System.out.println("2-Buscar un registro de automovil");
System.out.println("3-Editar un registro de automovil");
System.out.println("4-Salir");
System.out.print("Ingrese el numero de opción: ");
opcion = scanner.nextInt();

switch (opcion) {
case 1:
System.out.println("Ingrese el ID del automóvil:");
int id = scanner.nextInt();
scanner.nextLine(); 
System.out.println("Ingrese la marca del automóvil:");
String marca = scanner.nextLine();
System.out.println("Ingrese el modelo del automovil:");
String modelo = scanner.nextLine();
System.out.println("Ingrese el año del automovil:");
int año = scanner.nextInt();
scanner.nextLine(); 
System.out.println("Ingrese el tipo del automovil:");
String tipo = scanner.nextLine();
System.out.println("Ingrese el numero de chasis del automovil:");
String numeroChasis = scanner.nextLine();
System.out.println("Ingrese el color del automvil:");
String color = scanner.nextLine();                  

Automovil automovil = new Automovil(id, marca, modelo, año, tipo, numeroChasis, color);
registro.agregarAutomovil(automovil);
System.out.println("Registro de automovil creado correctamente.");
break;
    case 2:
 // buscar  registro del auto
    break;
    case 3:
 // editar registro de auto
    break;
    case 4:
    System.out.println("Saliendo del programa");
    break;
    default:
    System.out.println("Opcion no valida. Ingrese un numero valido.");
 }
} 
while (opcion != 4);
  }
public static void main(String[] args){
Menu menu = new Menu();
menu.mostrarMenu();
  }
}