public class Veicolo {
    private String targa;
    private int codice;
    private String modello;
    private int numero_posti;

    public Veicolo(String targa, String modello, int numero_posti) {
        this.targa = targa;
        this.codice =0;
        this.modello = modello;
        this.numero_posti = numero_posti;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getNumero_posti() {
        return numero_posti;
    }

    public void setNumero_posti(int numero_posti) {
        this.numero_posti = numero_posti;
    }

    @Override
    public String toString() {
        return "Veicolo [targa=" + targa + ", codice=" + codice + ", modello=" + modello + ", numero_posti="
                + numero_posti + "]";
    }
    

    
}
