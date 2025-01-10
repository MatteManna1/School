public abstract class Scuola {
    private String codiceAlfanumerico;
    private String nome;
    private String indirizzo;
    private String citta;
    private int nStudenti;
    private int nSedi;
    private int nLaboratori;
    private int nClassi;
    private double contributoAnnuale;

    public Scuola(String codiceAlfanumerico, String nome, String indirizzo, String citta, int nStudenti, int nSedi,
            int nLaboratori, int nClassi) {
        this.codiceAlfanumerico = codiceAlfanumerico;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.citta = citta;
        this.nStudenti = nStudenti;
        this.nSedi = nSedi;
        this.nLaboratori = nLaboratori;
        this.nClassi = nClassi;
        this.contributoAnnuale = 0;
    }

    public String getCodiceAlfanumerico() {
        return codiceAlfanumerico;
    }

    public void setCodiceAlfanumerico(String codiceAlfanumerico) {
        this.codiceAlfanumerico = codiceAlfanumerico;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public int getnStudenti() {
        return nStudenti;
    }

    public void setnStudenti(int nStudenti) {
        this.nStudenti = nStudenti;
    }

    public int getnSedi() {
        return nSedi;
    }

    public void setnSedi(int nSedi) {
        this.nSedi = nSedi;
    }

    public int getnLaboratori() {
        return nLaboratori;
    }

    public void setnLaboratori(int nLaboratori) {
        this.nLaboratori = nLaboratori;
    }

    public double getContributoAnnuale() {
        return contributoAnnuale;
    }

    public void setContributoAnnuale(double contributoAnnuale) {
        this.contributoAnnuale = contributoAnnuale;
    }

    public int getnClassi() {
        return nClassi;
    }

    public void setnClassi(int nClassi) {
        this.nClassi = nClassi;
    }
    
    public abstract void calcolaContributi();

    public void aggiunginStudenti(int n){
        setnStudenti(getnStudenti()+n);
        calcolaContributi();
    }
    public void aggiunginSedi(int n){
        setnSedi(getnSedi()+n);
        calcolaContributi();
    }
    public void aggiunginLaboratori(int n){
        setnLaboratori(getnLaboratori()+n);
        calcolaContributi();
    }
    public void aggiunginClassi(int n){
        setnClassi(getnClassi()+n);
        calcolaContributi();
    }

    @Override
    public String toString() {
        return "Scuola [codiceAlfanumerico=" + codiceAlfanumerico + ", nome=" + nome + ", indirizzo=" + indirizzo
                + ", citta=" + citta + ", nStudenti=" + nStudenti + ", nSedi=" + nSedi + ", nLaboratori=" + nLaboratori
                + ", nClassi=" + nClassi + ", contributoAnnuale=" + contributoAnnuale + "]";
    }
    
}