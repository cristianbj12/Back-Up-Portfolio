package com.portfolio.cb.Interface;

import com.portfolio.cb.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un obejto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
}

