package Examen2P2_LloydCooperr;

public class Hilo extends Thread {
    private int duracion;
    private JProgressBar progressBar;
    private Computadora computadora;
    private Tecnicos tecnico;

    public Hilo(int duracion, JProgressBar progressBar, Computadora computadora, Tecnicos tecnico) {
        this.duracion = duracion;
        this.progressBar = progressBar;
        this.computadora = computadora;
        this.tecnico = tecnico;
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

        if (fallaEnsamblaje()) {
            // Manejo de falla en el ensamblaje
            System.out.println("Computadora " + computadora + " y técnico " + tecnico + " no se pudo armar");
        } else {
            // Computadora ensamblada correctamente
            System.out.println("Computadora " + computadora + " ensamblada exitosamente por el técnico " + tecnico);
        }
    }

    private boolean fallaEnsamblaje() {
        // Lógica para determinar si se produce una falla en el ensamblaje basada en los porcentajes establecidos
        int numComputadoras = frameMain.computadoras.size(); // Obtén la cantidad de computadoras ensambladas hasta el momento
        
        if (numComputadoras >= 1 && numComputadoras <= 5) {
            return Math.random() <= 0.3;
        } else if (numComputadoras >= 6 && numComputadoras <= 15) {
            return Math.random() <= 0.22;
        } else if (numComputadoras >= 16 && numComputadoras <= 30) {
            return Math.random() <= 0.13;
        } else {
            return Math.random() <= 0.07;
        }
    }
}
