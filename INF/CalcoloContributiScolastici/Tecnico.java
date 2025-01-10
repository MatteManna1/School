public class Tecnico extends Superiori{
    public Tecnico(String codiceAlfanumerico, String nome, String indirizzo, String citta, int nStudenti, int nSedi, int nLaboratori, int nClassi) {
        super(codiceAlfanumerico, nome, indirizzo, citta, nStudenti, nSedi, nLaboratori, nClassi);
    }
    public void calcolaContributi(){
        setContributoAnnuale(3500*getnClassi()+6000*getnLaboratori());
    }
    @Override
    public String toString() {
        return super.toString()+"Tecnico []";
    }
    

}
