/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion;

import Personal.Escritor;
import Personal.Actor;
import java.util.Date;
import seriestv.Episodio;
import seriestv.Serie;
import seriestv.Temporada;

/**
 *
 * @author rpalmieri
 */
public class SeriesTV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Serie got = new Serie("Game Of Thrones", "Fantasia");
        Temporada s1 =  new Temporada(2011, 1);
        got.AgregarTemporada(s1);
        Episodio e1 = new Episodio(1, "Winter is Coming", new Date(), s1);
        s1.AgregarEpisodio(e1);
        
        Actor peter = new Actor("Peter", "Dinklage",48);
        peter.NombrePersonaje = "Tyrion Lannister";
        peter.SetRol("Principal");
        e1.AgregarActor(peter);
        
        Escritor george = new Escritor("George","Martin",70);
        e1.AgregarEscritor(george);
        george.AgregarEpisodio(e1);
        //muestra todos los episodios de una serie
        got.MostrarEpisodios();
        
        //muestra los actores de un episodio
        e1.MostrarActores();
        
        //muestra los escritores de un episodio
        e1.MostrarEscritores();
    }
    
}
