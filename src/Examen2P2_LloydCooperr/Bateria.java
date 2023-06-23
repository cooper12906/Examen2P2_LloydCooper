package Examen2P2_LloydCooperr;

public class Bateria extends Parte {
    private String capacidadHoras;
    private String material;

    public Bateria(String capacidadHoras, String material, int tiempoEnsamblaje) {
        super(tiempoEnsamblaje);
        this.capacidadHoras = capacidadHoras;
        this.material = material;
    }

    public String getCapacidadHoras() {
        return capacidadHoras;
    }

    public void setCapacidadHoras(String capacidadHoras) {
        this.capacidadHoras = capacidadHoras;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    
    
}
