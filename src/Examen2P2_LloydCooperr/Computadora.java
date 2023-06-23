package Examen2P2_LloydCooperr;

import java.awt.Color;

/**
 *
 * @author CUSTOMER PC
 */
public class Computadora {
    private String numeroSerie;
    private String year;
    private Color color;
    private String RAM;
    private String discoDuro;
    private String bateria;
    private String teclado;
    private String pantalla;
    private String procesador;

    public Computadora(String numeroSerie, String year, Color color, String RAM, String discoDuro, String bateria, String teclado, String pantalla, String procesador) {
        this.numeroSerie = numeroSerie;
        this.year = year;
        this.color = color;
        this.RAM = RAM;
        this.discoDuro = discoDuro;
        this.bateria = bateria;
        this.teclado = teclado;
        this.pantalla = pantalla;
        this.procesador = procesador;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computadora{" + "numeroSerie=" + numeroSerie + ", year=" + year + ", color=" + color + ", RAM=" + RAM + ", discoDuro=" + discoDuro + ", bateria=" + bateria + ", teclado=" + teclado + ", pantalla=" + pantalla + ", procesador=" + procesador + '}';
    }
    
    
}
