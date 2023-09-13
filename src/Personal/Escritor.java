/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;

import Personal.Persona;
import java.util.*;
import seriestv.Episodio;

/**
 *
 * @author rpalmieri
 */
public class Escritor extends Persona{
    private int cantidadLibros;
    private List<Episodio> escritos;
    
    public Escritor(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        escritos = new ArrayList<Episodio>();
    }
    
    public void SetCantidadLibros(int cant){
        cantidadLibros = cant;
    }
    
    public int GetCantidadLibros(){
        return cantidadLibros;
    }
    
    public void AgregarEpisodio(Episodio e){
        escritos.add(e);
    }
    
}
