/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Artistas extends Usuario{
    private String nombreArtistico;
    private ArrayList<Cancion>canciones = new ArrayList();
    private ArrayList<Album>albumes = new ArrayList();

    public Artistas(String nombreArtistico, String username, String contraseña, int edad) {
        super(username, contraseña, edad);
        this.nombreArtistico = nombreArtistico;
    }

    public Artistas(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return nombreArtistico;
    }
    
    
    
    public void edad(int edad){
        
        
    }
    
}
