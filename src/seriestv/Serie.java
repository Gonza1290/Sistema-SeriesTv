/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriestv;

import java.util.*;

/**
 *
 * @author rpalmieri
 */
public class Serie {
    private String nombre;
    private String genero;
    private List<Temporada> temporadas;
    
    public String Descripcion;
    
    public Serie(String n, String g){
        nombre = n;
        genero = g;
        temporadas = new ArrayList<Temporada>();
    }
    
    public void SetNombre(String n){
        nombre = n;
    }
    
    public String GetNombre(){
        return nombre;
    }
    
    public void SetGenero(String g){
        genero = g;
    }
    
    public String GetGenero(){
        return genero;
    }
    
    public void AgregarTemporada(Temporada t){
        this.temporadas.add(t);
    }
    
    public void MostrarEpisodios(){
        System.out.println("SERIE: " + nombre);
        
        for (Temporada temporada : temporadas) {
            System.out.println("Temporada: "+ temporada.GetNumero());
            for (Episodio episodio : temporada.GetEpisodios()) {
                System.out.println("Episodio: "+ episodio.GetNumero() +" - " + episodio.GetNombre());
            }
        }
    }
}
