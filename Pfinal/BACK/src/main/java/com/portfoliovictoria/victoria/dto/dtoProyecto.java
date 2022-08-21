
package com.portfoliovictoria.victoria.dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripciónP;

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripciónP) {
        this.nombreP = nombreP;
        this.descripciónP = descripciónP;
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
