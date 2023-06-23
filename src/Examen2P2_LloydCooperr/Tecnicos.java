package Examen2P2_LloydCooperr;

public class Tecnicos {
    private String nombre;
    private String edad;
    private String genero;
    private int cantComputadoras = 0;

    public Tecnicos(String nombre, String edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCantComputadoras() {
        return cantComputadoras;
    }

    public void setCantComputadoras(int cantComputadoras) {
        this.cantComputadoras = cantComputadoras;
    }

    @Override
    public String toString() {
        return "Tecnicos{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", cantComputadoras=" + cantComputadoras + '}';
    }
}
