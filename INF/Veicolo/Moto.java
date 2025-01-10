public class Moto extends Veicolo{
    private boolean bagagliaio;

    public Moto(int anno, String modello, int velocita_max, boolean bagagliaio) {
        super(anno, modello, velocita_max);
        this.bagagliaio = bagagliaio;
    }

    public boolean isBagagliaio() {
        return bagagliaio;
    }

    public void setBagagliaio(boolean bagagliaio) {
        this.bagagliaio = bagagliaio;
    }

    @Override
    public String toString() { //si puo anche fare senza super. 
        return (super.toString() + ", bagagliaio="+bagagliaio);
    }
    
    //ricordarsi significato di override e overload
    
}
