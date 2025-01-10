public class Professionale extends Superiori{
    public Professionale(String codiceAlfanumerico, String nome, String indirizzo, String citta, int nStudenti, int nSedi, int nLaboratori, int nClassi) {
        super(codiceAlfanumerico, nome, indirizzo, citta, nStudenti, nSedi, nLaboratori, nClassi);
    }

    public void calcolaContributi(){
        setContributoAnnuale(2400*getnClassi()+3000*getnLaboratori());
    }

    @Override
    public String toString() {
        return super.toString()+"Professionale []";
    }
    
}