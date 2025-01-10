public class Moto extends Veicolo{
    private String tipologiaMoto;

    public Moto(String targa, String marca, String modello, int nPosti, int nRuote, String tipologiaMoto) {
        super(targa, marca, modello, nPosti, nRuote);
        this.tipologiaMoto = tipologiaMoto;
    }
    public Moto(){
        super();
        this.tipologiaMoto="";
    }
    public String getTipologiaMoto() {
        return tipologiaMoto;
    }
    public void setTipologiaMoto(String tipologiaMoto) {
        this.tipologiaMoto = tipologiaMoto;
    }
    
    public void calcolaCostoAssicurazione(){
        setCostoAssicurazione(getnPosti()*getnRuote()+150);
    }
    @Override
    public String toString() {
        return super.toString()+"Moto [tipologiaMoto=" + tipologiaMoto + "]";
    }
    
}
