
package com.portfoliovictoria.victoria.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripciónP;

    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripciónP) {
        this.nombreP = nombreP;
        this.descripciónP = descripciónP;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripciónP() {
        return descripciónP;
    }

    public void setDescripciónP(String descripciónP) {
        this.descripciónP = descripciónP;
    }
    
    
}
