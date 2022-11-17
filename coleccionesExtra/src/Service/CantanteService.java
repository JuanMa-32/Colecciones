/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NALDO
 * Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5
objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada
cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
cambios. 
 */
public class CantanteService {
    
    private  List <CantanteFamoso> listCantantes;
    private  Scanner leer;

    public CantanteService() {
        listCantantes = new ArrayList();
        leer = new Scanner (System.in).useDelimiter("\n");
    }
    
    public void ingresarCantantes(){
        
        int cont=0;
        
        do{
            System.out.println("Ingrese un cantante: ");
            String cantante = leer.next();
            System.out.println("Ingrese su disco mas vendido");
            String disco = leer.next();
            listCantantes.add(new CantanteFamoso(cantante,disco));
                    cont++;
        }while(cont<5);
    }
    
    public void mostrar(){
        for (CantanteFamoso aux : listCantantes) {
            System.out.println(aux);
        }
    }
    
    public void agregarCantante(){
            System.out.println("Ingrese un cantante: ");
            String cantante = leer.next();
            System.out.println("Ingrese su disco mas vendido");
            String disco = leer.next();
            listCantantes.add(new CantanteFamoso(cantante,disco));
    }
    
    public void eliminarCantante(){
        
        System.out.println("ingresar el cantante que quiere eliminar: ");
        String eliminar=leer.next();
        
       Iterator <CantanteFamoso> it = listCantantes.iterator();
       
       while(it.hasNext()){
           
           String aux = it.next().getNombre();
           if (aux.equals(eliminar)){
               it.remove();
           }
       }
    }
    
    public void menu(){
        
     boolean flag=true;
        
        do{
           
            System.out.println("-----MENU-----");
            System.out.println("1- Agregar un cantante\n"
            +"2- Mostrar todos los cantantes\n"
                    + "3- Eliminar un cantante\n"
                    + "4- Salir\n");
            int opc=leer.nextInt();
            
            switch(opc){
                case 1:
                  agregarCantante();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                     eliminarCantante();
                     break;
                case 4:
                    System.out.println("SALIENDO...");
                    flag=false;
            }
        }while(flag);
    }
}
