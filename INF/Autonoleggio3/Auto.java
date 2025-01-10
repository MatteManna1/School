public class Auto extends Veicolo{
    private int nPosti;

    public Auto(String targa, int nMatricola, String marca, String modello, int cilindrata, int annoAcquisto, double capacitaSerbatoio, int nPosti) {
        super(targa, nMatricola, marca, modello, cilindrata, annoAcquisto, capacitaSerbatoio);
        this.nPosti = nPosti;
    }

    public int getnPosti() {
        return nPosti;
    }

    public void setnPosti(int nPosti) {
        this.nPosti = nPosti;
    }

    @Override
    public String toString() {
        return super.toString()+"Auto [nPosti=" + nPosti + "]";
    }
}
