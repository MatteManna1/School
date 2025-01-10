public class Auto extends Veicolo{
    private String tipologiaAuto;

    public Auto(String targa, String marca, String modello, int nPosti, int nRuote, String tipologiaAuto) {
        super(targa, marca, modello, nPosti, nRuote);
        this.tipologiaAuto = tipologiaAuto;
    }
    public Auto(){
        super();
        this.tipologiaAuto="";
    }

    public String getTipologiaAuto() {
        return tipologiaAuto;
    }
    public void setTipologiaAuto(String tipologiaAuto) {
        this.tipologiaAuto = tipologiaAuto;
    }
    
    public void calcolaCostoAssicurazione(){
        setCostoAssicurazione(getnPosti()*getnRuote()+ 200);
    }

    @Override
    public String toString() {
        return super.toString()+"Auto [tipologiaAuto=" + tipologiaAuto + "]";
    }
}
