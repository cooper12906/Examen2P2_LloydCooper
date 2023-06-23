package Examen2P2_LloydCooperr;

public class Procesador extends Parte {
    private int numeroNucleos;
    private String velocidad;

    public Procesador(int numeroNucleos, String velocidad, int tiempoEnsamblaje) {
        super(tiempoEnsamblaje);
        this.numeroNucleos = numeroNucleos;
        this.velocidad = velocidad;
    }

    public int getNumeroNucleos() {
        return numeroNucleos;
    }

    public void setNumeroNucleos(int numeroNucleos) {
        this.numeroNucleos = numeroNucleos;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Procesador{" + "numeroNucleos=" + numeroNucleos + ", velocidad=" + velocidad + '}';
    }
    
    
}
