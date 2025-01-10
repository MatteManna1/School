public abstract class Veicolo { 
    private String targa;
    private String marca;
    private String modello;
    private int nPosti;
    private int nRuote;
    private double costoAssicurazione;

    public Veicolo(String targa, String marca, String modello, int nPosti, int nRuote) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.nPosti = nPosti;
        this.nRuote = nRuote;
        this.costoAssicurazione=0;
    }
    

    public Veicolo() {
        this.targa = "";
        this.marca = "";
        this.modello = "";
        this.nPosti = 0;
        this.nRuote = 0;
        this.costoAssicurazione=0;
    }


    public String getTarga() {
        return targa;
    }
    public void setTarga(String targa) {
        this.targa = targa;
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
    public int getnPosti() {
        return nPosti;
    }
    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }
    public int getnRuote() {
        return nRuote;
    }
    public void setnRuote(int nRuote) {
        this.nRuote = nRuote;
    }
    public double getCostoAssicurazione() {
        return costoAssicurazione;
    }
    public void setCostoAssicurazione(double costoAssicurazione) {
        this.costoAssicurazione = costoAssicurazione;
    }    
    
    public abstract void calcolaCostoAssicurazione();

    @Override
    public String toString() {
        return "Veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", nPosti=" + nPosti
                + ", nRuote=" + nRuote + ", costoAssicurazione="+ costoAssicurazione + "]";
    }
    
}