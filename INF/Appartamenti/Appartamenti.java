package INF.Appartamenti;
public class Appartamenti extends Abitazioni{
    private String piano;
    private boolean raggiungibile_tramite_ascensore;
    private int nTerrazzi;

    public Appartamenti(int nStanze, double superficie, String indirizzo, String citta, String piano,
            boolean raggiungibile_tramite_ascensore, int nTerrazzi) {
        super(nStanze, superficie, indirizzo, citta);
        this.piano = piano;
        this.raggiungibile_tramite_ascensore = raggiungibile_tramite_ascensore;
        this.nTerrazzi = nTerrazzi;
    }

    public String getPiano() {
        return piano;
    }

    public void setPiano(String piano) {
        this.piano = piano;
    }

    public boolean isRaggiungibile_tramite_ascensore() {
        return raggiungibile_tramite_ascensore;
    }

    public void setRaggiungibile_tramite_ascensore(boolean raggiungibile_tramite_ascensore) {
        this.raggiungibile_tramite_ascensore = raggiungibile_tramite_ascensore;
    }

    public int getnTerrazzi() {
        return nTerrazzi;
    }

    public void setnTerrazzi(int nTerrazzi) {
        this.nTerrazzi = nTerrazzi;
    }

    @Override
    public String toString() {
        return super.toString()+ "Appartamenti [piano=" + piano + ", raggiungibile_tramite_ascensore=" + raggiungibile_tramite_ascensore
                + ", nTerrazzi=" + nTerrazzi + "]";
    }

    public double calcolaSuperficieTotale(){
        return getSuperficie();
    }
    

    
    
}
