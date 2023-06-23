package Examen2P2_LloydCooperr;

public class Pantalla extends Parte {
    private boolean tactil;
    private String tipo;

    public Pantalla(boolean tactil, String tipo, int tiempoEnsamblaje) {
        super(tiempoEnsamblaje);
        this.tactil = tactil;
        this.tipo = tipo;
    }

    public boolean isTactil() {
        return tactil;
    }

    public void setTactil(boolean tactil) {
        this.tactil = tactil;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
