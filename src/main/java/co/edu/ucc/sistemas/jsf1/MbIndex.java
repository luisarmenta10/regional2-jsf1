/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.ucc.sistemas.jsf1;

import java.util.LinkedList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Luis Armenta
 */
@ManagedBean
@ViewScoped
public class MbIndex {

   private Persona persona;
   private List<Persona> personas;
   
   @PostConstruct
   public void init(){
       persona= new Persona();
       personas= new LinkedList<>();
   }
   public String agregar(){
       personas.add(persona);
       persona=new Persona();
       return null;
   }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
   
}

