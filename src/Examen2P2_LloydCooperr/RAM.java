package Examen2P2_LloydCooperr;

public class RAM extends Parte {
    private int tam;
    private String marca;

    public RAM(int tam, String marca, int tiempoEnsamblaje) {
        super(tiempoEnsamblaje);
        this.tam = tam;
        this.marca = marca;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "RAM{" + "tam=" + tam + ", marca=" + marca + '}';
    } 
}

  
