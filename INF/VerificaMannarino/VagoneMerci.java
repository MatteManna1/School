public class VagoneMerci extends Vagone{
    private double caricoMassimoInQuintali;
    private double caricoAttuale;

    public VagoneMerci(String matricola, int lunghezzaInCentimetri, double pesoAVuoto, double caricoMassimoInQuintali, double caricoAttuale) throws Exception{
        super(matricola, lunghezzaInCentimetri, pesoAVuoto);
        if(caricoAttuale<=caricoMassimoInQuintali || caricoAttuale<0 || caricoMassimoInQuintali<0){ //errore nei controlli dell'if
        //if(caricoAttuale<=caricoMassimoInQuintali && caricoAttuale>0 && caricoMassimoInQuintali>0) <-- versione corretta
            this.caricoAttuale = caricoAttuale;
            this.caricoMassimoInQuintali = caricoMassimoInQuintali;
        } else{
            throw new Exception("Valore del carico inserito non valido");
        }

    }
    public VagoneMerci(){
        super();
        this.caricoMassimoInQuintali=0;
        this.caricoAttuale=0;
    }

    public double getCaricoMassimoInQuintali() {
        return caricoMassimoInQuintali;
    }

    public void setCaricoMassimoInQuintali(double caricoMassimoInQuintali) {
        this.caricoMassimoInQuintali = caricoMassimoInQuintali;
    }

    public double getCaricoAttuale() {
        return caricoAttuale;
    }

    public void setCaricoAttuale(double caricoAttuale) {
        this.caricoAttuale = caricoAttuale;
    }

    @Override
    public String toString() {
        return super.toString() + "VagoneMerci [caricoMassimoInQuintali=" + caricoMassimoInQuintali + ", caricoAttuale=" + caricoAttuale
                + "]";
    }   
}