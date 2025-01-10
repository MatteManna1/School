public class Furgone extends Veicolo{
    private double capacitaCarico;

    public Furgone(String targa, int nMatricola, String marca, String modello, int cilindrata, int annoAcquisto, double capacitaSerbatoio, double capacitaCarico) {
        super(targa, nMatricola, marca, modello, cilindrata, annoAcquisto, capacitaSerbatoio);
        this.capacitaCarico = capacitaCarico;
    }

    public double getCapacitaCarico() {
        return capacitaCarico;
    }

    public void setCapacitaCarico(double capacitaCarico) {
        this.capacitaCarico = capacitaCarico;
    }

    @Override
    public String toString() {
        return super.toString()+ "Furgone [capacitaCarico=" + capacitaCarico + "]";
    }
}
