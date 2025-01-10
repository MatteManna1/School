public abstract class Superiori extends Scuola{
    public Superiori(String codiceAlfanumerico, String nome, String indirizzo, String citta, int nStudenti, int nSedi, int nLaboratori, int nClassi) {
        super(codiceAlfanumerico, nome, indirizzo, citta, nStudenti, nSedi, nLaboratori, nClassi);
    }

    public abstract void calcolaContributi();

    @Override
    public String toString() {
        return super.toString()+"Superiori []";
    }


    

}
