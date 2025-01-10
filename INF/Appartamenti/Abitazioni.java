package INF.Appartamenti;
public abstract class Abitazioni {
    private int nStanze;
    private double superficie;
    private String indirizzo;
    private String citta;

    public Abitazioni(int nStanze, double superficie, String indirizzo, String citta) {
        this.nStanze = nStanze;
        this.superficie = superficie;
        this.indirizzo = indirizzo;
        this.citta = citta;    
    }

    public int getnStanze() {
        return nStanze;
    }

    public void setnStanze(int nStanze) {
        this.nStanze = nStanze;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Abitazioni [nStanze=" + nStanze + ", superficie=" + superficie + ", indirizzo=" + indirizzo + ", citta="
                + citta + "]";
    }

    public abstract double calcolaSuperficieTotale();
    
}