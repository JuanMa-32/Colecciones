/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class extra1 {

    /**
     * @param args the command line arguments
     * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        List <Integer> listNums = new ArrayList<>();
        
        boolean flag= true;
        
        do{
            System.out.println("ingrese un valor a la lista de numeros: ");
            int n = leer.nextInt();
            listNums.add(n);
            
            if(n==-99){
                flag=false;
               // int indice = listNums.indexOf(n);
                //listNums.remove(indice);
                listNums.remove(n);
            }
            
        }while(flag);
        
     
       /* 
        Iterator it = listNums.iterator();
        
        while(it.hasNext()){
            
            if(it.next().equals(-99)){
                it.remove();
            }
        }
        */
        for (Integer aux : listNums) {
            System.out.println(aux);
        }
        
        
    }
    
    
    
}
