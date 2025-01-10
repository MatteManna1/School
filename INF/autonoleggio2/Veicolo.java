public class Veicolo {
    private String targa;
    private String marca;
    private String modello;
    private int numero_posti;
    private int codice;

    public Veicolo(String targa, String marca, String modello, int numero_posti, int codice) {
        this.targa = targa;
        this.marca = marca;
        this.modello = modello;
        this.numero_posti = numero_posti;
        this.codice = codice;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String traga) {
        this.targa = traga;
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

    public int getNumero_posti() {
        return numero_posti;
    }

    public void setNumero_posti(int numero_posti) {
        this.numero_posti = numero_posti;
    }
    
    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }


    @Override
    public String toString() {
        return "Veicolo [targa=" + targa + ", marca=" + marca + ", modello=" + modello + ", numero_posti="
                + numero_posti + ", codice=" + codice + "]";
    }
    
}