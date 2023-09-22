/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanflores;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Cliente extends Usuario     {
   
    private ArrayList<Cancion> canciones= new ArrayList();
    private ArrayList<ListaReproduccion>creadas = new ArrayList();   
    private ArrayList<ListaReproduccion>Megusta = new ArrayList();   

    public Cliente(String username, String contraseña, int edad) {
        super(username, contraseña, edad);
    }

    public Cliente() {
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<ListaReproduccion> getCreadas() {
        return creadas;
    }

    public void setCreadas(ArrayList<ListaReproduccion> creadas) {
        this.creadas = creadas;
    }

    public ArrayList<ListaReproduccion> getMegusta() {
        return Megusta;
    }

    public void setMegusta(ArrayList<ListaReproduccion> Megusta) {
        this.Megusta = Megusta;
    }

    @Override
    public String toString() {
        return super.getUsername();
    }
    
    public void edad(int edad){
        
        
    }
    
}
