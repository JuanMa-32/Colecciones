/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author NALDO
 */
public class TiendaService {
    /**
    Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
* */
    private   Map <String,Integer> productos;
    private Scanner leer;

    public TiendaService() {
        productos=new HashMap();
        leer=new Scanner(System.in).useDelimiter("\n");
    }
     
     
    public void IntroducirProducto(){
    
        System.out.println("-----INGRESE UN PRODUCTO AL SISTEMA----- ");
        
        System.out.println("NOMBRE:");
        String nombre= leer.next();
        System.out.println("PRECIO: ");
        int precio=leer.nextInt();
        
        productos.put(nombre, precio);
     
    }
    
    public void modificarPrecio(){
        
        System.out.println("ingrese el producto para modificar su precio: ");
        String cambio = leer.next();
        
        if (productos.containsKey(cambio)){
            System.out.println("NUEVO PRECIO: ");
            int newPrecio=leer.nextInt();
            productos.replace(cambio, newPrecio);
        }else{
            System.out.println("este producto no esta en la lista");
        }
    }
    
    public void eliminarProducto(){
       
        System.out.println("ingrese el producto para eliminar: ");
        String eliminar = leer.next();

        if (productos.containsKey(eliminar)) {
         productos.remove(eliminar);
        } else {
            System.out.println("este producto no esta en la lista");
        }
    }
    
    public void productos(){
        
      
         System.out.println("---STOCK--- ");
        
         for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
             System.out.println("PRODUCTO: "+key+"\n"
                     +"PRECIO:" +value);
        }
 
    }
    
    public void menu(){
        
        boolean flag=true;
        do{
            System.out.println("-----MENU-----");
            System.out.println("1- Ingresar un producto\n"
            +"2- Modificar precio\n"
                    + "3- Eliminar producto\n"
                    + "4- Mostrar catalogo\n"
                    + "5- Salir ");
            int opc=leer.nextInt();
            
            switch(opc){
                case 1:
                   IntroducirProducto();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                     eliminarProducto();
                     break;
                case 4:
                    productos();
                    break;
                case 5:
                    System.out.println("SALIENDO...");
                    flag=false;
            }
        }while(flag);
    }
    
    
}
