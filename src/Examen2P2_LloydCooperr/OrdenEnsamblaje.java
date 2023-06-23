package Examen2P2_LloydCooperr;

public class OrdenEnsamblaje {
    Computadora compu;
    Tecnicos tecnico;

    public OrdenEnsamblaje(Computadora compu, Tecnicos tecnico) {
        this.compu = compu;
        this.tecnico = tecnico;
    }

    public Computadora getCompu() {
        return compu;
    }

    public void setCompu(Computadora compu) {
        this.compu = compu;
    }

    public Tecnicos getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnicos tecnico) {
        this.tecnico = tecnico;
    }
    
    
}
