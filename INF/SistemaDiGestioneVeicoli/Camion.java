public class Camion extends Veicolo{
    private double capacitaDiCarico;

    public Camion(String targa, String marca, String modello, int nPosti, int nRuote, double capacitaDiCarico) {
        super(targa, marca, modello, nPosti, nRuote);
        this.capacitaDiCarico=capacitaDiCarico;
    }
    public Camion(){
        super();
        this.capacitaDiCarico=0;
    }

    public double getCapacitaDiCarico() {
        return capacitaDiCarico;
    }
    public void setCapacitaDiCarico(double capacitaDiCarico) {
        this.capacitaDiCarico = capacitaDiCarico;
    }

    public void calcolaCostoAssicurazione(){
        setCostoAssicurazione(capacitaDiCarico*getnPosti()+300);
    }
    @Override
    public String toString() {
        return super.toString()+"Camion [capacitaDiCarico=" + capacitaDiCarico + "]";
    }   

    
}
