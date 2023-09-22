/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanflores;

import java.util.ArrayList;


public class Album extends Lanzamiento {
   private ArrayList<Cancion>cancione = new ArrayList(); //propias
    private int canciones;

    public Album(int canciones, String tituloPubli, String fechaLanza, int likes) {
        super(tituloPubli, fechaLanza, likes);
        this.canciones = canciones;
    }

    public ArrayList<Cancion> getCancione() {
        return cancione;
    }

    public void setCancione(ArrayList<Cancion> cancione) {
        this.cancione = cancione;
    }

    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return super.getTituloPubli();
    }
    
    
}
