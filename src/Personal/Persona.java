/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;
/**
 *
 * @author rpalmieri
 */
public abstract class Persona {
    private final String nombre;
    private final String apellido;
    private final int edad;
    
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;                
    }
    
    public String GetNombreCompleto(){
        return apellido + ", " + nombre;
    }
    
    public int GetEdad(){
        return edad;
    }
    
}
