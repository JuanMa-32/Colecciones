/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Nacionalidad;




import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author NALDO
 */
public class NacionalidadService {
    
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    Set<Nacionalidad> paises= new TreeSet(); 
        
    public void ingresarPais(){
  
        String flag;
     
        do{
          
            Nacionalidad pais1 = new Nacionalidad();
              System.out.println("Ingrese un pais: ");
              pais1.setPais(leer.next());
              paises.add(pais1);
            
            System.out.println("Quiere ingresar otro pais? S/N");
            flag=leer.next();
            
        }while(flag.equalsIgnoreCase("S"));
        
        System.out.println("TODOS LOS PAISES INGRESADOS:");
        for (Nacionalidad var : paises) {
            System.out.println(var);
        }
 
        
        
     
     
    }
    
    public void eliminarPais(){
   
        Iterator<Nacionalidad> it= paises.iterator();
        System.out.println("que pais desea eliminar: ");
        String eliminar= leer.next();
        boolean flag = true;
        
        while(it.hasNext()){
            String aux = it.next().getPais();
            if(aux.equals(eliminar)){
                it.remove();
                flag=false;
              
            }
        }
        if (flag){
            System.out.println("ESTE PAIS NO SE ENCUENTRA EN LA LISTA");
        }
    }  
    
    public void ListActual(){
        
        System.out.println("LISTA FINAL: ");
        for (Nacionalidad var : paises) {
            System.out.println(var);
        }
    }
         
}
