/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Extras;

import Service.CodigosPostalesService;

/**
 *
 * @author NALDO
 */
public class extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CodigosPostalesService cs = new CodigosPostalesService();
        cs.ingresarCodigos();
        cs.mostrar();
    }
    
}
