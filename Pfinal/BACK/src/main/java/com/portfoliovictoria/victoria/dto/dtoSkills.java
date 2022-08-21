
package com.portfoliovictoria.victoria.dto;

import javax.validation.constraints.NotBlank;


public class dtoSkills {
    @NotBlank
    private String nombreS;
    @NotBlank
    private String porcentajeS;

    public dtoSkills() {
    }

    public dtoSkills(String nombreS, String porcentajeS) {
        this.nombreS = nombreS;
        this.porcentajeS = porcentajeS;
    }

    public String getNombreS() {
        return nombreS;
    }

    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }

    public String getPorcentajeS() {
        return porcentajeS;
    }

    public void setPorcentajeS(String porcentajeS) {
        this.porcentajeS = porcentajeS;
    }
    
    
}
