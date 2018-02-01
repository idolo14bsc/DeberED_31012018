/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

/**
 *
 * Nombre: Cristian Calle
 */
public class Nodo {
     int dato;
     Nodo enlace;
   
    public Nodo(int dato){
        this.dato=dato;
        this.enlace=null;
    }
    public Nodo(int dato, Nodo siguiente){
        this.dato=dato;
        this.enlace=siguiente;
  
    }

    public float getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo siguiente) {
        this.enlace= siguiente;
    }
    

}
