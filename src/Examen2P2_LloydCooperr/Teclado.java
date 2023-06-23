package Examen2P2_LloydCooperr;

public class Teclado extends Parte {
    private String material;
    private String color;

    public Teclado(String material, String color, int tiempoEnsamblaje) {
        super(tiempoEnsamblaje);
        this.material = material;
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Teclado{" + "material=" + material + ", color=" + color + '}';
    }
    
    
    
}
