public class Veicolo {
    private int anno;
    private String modello;
    private int velocita_max;

    public Veicolo(int anno, String modello, int velocita_max) {
        this.anno = anno;
        this.modello = modello;
        this.velocita_max = velocita_max;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getVelocita_max() {
        return velocita_max;
    }

    public void setVelocita_max(int velocita_max) {
        this.velocita_max = velocita_max;
    }
    
    @Override
    public String toString() {
        return "Veicolo: anno=" + anno + ", modello=" + modello + ", velocita_max=" + velocita_max;
    }

    

    

    
}
