public abstract class Veicolo {
    private String targa;
    private int nMatricola;
    private String marca;
    private String modello;
    private int cilindrata;
    private int annoAcquisto;
    private double capacitaSerbatoio;
    
        public Veicolo(String targa, int nMatricola, String marca, String modello, int cilindrata, int annoAcquisto, double capacitaSerbatoio) {
            this.targa = targa;
            this.nMatricola = nMatricola;
            this.marca = marca;
            this.modello = modello;
            this.cilindrata = cilindrata;
            this.annoAcquisto = annoAcquisto;
            this.capacitaSerbatoio = capacitaSerbatoio;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getnMatricola() {
        return nMatricola;
    }

    public void setnMatricola(int nMatricola) {
        this.nMatricola = nMatricola;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public int getAnnoAcquisto() {
        return annoAcquisto;
    }

    public void setAnnoAcquisto(int annoAcquisto) {
        this.annoAcquisto = annoAcquisto;
    }

    public double getCapacitaSerbatoio() {
        return capacitaSerbatoio;
    }

    public void setCapacitaSerbatoio(double capacitaSerbatoio) {
        this.capacitaSerbatoio = capacitaSerbatoio;
    }

    @Override
    public String toString() {
        return "Veicolo [targa=" + targa + ", nMatricola=" + nMatricola + ", marca=" + marca + ", modello=" + modello
                + ", cilindrata=" + cilindrata + ", annoAcquisto=" + annoAcquisto + ", capacitaSerbatoio="
                + capacitaSerbatoio + "]";
    }

    
}
