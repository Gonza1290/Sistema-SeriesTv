/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriestv;

import Personal.Escritor;
import Personal.Director;
import Personal.Actor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rpalmieri
 */
public class Episodio {
    private final int numero;
    private final String nombre;
    private int duracionMinutos;
    private String trama;
    private final Date fechaLanzamiento;
    private List<Escritor> escritores;
    private List<Actor> elenco;
    private Director dirigidoPor;
    private Temporada pertenece;
    
    public Episodio(int n, String nom, Date f, Temporada t){
        numero = n;
        nombre = nom;
        fechaLanzamiento = f;
        pertenece = t;
        escritores = new ArrayList<Escritor>();
        elenco = new ArrayList<Actor>();
    }
    
    public String GetDuracion(){
        int hor, min, seg;
        hor = (duracionMinutos / 3600);
        min = ((duracionMinutos - hor * 3600) / 60);
        seg = duracionMinutos - (hor * 3600 + min * 60);
        return hor + ":" + min + ":" + seg;
    }
    
    public void SetDuracion(int minutos){
        this.duracionMinutos = minutos;
    }
    
    public void SetTrama(String t){
        this.trama = t;
    }
    
    public String GetTrama(){
        return this.trama;
    }
    
    public int GetNumero(){
        return this.numero;
    }
    
    public Date GetFecha(){
        return this.fechaLanzamiento;
    }
    
    public String GetNombre(){
        return this.nombre;
    }
    
    public void AgregarEscritor(Escritor e){
        this.escritores.add(e);
    }
    
    public void AgregarActor(Actor a){
        this.elenco.add(a);
    }
    
    public void SetDirector(Director d){
        this.dirigidoPor =d;
    }
    
    public void MostrarDirector(){
        System.out.println("El director es: " + this.dirigidoPor.GetNombreCompleto());
    }
    
    public void MostrarActores(){
        System.out.println("Los actores son: ");
        for (Actor actor : elenco) {
            System.out.println(actor.GetNombreCompleto() + " -- " + actor.GetRol());
        }
    }
    
    public void MostrarEscritores(){
        System.out.println("Los escritores son: ");
        for (Escritor es : escritores) {
            System.out.println(es.GetNombreCompleto());
        }
    }
}
