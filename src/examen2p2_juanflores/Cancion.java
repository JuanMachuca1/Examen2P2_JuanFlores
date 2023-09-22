/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanflores;

/**
 *
 * @author JD
 */
public class Cancion {
    private String nombre;
    private double tiempo;
    private Lanzamiento referencia;

    public Cancion(String nombre, double tiempo, Lanzamiento referencia) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public Lanzamiento getReferencia() {
        return referencia;
    }

    public void setReferencia(Lanzamiento referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
