/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author NALDO
 */
public class Nacionalidad implements Comparable<Nacionalidad> {

    private String pais;

    public Nacionalidad() {
    }

    public Nacionalidad(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "  PAIS= " + pais;
    }

    
    @Override
    public int compareTo(Nacionalidad t) {
        return this.pais.compareTo(t.getPais());
    }

}
