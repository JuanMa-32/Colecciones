/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author NALDO
 * se creará  un HashSet de tipo Libro que guardará todos los libros creados.
En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario todos sus
datos y los seteandolos en el Libro. Despues, ese Libro se guarda en el conjunto y se le
pregunta al usuario si quiere crear otro Libro o no.
La clase Librería contendrá además los siguientes métodos:
 */
public class LibroService {
    
     private Set <Libro> libreria;
     private Scanner leer;

    public LibroService() {
        libreria = new HashSet();
        leer = new Scanner (System.in).useDelimiter("\n");
    }
    
    public void crearLibros(){
        
        String opc="";
        do{
            Libro l1 = new Libro();
            System.out.println("Ingrese el titulo del libro");
            l1.setTiutlo(leer.next());
            System.out.println("Ingrese el nombre del autor");
            l1.setAutor(leer.next());
            System.out.println("Ingrese la cantidad de ejemplares");
            l1.setnEjemplares(leer.nextInt());
            l1.setEjemplaresPrestados(0);
           
            
            libreria.add(l1);
            
            System.out.println("¿DESEA INGRESAR OTRO LIBRO? SI/NO");
            opc=leer.next();
            
        }while(opc.equalsIgnoreCase("SI"));
    }
    
    public void prestamo() {

        System.out.println("Ingrese el libro que quiere llevar");
        String libroP = leer.next();

        for (Libro aux : libreria) {
            if (aux.getTiutlo().equals(libroP) && aux.getnEjemplares() >= aux.getEjemplaresPrestados()) {

                aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() + 1);
                aux.setnEjemplares(aux.getnEjemplares()-1);
            }
        }

    }

     public void devolver() {

        System.out.println("Ingrese el libro que quiere devolver");
        String libroP = leer.next();

        for (Libro aux : libreria) {
            if (aux.getTiutlo().equals(libroP) && aux.getEjemplaresPrestados() > 0) {

                aux.setEjemplaresPrestados(aux.getEjemplaresPrestados() - 1);
                 aux.setnEjemplares(aux.getnEjemplares()+1);
            }
        }

    }
     
     public void Mostrar(){
         
         for (Libro aux : libreria) {
             System.out.println(aux);
         }
     }
     
    public void menu() {

        boolean flag = true;

        do {

            System.out.println("-----MENU-----");
            System.out.println("1- Agregar Libros\n"
                    + "2- Prestar un libro\n"
                    + "3- Devolver un Libro\n"
                    + "4- Salir\n");
            int opc = leer.nextInt();

            switch (opc) {
                case 1:
                    crearLibros();
                    break;
                case 2:
                    prestamo();
                    break;
                case 3:
                    devolver();
                    break;
                case 4:
                    System.out.println("SALIENDO...");
                    flag = false;
            }
        } while (flag);
    }
     
}
