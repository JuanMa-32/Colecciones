/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.CodigosPostal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author NALDO
 * • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
• Muestra por pantalla los datos introducidos
• Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• Muestra por pantalla los datos
• Agregar una ciudad con su código postal correspondiente más al HashMap.
• Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• Muestra por pantalla los datos
 */
public class CodigosPostalesService {
    
    Map<Integer,CodigosPostal> codigos = new HashMap();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void ingresarCodigos(){
        
        for (int i = 0; i < 2; i++) {
            CodigosPostal c1 = new CodigosPostal();
            System.out.println("Ingrese su pais");
            c1.setPais(leer.next());
            System.out.println("Ingrese su ciudad");
            c1.setCiudad(leer.next());
            System.out.println("Ingrese la cantidad de habitantes ");
            c1.setHabitantes(leer.nextInt()); 
            System.out.println("ingrese su codigo postal");
            int codigoP = leer.nextInt();
            codigos.put(codigoP, c1);
        }
    }
    
    public void mostrar(){
        
        for (Map.Entry<Integer, CodigosPostal> entry : codigos.entrySet()) {
            Integer key = entry.getKey();
            CodigosPostal value = entry.getValue();
            System.out.println(key+" "+value);
        }
    }
}
