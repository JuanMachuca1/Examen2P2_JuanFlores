/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanflores;

/**
 *
 * @author JD
 */
public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single(Cancion cancion, String tituloPubli, String fechaLanza, int likes) {
        super(tituloPubli, fechaLanza, likes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return super.getTituloPubli();
    }
    
    
}
