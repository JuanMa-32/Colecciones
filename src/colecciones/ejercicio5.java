/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;


import Service.NacionalidadService;


/**
 *
 * @author NALDO
 */
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NacionalidadService n1 = new NacionalidadService();
        n1.ingresarPais();
        n1.eliminarPais();
        n1.ListActual();
    }
    
}
