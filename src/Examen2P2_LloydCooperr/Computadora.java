package Examen2P2_LloydCooperr;

import java.util.ArrayList;

public class Computadora {
    private String numeroSerie;
    private String year;
    private String color;
    private String material;
    private ArrayList<Parte> partes = new ArrayList();

    public Computadora(String numeroSerie, String year, String color, String material, ArrayList <Parte> partes) {
        this.numeroSerie = numeroSerie;
        this.year = year;
        this.color = color;
        this.material = material;
        this.partes = partes;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ArrayList<Parte> getPartes() {
        return partes;
    }

    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }

    @Override
    public String toString() {
        return "Computadora{" + "numeroSerie=" + numeroSerie + ", year=" + year + ", color=" + color + ", material=" + material + ", partes=" + partes + '}';
    }
    
    
}
