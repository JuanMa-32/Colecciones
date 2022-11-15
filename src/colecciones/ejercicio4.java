/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import Service.PeliculaService;

/**
 *
 * 
 */
public class ejercicio4 {

    /**
     * 
     */
    public static void main(String[] args) {

        PeliculaService cine = new PeliculaService();
        cine.pedirDatos();
        cine.mostrarLista();
        cine.mayorA1Hora();
        cine.deMayorAMenor();
        cine.deMenorAMayor();
        cine.ordenadasPorTitulo();
        cine.ordenadasPorDirector();
    }
    
}
