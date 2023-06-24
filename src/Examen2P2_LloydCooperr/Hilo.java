package Examen2P2_LloydCooperr;

import java.util.ArrayList;
import javax.swing.JProgressBar;

public class Hilo extends Thread {
    private int duracion;
    private JProgressBar progressBar;
    private Computadora computadora;
    private Tecnicos tecnico;
    private ArrayList<Computadora> computadoras;

    public Hilo(int duracion, JProgressBar progressBar, Computadora computadora, Tecnicos tecnico) {
        this.duracion = duracion;
        this.progressBar = progressBar;
        this.computadora = computadora;
        this.tecnico = tecnico;
        this.computadoras = computadoras;
    }

    @Override
    public void run() {
        int progreso = 0;
        int incremento = 100 / duracion;
        
        while (progreso <= 100) {
            try {
                sleep(1000); // Simula el tiempo de ensamblaje de cada parte (1 segundo)
                progreso += incremento;
                progressBar.setValue(progreso);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
    }

   
}
