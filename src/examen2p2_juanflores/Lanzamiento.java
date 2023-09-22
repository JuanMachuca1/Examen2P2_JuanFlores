package examen2p2_juanflores;


import java.util.Date;


public class Lanzamiento {
    private String tituloPubli;
    private String fechaLanza;
    private  int likes;

    public Lanzamiento(String tituloPubli, String fechaLanza, int likes) {
        this.tituloPubli = tituloPubli;
        this.fechaLanza = fechaLanza;
        this.likes = likes;
    }

    public String getTituloPubli() {
        return tituloPubli;
    }

    public void setTituloPubli(String tituloPubli) {
        this.tituloPubli = tituloPubli;
    }

    public String getFechaLanza() {
        return fechaLanza;
    }

    public void setFechaLanza(String fechaLanza) {
        this.fechaLanza = fechaLanza;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return tituloPubli;
    }
    
    
}
