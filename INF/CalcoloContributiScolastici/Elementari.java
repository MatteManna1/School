public class Elementari extends Scuola{
    public Elementari(String codiceAlfanumerico, String nome, String indirizzo, String citta, int nStudenti, int nSedi, int nLaboratori, int nClassi) {
        super(codiceAlfanumerico, nome, indirizzo, citta, nStudenti, nSedi, nLaboratori, nClassi);
    }
    public void calcolaContributi(){
        setContributoAnnuale(125*getnStudenti()+9000*getnSedi());
    }
    @Override
    public String toString() {
        return super.toString()+"Elementari []";
    }

    
}
