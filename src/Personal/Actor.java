/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import java.util.*;
import seriestv.Episodio;

/**
 *
 * @author rpalmieri
 */
public class Actor extends Persona {
    
    private String rol;    
    public String NombrePersonaje;    
    private List<Episodio> actuaciones;
    
    public Actor(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        actuaciones = new ArrayList<Episodio>();
    }
    //Principal, Secundario, Extra
    public void SetRol(String r){
        this.rol = r;
    }
    public String GetRol(){
        return this.rol;
    }
    
    public void AgregarEpisodio(Episodio e){
        actuaciones.add(e);
    }
    
    public List<Episodio> GetActuaciones(){
        return actuaciones;
    }
}
