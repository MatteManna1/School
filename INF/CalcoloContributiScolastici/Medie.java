public class Medie extends Scuola{
    public Medie(String codiceAlfanumerico, String nome, String indirizzo, String citta, int nStudenti, int nSedi, int nLaboratori, int nClassi) {
        super(codiceAlfanumerico, nome, indirizzo, citta, nStudenti, nSedi, nLaboratori, nClassi);
    }
    public void calcolaContributi(){
        setContributoAnnuale(150*getnStudenti() + 1100*getnLaboratori() + 9000*getnSedi());
    }
    @Override
    public String toString() {
        return super.toString()+"Medie []";
    }

}
