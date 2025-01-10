public class Dirigente extends Personale {
    public Dirigente(String codice, String cognome, String nome, int annoAssunzione) {
        super(codice, cognome, nome, annoAssunzione);
    }

    @Override
    public double calcolaCostoOrario() {
        return 100;
    }

    @Override
    public String toString() {
        return super.toString()+"Dirigente []";
    }
    
}