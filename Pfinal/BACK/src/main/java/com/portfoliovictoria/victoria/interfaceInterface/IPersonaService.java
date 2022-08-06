package com.portfoliovictoria.victoria.interfaceInterface;

import com.portfoliovictoria.victoria.entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un usuario por id
    public void deletePersona(Long id);
    
    //buscar una persona por id
    public Persona findPersona(Long id);
}
