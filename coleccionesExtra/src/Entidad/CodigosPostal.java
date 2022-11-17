/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author NALDO
 */
public class CodigosPostal {
    
    private String pais;
    private String ciudad;
    private Integer habitantes;

    public CodigosPostal() {
    }

    public CodigosPostal(String pais, String ciudad,Integer habitantes) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.habitantes=habitantes;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Integer getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(Integer habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "CodigosPostal{" + "pais=" + pais + ", ciudad=" + ciudad + ", habitantes=" + habitantes + '}';
    }

    
  
    
    
}
