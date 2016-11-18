/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.ingesoft.desarrollo.sistemaEgresado.persistencia.modelo.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Cristian Sinisterra
 */
@Entity
@Table(name="T_PAIS")
public class Pais implements  Serializable{
    
    @Id
    @Column (name="ID_PAIS")
    private int codigoPais;
    
    @Column(name="PAIS")
    private String pais;
    
    public Pais(){
        
    }

    public Pais(int codigoPais, String pais) {
        this.codigoPais = codigoPais;
        this.pais = pais;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return pais;
    }
    
    
    
}
