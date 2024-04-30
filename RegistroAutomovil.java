/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

/**
 *
 * @author USUARIO
 */
import java.util.ArrayList;
public class RegistroAutomovil{
private ArrayList<Automovil> listaAutomoviles;
    public RegistroAutomovil(){
    this.listaAutomoviles = new ArrayList<>();
 }
   
public void agregarAutomovil(Automovil automovil){
listaAutomoviles.add(automovil);
}
}
