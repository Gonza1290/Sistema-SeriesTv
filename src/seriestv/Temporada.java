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
public class Temporada {
    private int numero;
    private int año;
    private List<Episodio> episodios;
    
    public Temporada(int a, int nro){
        año = a;
        numero =  nro;
        episodios = new ArrayList<Episodio>();
    }
    
    public void AgregarEpisodio(Episodio e){
        episodios.add(e);
    }
    
    public int GetNumero(){
        return  numero;
    }
    
    public List<Episodio> GetEpisodios(){
        return episodios;
    }
}
