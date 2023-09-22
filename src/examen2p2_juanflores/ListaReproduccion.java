/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanflores;

import java.util.ArrayList;


public class ListaReproduccion {
    private String nombreU;
    private int conteoLike;
    private ArrayList<Cancion>canciones = new ArrayList(); 

    public ListaReproduccion(String nombreU, int conteoLike) {
        this.nombreU = nombreU;
        this.conteoLike = conteoLike;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public int getConteoLike() {
        return conteoLike;
    }

    public void setConteoLike(int conteoLike) {
        this.conteoLike = conteoLike;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombreU;
    }
    
    
}
