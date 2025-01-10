public class TapparellaElettrica extends Tapparella{
    private boolean tasto;

    public TapparellaElettrica(double altezza, double lunghezza, boolean tasto) {
        super(altezza, lunghezza);
        this.tasto = tasto;
    }

    public boolean isTasto() {
        return tasto;
    }

    public void setTasto(boolean tasto) {
        this.tasto = tasto;
    }
    
    @Override
    public String tapparellaUp(double centimetri){
        return super.tapparellaUp(centimetri);
    }
    @Override
    public String tapparellaDown(double centimetri){
        return super.tapparellaDown(centimetri);
    }

    public String tapparellaUpOrDown(boolean tasto){
        if(tasto){
            setApertura(getAltezza());
            return super.verificaApertura();
        } else {
            setApertura(0);
            return super.verificaApertura();
        }
    }

    @Override
    public String toString() {
        return "TapparellaElettrica [tasto=" + tasto + "] " + super.toString();
    }
    
}
