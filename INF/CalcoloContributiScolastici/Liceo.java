public class Liceo extends Superiori {
    public Liceo(String codiceAlfanumerico, String nome, String indirizzo, String citta, int nStudenti, int nSedi, int nLaboratori, int nClassi) {
        super(codiceAlfanumerico, nome, indirizzo, citta, nStudenti, nSedi, nLaboratori, nClassi);
    }

    public void calcolaContributi() {
        setContributoAnnuale(150*getnStudenti() + 1100*getnLaboratori());
    }

    @Override
    public String toString() {
        return super.toString()+"Liceo []";
    }
    
}