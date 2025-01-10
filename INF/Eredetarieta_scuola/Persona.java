public class Persona {
    private int codice;
    private String nome;
    private String cognome;
    private String codice_fiscale;
    private static int count = 0;

    public Persona(String nome, String cognome, String codice_fiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice_fiscale = codice_fiscale;
        this.codice=count;
        count++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodice_fiscale() {
        return codice_fiscale;
    }

    public void setCodice_fiscale(String codice_fiscale) {
        this.codice_fiscale = codice_fiscale;
    }
    

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    @Override
    public String toString() {
        return "Persona [codice=" + codice + ", nome=" + nome + ", cognome=" + cognome + ", codice_fiscale="
                + codice_fiscale + "]";
    }

      
}
