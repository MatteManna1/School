import java.time.LocalDate;
public class Autore {
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    
    public Autore(String nome, String cognome, LocalDate dataNascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
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

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
    public String toString() {
        return "Autore [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + "]";
    }
    public boolean compareAutore(Autore autore1){
        return this.nome.equals(autore1.nome) && this.cognome.equals(autore1.cognome) && this.dataNascita.equals(autore1.dataNascita);
    }
    
}
