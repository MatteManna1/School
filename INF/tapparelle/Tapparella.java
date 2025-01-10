public class Tapparella {
    private double altezza;
    private double lunghezza;
    private double apertura;

    public Tapparella(double altezza, double lunghezza) {
        this.altezza = altezza;
        this.lunghezza = lunghezza;
        this.apertura = 0; //inizializzo la tapperella chiusa
    }

    public double getAltezza() {
        return altezza;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getApertura() {
        return apertura;
    }

    public void setApertura(double apertura) {
        this.apertura = apertura;
    }
    
    public String verificaApertura(){
        if(this.apertura>=altezza){
            this.apertura=this.altezza;
            return "La tapparella è completamente alzata";
        } else {
            if(this.apertura<=0){
                this.apertura=0;
                return "La tapperella è completamente abbassata";
            } else {
                return "La tapparella è alzata di "+this.apertura+" centimetri";               
            }
        }
    }
        
    public String tapparellaUp(double centimetri){
        this.apertura+=centimetri;
        return verificaApertura();
    }
    public String tapparellaDown(double centimetri){
        this.apertura-=centimetri;
        return verificaApertura();
    }

    @Override
    public String toString() {
        return "Tapparella [altezza=" + altezza + ", lunghezza=" + lunghezza + ", apertura=" + apertura + "]";
    }

}