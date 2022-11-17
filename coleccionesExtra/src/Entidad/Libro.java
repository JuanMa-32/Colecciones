/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Objects;

/**
 *
 * @author NALDO
 * La clase Libro debe guardar el título del libro,
autor, número de ejemplares y número de ejemplares prestados
 */
public class Libro {
    
    private String tiutlo;
    private String autor;
    private Integer nEjemplares;
    private Integer ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String tiutlo, String autor, Integer nEjemplares, Integer ejemplaresPrestados) {
        this.tiutlo = tiutlo;
        this.autor = autor;
        this.nEjemplares = nEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

   

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getnEjemplares() {
        return nEjemplares;
    }

    public void setnEjemplares(Integer nEjemplares) {
        this.nEjemplares = nEjemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getTiutlo() {
        return tiutlo;
    }

    public void setTiutlo(String tiutlo) {
        this.tiutlo = tiutlo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.tiutlo, other.tiutlo)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Libro" + "tiutlo=" + tiutlo + ", autor=" + autor + ", nEjemplares=" + nEjemplares + ", ejemplaresPrestados=" + ejemplaresPrestados ;
    }
    

  
    
    
}
