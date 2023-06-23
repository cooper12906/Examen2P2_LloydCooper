package Examen2P2_LloydCooperr;

public class Parte {
    private int tiempoEnsamblaje;

    public Parte(int tiempoEnsamblaje) {
        this.tiempoEnsamblaje = tiempoEnsamblaje;
    }

    public int getTiempoEnsamblaje() {
        return tiempoEnsamblaje;
    }

    public void setTiempoEnsamblaje(int tiempoEnsamblaje) {
        this.tiempoEnsamblaje = tiempoEnsamblaje;
    }

    @Override
    public String toString() {
        return "Parte{" + "tiempoEnsamblaje=" + tiempoEnsamblaje + '}';
    }    
}
