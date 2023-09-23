/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_juanflores;

import javax.swing.JProgressBar;


public class Hilo extends Thread{
    
    private JProgressBar barra;
    private int segundos;

    public Hilo(JProgressBar barra) {
        this.barra = barra;
    }

    public Hilo(JProgressBar barra, int segundos) {
        this.barra = barra;
        this.segundos = segundos;
    }

    
    
    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }
    
    
    
    
    
    public void run() {
        // El código que se ejecutará en el hilo debe ir en este método
        for (int i = 1; i <= segundos; i++) {
            
            try {
                Thread.sleep(1000); // Duerme el hilo durante 1 segundo (1000 ms)
            } catch (InterruptedException e) {
                
            }
        }
        
    }
    
    
}
