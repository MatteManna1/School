import java.time.LocalDate;

public class Passeggero {
    private int codice;
    private String cognome;
    private String nome;
    private LocalDate dataDiNascita;

    public Passeggero(int codice, String cognome, String nome, LocalDate dataDiNascita) {
        this.codice = codice;
        this.cognome = cognome;
        this.nome = nome;
        this.dataDiNascita = dataDiNascita;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
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

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Passeggero [codice=" + codice + ", cognome=" + cognome + ", nome=" + nome + ", dataDiNascita="
                + dataDiNascita + "]";
    }
    
}

    
