/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Raza;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class RazaService {
      
       List<Raza> listaRaza = new ArrayList();
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       
    public void crearR(){
       
    
        
        
        boolean flag = false;
     
      
      
       
       
        do{
        
            System.out.println(" ¿quiere ingrese una Raza Perro? SI/NO ");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("Si")){
                System.out.println("Ingrese una raza: ");
                añadir();
                
            } else if (opcion.equalsIgnoreCase("No")){
                flag = true;
            } else{
                System.out.println("Ingreso mal la opcion");
            }
        }while(flag == false);
     
      
        
    }
    
   public void añadir(){
       Raza r1= new Raza(leer.next());
    listaRaza.add(r1);
     
    }
    public void mostrar(){
        
         for (Raza aux: listaRaza) {
             System.out.println(aux);
        }
    }
    
    public void eliminar (){

        

        
        for (int i = 0; i < listaRaza.size(); i++) {

              
             System.out.println("desea eliminar una raza?SI/NO");
            String opcion = leer.next();
            
            if (opcion.equals("si")) {
                
                 System.out.println("ingrese la raza que quiere eliminar: ");
                 String razaEliminar = leer.next();
                
               
                 Raza m = listaRaza.get(i);
                 listaRaza.remove(m);
                 
            } else {
                break;
            }
        }
        mostrar();
      
        
        
    }
}
