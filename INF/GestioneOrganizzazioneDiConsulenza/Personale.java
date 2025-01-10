import java.time.LocalDate;

public abstract class Personale {
    protected String codice;
    protected String cognome;
    protected String nome;
    protected int annoAssunzione;
    protected LocalDate oggi= LocalDate.now();

    public Personale(String codice, String cognome, String nome, int annoAssunzione) {
        this.codice = codice;
        this.cognome = cognome;
        this.nome = nome;
        this.annoAssunzione = annoAssunzione;
    }
    
    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnnoAssunzione() {
        return annoAssunzione;
    }

    public void setAnnoAssunzione(int annoAssunzione) {
        this.annoAssunzione = annoAssunzione;
    }

    public LocalDate getOggi() {
        return oggi;
    }

    public void setOggi(LocalDate oggi) {
        this.oggi = oggi;
    }
    
    public abstract double calcolaCostoOrario();

    @Override
    public String toString() {
        return "Personale [codice=" + codice + ", cognome=" + cognome + ", nome=" + nome + ", annoAssunzione="
                + annoAssunzione + "]";
    } 
}