/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * Nombre: Cristian Calle
 */
public class ListaEnlazada {
     int n ; 
    Nodo inicio;
    Nodo fin;
  
    public ListaEnlazada() {
        inicio=null;
        fin=null;
    }
     public void agregarNodoInicio(int dato){
         Nodo nuevo=new Nodo(dato);
         nuevo.setEnlace(inicio);
         inicio=nuevo;
         if(fin==null)
             fin=nuevo;
    }
  
    public void agregarNodoFinal(int dato){
        Nodo nuevo=new Nodo(dato);
        if(fin!=null){
            fin.setEnlace(nuevo);
            fin=nuevo;
       }
       else{
            fin=nuevo;
            inicio=nuevo;
       }
    }
    public void listaRecorrer(){
        Nodo aux=inicio;
        while(aux!=null){
            System.out.println(aux.getDato());
          aux=aux.getEnlace();
        }
       
    }
   public void eliminarNodos(int numero)
 {
            if(inicio!=null)
            {
  if(inicio.getDato()!=numero)
                {
                    inicio=fin=null;
                }
                else if((inicio==fin)&&(inicio.getDato()!=numero))
  {
                    inicio=inicio.getEnlace();
                }
              
                else
                {
                    Nodo anterior=inicio;
                    Nodo siguiente=inicio.getEnlace();
                    while((siguiente!=null)&&(siguiente.getDato()!=numero))
                    {
                        anterior=siguiente;
                        siguiente=siguiente.getEnlace();
                    }
                    if(siguiente!=null)
                    {
                        anterior.setEnlace(siguiente.getEnlace());
                        if(siguiente==fin)
                        {
                            fin=anterior;
                        }
                    }
                }
            }
        }
   public void imprimir() {
 
        Nodo n;
        n = inicio;
        String acu="";
        while (n != null) {
            acu += n.dato + "  ";
            n = n.enlace;  
        }
        JOptionPane.showMessageDialog(null, acu);
    }
public  void menu(){
    
    int op;
    
    do {   
        
       op=Integer.parseInt( JOptionPane.showInputDialog("menu"
               +"\n1.Agregar al Inicio\n"
               + "2. Agregar al Final\n"
               + "3. Recorrer \n"
               + "4. Borar \n"
               + "5.- Imprimir \n"
               + "6.- SALIR \n"
               + "Ingrese la Opcion:  \n"));
        
       switch(op){
            case 1:
               agregarNodoInicio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor")));
               break; 
           case 2:
               agregarNodoFinal(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor")));
               break;
           case 3:
               listaRecorrer();
               break;
           case 4:
               eliminarNodos(Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor")));
               break;
           case 5:
               imprimir();
               
          
       }       
    }while (op!=6); 
}
    

}
