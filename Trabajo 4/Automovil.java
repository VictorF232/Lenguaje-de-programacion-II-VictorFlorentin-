/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

/**
 *
 * @author USUARIO
 */
import com.mycompany.menu.Automovil;
public class Automovil{
private int id;
private String marca;
private String tipo;
private String numeroChasis;
private String color;
private String modelo;
private int año;




public Automovil(int id, String marca, String modelo, int año, String tipo, String numeroChasis, String color){
this.id = id;
this.año = año;
this.tipo = tipo;
this.marca = marca;
this.modelo = modelo;
this.color = color;
this.numeroChasis = numeroChasis;
}
}