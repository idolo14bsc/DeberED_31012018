package ec.edu.ister.vista;

import ec.edu.ister.modelo.ListaEnlazada;

/**
 *
 * Nombre: Cristian Calle
 * 8.1 Escribir	un programa que realice	las siguientes tareas:	
	 •  Crear una lista enlazada de números enteros	positivos al azar, donde la inserción	
            se realiza	por el último nodo.	
	 •   Recorrer la lista para mostrar los elementos por pantalla.	
	 •   Eliminar todos los nodos que superen un valor dado.
 */
public class Aplicacion {
    public static void main(String[] args) {
        ListaEnlazada coleccion=new ListaEnlazada();
        coleccion.menu();
    }
 }
