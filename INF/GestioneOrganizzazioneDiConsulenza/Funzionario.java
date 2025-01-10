public class Funzionario extends Personale {
    private boolean isSenior;

    public Funzionario(String codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
        this.isSenior = (oggi.getYear() - annoAssunzione) > 10;
    }

    public boolean isSenior() {
        return isSenior;
    }

    public void setSenior(boolean isSenior) {
        this.isSenior = isSenior;
    }
    
    @Override
    public double calcolaCostoOrario() {
        if(isSenior){
            return 80;
        }
        return 70;
    }

    @Override
    public String toString() {
        return super.toString()+"Funzionario [isSenior=" + isSenior + "]";
    }
    
}