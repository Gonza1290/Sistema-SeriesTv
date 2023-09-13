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
public class Director extends Persona {
    private List<Episodio> dirige;
    public Director(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        dirige = new ArrayList<Episodio>();
    }
    
    public void AgregarDireccion(Episodio e){
        dirige.add(e);
    }
}
