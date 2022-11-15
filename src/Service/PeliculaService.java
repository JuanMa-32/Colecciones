/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidades.Pelicula;
import comparadores.comparadorEJ4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

22

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class PeliculaService {
    
    ArrayList<Pelicula> listPeliculas = new ArrayList();
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    public void pedirDatos(){
        
       
        
        boolean flag = false;
        
        do{
             Pelicula p1 = new Pelicula();
        System.out.println("------BIENVENIDO AL CINE------");
        System.out.println("Ingresar titulo: ");
        p1.setTitulo(leer.next());
        System.out.println("Ingresar Director: ");
        p1.setDirector(leer.next());
        System.out.println("Ingresar duracion (En horas): ");
        p1.setDuracion(leer.nextInt());
        
        listPeliculas.add(p1);
        
        System.out.println("¿QUIERE INGRESAR OTRA PELICULA? SI/NO");
        String opc = leer.next();
        
        if (opc.equalsIgnoreCase("SI")){
            flag=true;
        }else{
            flag=false;
            System.out.println("SALIENDO...");
        }
        }while(flag);
        
        
    }
    
    public void mostrarLista(){
        
        System.out.println("-----CARTELERA-----");
        for (Pelicula aux : listPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void mayorA1Hora(){
        
        System.out.println("");
        System.out.println("PELICULAS CON DURACION MAYOR A 1 HORA: ");
        for (int i = 0; i < listPeliculas.size(); i++) {
            if (listPeliculas.get(i).getDuracion()>1){
                System.out.println(listPeliculas.get(i));
            }
        }
    }
    
    public void deMayorAMenor(){
        System.out.println("");
        System.out.println("PELICULAS ORDENADAS DE MAYOR A MENOR POR DURACION: ");
        Collections.sort(listPeliculas, comparadorEJ4.ordenarDesendente);
        
        for (Pelicula aux : listPeliculas) {
            System.out.println(aux);
        }
        
    }
    
    public void deMenorAMayor(){
        System.out.println("");
        System.out.println("PELICULAS ORDENADAS DE MENOR A MAYOR POR DURACION: ");
        Collections.sort(listPeliculas, comparadorEJ4.ordenarAsendente);
        
        for (Pelicula aux : listPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void ordenadasPorTitulo(){
        System.out.println("");
        System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR TITULO: ");
        
        Collections.sort(listPeliculas, comparadorEJ4.ordenarPorTitulo);
        
        for (Pelicula aux : listPeliculas) {
            System.out.println(aux);
        }
    }
    
    public void ordenadasPorDirector(){
        System.out.println("");
        System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR SU DIRECTOR: ");
        Collections.sort(listPeliculas, comparadorEJ4.ordenarPorDirector);
        
        for (Pelicula aux : listPeliculas) {
            System.out.println(aux);
        }
    }
    
    
}
